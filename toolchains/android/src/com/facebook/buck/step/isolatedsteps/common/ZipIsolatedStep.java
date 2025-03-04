/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under both the MIT license found in the
 * LICENSE-MIT file in the root directory of this source tree and the Apache
 * License, Version 2.0 found in the LICENSE-APACHE file in the root directory
 * of this source tree.
 */

package com.facebook.buck.step.isolatedsteps.common;

import static com.facebook.buck.util.zip.ZipOutputStreams.HandleDuplicates.THROW_EXCEPTION;

import com.facebook.buck.core.build.execution.context.IsolatedExecutionContext;
import com.facebook.buck.core.filesystems.AbsPath;
import com.facebook.buck.core.util.immutables.BuckStyleValue;
import com.facebook.buck.io.file.PathMatcher;
import com.facebook.buck.io.filesystem.impl.ProjectFilesystemUtils;
import com.facebook.buck.step.StepExecutionResult;
import com.facebook.buck.step.StepExecutionResults;
import com.facebook.buck.step.isolatedsteps.IsolatedStep;
import com.facebook.buck.util.types.Pair;
import com.facebook.buck.util.zip.CustomZipEntry;
import com.facebook.buck.util.zip.CustomZipOutputStream;
import com.facebook.buck.util.zip.Zip;
import com.facebook.buck.util.zip.ZipCompressionLevel;
import com.facebook.buck.util.zip.ZipOutputStreams;
import com.google.common.collect.ImmutableSet;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

/**
 * Creates or updates a zip archive.
 *
 * <p>Note that paths added to the archive are always relative to the working directory.<br>
 * For example, if you're in {@code /dir} and you add {@code file.txt}, you get an archive
 * containing just the file. If you were in {@code /} and added {@code dir/file.txt}, you would get
 * an archive containing the file within a directory.
 */
@BuckStyleValue
public abstract class ZipIsolatedStep implements IsolatedStep {

  abstract AbsPath getRootPath();

  abstract Path getPathToZipFile();

  abstract ImmutableSet<PathMatcher> getIgnoredPaths();

  abstract ImmutableSet<Path> getPaths();

  abstract boolean getJunkPaths();

  abstract ZipCompressionLevel getZipCompressionLevel();

  abstract Path getBaseDir();

  @Override
  public StepExecutionResult executeIsolatedStep(IsolatedExecutionContext context)
      throws IOException, InterruptedException {
    if (ProjectFilesystemUtils.exists(getRootPath(), getPathToZipFile())) {
      throw new RuntimeException(
          String.format("Attempting to overwrite an existing zip: %s", getPathToZipFile()));
    }

    Map<String, Pair<CustomZipEntry, Optional<Path>>> entries = new TreeMap<>();

    try (BufferedOutputStream baseOut =
            new BufferedOutputStream(
                ProjectFilesystemUtils.newFileOutputStream(getRootPath(), getPathToZipFile()));
        CustomZipOutputStream out = ZipOutputStreams.newOutputStream(baseOut, THROW_EXCEPTION)) {
      /* TODO: Make this logic to avoid using exceptions.
       * If walking the file directory throws, then an empty jar file is still created.
       */
      Zip.walkBaseDirectoryToCreateEntries(
          getRootPath(),
          entries,
          getBaseDir(),
          getIgnoredPaths(),
          getPaths(),
          getJunkPaths(),
          getZipCompressionLevel());
      Zip.writeEntriesToZip(getRootPath(), out, entries);
    }
    return StepExecutionResults.SUCCESS;
  }

  @Override
  public String getIsolatedStepDescription(IsolatedExecutionContext context) {
    StringBuilder args = new StringBuilder("zip ");

    // Don't add extra fields, neither do the Android tools.
    args.append("-X ");

    // recurse
    args.append("-r ");

    // compression level
    args.append("-").append(getZipCompressionLevel()).append(" ");

    // junk paths
    if (getJunkPaths()) {
      args.append("-j ");
    }

    // destination archive
    args.append(getPathToZipFile()).append(" ");

    // files to add to archive
    if (getPaths().isEmpty()) {
      // Add the contents of workingDirectory to archive.
      args.append("-i* ");
      args.append(". ");
    } else {
      // Add specified paths, relative to workingDirectory.
      for (Path path : getPaths()) {
        args.append(path).append(" ");
      }
    }

    return args.toString();
  }

  @Override
  public String getShortName() {
    return "zip";
  }

  public static ZipIsolatedStep of(
      AbsPath rootPath,
      Path pathToZipFile,
      ImmutableSet<PathMatcher> ignoredPaths,
      ImmutableSet<Path> paths,
      boolean junkPaths,
      ZipCompressionLevel compressionLevel,
      Path baseDir) {
    return ImmutableZipIsolatedStep.ofImpl(
        rootPath, pathToZipFile, ignoredPaths, paths, junkPaths, compressionLevel, baseDir);
  }
}
