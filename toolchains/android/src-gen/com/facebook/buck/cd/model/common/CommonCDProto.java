// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.facebook.buck.cd.model.common;

@javax.annotation.Generated(value="protoc", comments="annotations:CommonCDProto.java.pb.meta")
public final class CommonCDProto {
  private CommonCDProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RelPathMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RelPathMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostBuildParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostBuildParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\"-\n\017RelPathMapEntry\022\013\n\003key" +
      "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\"\203\002\n\017PostBuildParam" +
      "s\022\022\n\nlibraryJar\030\001 \001(\t\022\016\n\006abiJar\030\002 \001(\t\022\021\n" +
      "\tjvmAbiGen\030\004 \001(\t\022\024\n\014abiOutputDir\030\005 \001(\t\022\023" +
      "\n\013usedClasses\030\006 \003(\t\022\017\n\007depFile\030\007 \001(\t\022\026\n\016" +
      "jarToJarDirMap\030\010 \001(\t\022\024\n\014optionalDirs\030\t \003" +
      "(\t\022\033\n\023incrementalStateDir\030\n \001(\t\022\034\n\024shoul" +
      "dCreateClassAbi\030\013 \001(\010\022\024\n\014usedJarsFile\030\014 " +
      "\001(\tB4\n!com.facebook.buck.cd.model.common" +
      "B\rCommonCDProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_RelPathMapEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RelPathMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RelPathMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_PostBuildParams_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PostBuildParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostBuildParams_descriptor,
        new java.lang.String[] { "LibraryJar", "AbiJar", "JvmAbiGen", "AbiOutputDir", "UsedClasses", "DepFile", "JarToJarDirMap", "OptionalDirs", "IncrementalStateDir", "ShouldCreateClassAbi", "UsedJarsFile", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
