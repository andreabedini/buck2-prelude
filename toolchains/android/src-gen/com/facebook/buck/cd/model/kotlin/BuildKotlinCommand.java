// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kotlincd.proto

package com.facebook.buck.cd.model.kotlin;

/**
 * Protobuf type {@code kotlincd.api.v1.BuildKotlinCommand}
 */
@javax.annotation.Generated(value="protoc", comments="annotations:BuildKotlinCommand.java.pb.meta")
public  final class BuildKotlinCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kotlincd.api.v1.BuildKotlinCommand)
    BuildKotlinCommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildKotlinCommand.newBuilder() to construct.
  private BuildKotlinCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildKotlinCommand() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuildKotlinCommand(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.facebook.buck.cd.model.kotlin.BuildCommand.Builder subBuilder = null;
            if (buildCommand_ != null) {
              subBuilder = buildCommand_.toBuilder();
            }
            buildCommand_ = input.readMessage(com.facebook.buck.cd.model.kotlin.BuildCommand.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(buildCommand_);
              buildCommand_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.facebook.buck.cd.model.common.PostBuildParams.Builder subBuilder = null;
            if (postBuildParams_ != null) {
              subBuilder = postBuildParams_.toBuilder();
            }
            postBuildParams_ = input.readMessage(com.facebook.buck.cd.model.common.PostBuildParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(postBuildParams_);
              postBuildParams_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.facebook.buck.cd.model.kotlin.KotlinCDProto.internal_static_kotlincd_api_v1_BuildKotlinCommand_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.facebook.buck.cd.model.kotlin.KotlinCDProto.internal_static_kotlincd_api_v1_BuildKotlinCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.facebook.buck.cd.model.kotlin.BuildKotlinCommand.class, com.facebook.buck.cd.model.kotlin.BuildKotlinCommand.Builder.class);
  }

  public static final int BUILDCOMMAND_FIELD_NUMBER = 1;
  private com.facebook.buck.cd.model.kotlin.BuildCommand buildCommand_;
  /**
   * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
   */
  public boolean hasBuildCommand() {
    return buildCommand_ != null;
  }
  /**
   * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
   */
  public com.facebook.buck.cd.model.kotlin.BuildCommand getBuildCommand() {
    return buildCommand_ == null ? com.facebook.buck.cd.model.kotlin.BuildCommand.getDefaultInstance() : buildCommand_;
  }
  /**
   * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
   */
  public com.facebook.buck.cd.model.kotlin.BuildCommandOrBuilder getBuildCommandOrBuilder() {
    return getBuildCommand();
  }

  public static final int POSTBUILDPARAMS_FIELD_NUMBER = 2;
  private com.facebook.buck.cd.model.common.PostBuildParams postBuildParams_;
  /**
   * <code>.PostBuildParams postBuildParams = 2;</code>
   */
  public boolean hasPostBuildParams() {
    return postBuildParams_ != null;
  }
  /**
   * <code>.PostBuildParams postBuildParams = 2;</code>
   */
  public com.facebook.buck.cd.model.common.PostBuildParams getPostBuildParams() {
    return postBuildParams_ == null ? com.facebook.buck.cd.model.common.PostBuildParams.getDefaultInstance() : postBuildParams_;
  }
  /**
   * <code>.PostBuildParams postBuildParams = 2;</code>
   */
  public com.facebook.buck.cd.model.common.PostBuildParamsOrBuilder getPostBuildParamsOrBuilder() {
    return getPostBuildParams();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (buildCommand_ != null) {
      output.writeMessage(1, getBuildCommand());
    }
    if (postBuildParams_ != null) {
      output.writeMessage(2, getPostBuildParams());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (buildCommand_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBuildCommand());
    }
    if (postBuildParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPostBuildParams());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.facebook.buck.cd.model.kotlin.BuildKotlinCommand)) {
      return super.equals(obj);
    }
    com.facebook.buck.cd.model.kotlin.BuildKotlinCommand other = (com.facebook.buck.cd.model.kotlin.BuildKotlinCommand) obj;

    if (hasBuildCommand() != other.hasBuildCommand()) return false;
    if (hasBuildCommand()) {
      if (!getBuildCommand()
          .equals(other.getBuildCommand())) return false;
    }
    if (hasPostBuildParams() != other.hasPostBuildParams()) return false;
    if (hasPostBuildParams()) {
      if (!getPostBuildParams()
          .equals(other.getPostBuildParams())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBuildCommand()) {
      hash = (37 * hash) + BUILDCOMMAND_FIELD_NUMBER;
      hash = (53 * hash) + getBuildCommand().hashCode();
    }
    if (hasPostBuildParams()) {
      hash = (37 * hash) + POSTBUILDPARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getPostBuildParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.facebook.buck.cd.model.kotlin.BuildKotlinCommand prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code kotlincd.api.v1.BuildKotlinCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kotlincd.api.v1.BuildKotlinCommand)
      com.facebook.buck.cd.model.kotlin.BuildKotlinCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.facebook.buck.cd.model.kotlin.KotlinCDProto.internal_static_kotlincd_api_v1_BuildKotlinCommand_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.facebook.buck.cd.model.kotlin.KotlinCDProto.internal_static_kotlincd_api_v1_BuildKotlinCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.facebook.buck.cd.model.kotlin.BuildKotlinCommand.class, com.facebook.buck.cd.model.kotlin.BuildKotlinCommand.Builder.class);
    }

    // Construct using com.facebook.buck.cd.model.kotlin.BuildKotlinCommand.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (buildCommandBuilder_ == null) {
        buildCommand_ = null;
      } else {
        buildCommand_ = null;
        buildCommandBuilder_ = null;
      }
      if (postBuildParamsBuilder_ == null) {
        postBuildParams_ = null;
      } else {
        postBuildParams_ = null;
        postBuildParamsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.facebook.buck.cd.model.kotlin.KotlinCDProto.internal_static_kotlincd_api_v1_BuildKotlinCommand_descriptor;
    }

    @java.lang.Override
    public com.facebook.buck.cd.model.kotlin.BuildKotlinCommand getDefaultInstanceForType() {
      return com.facebook.buck.cd.model.kotlin.BuildKotlinCommand.getDefaultInstance();
    }

    @java.lang.Override
    public com.facebook.buck.cd.model.kotlin.BuildKotlinCommand build() {
      com.facebook.buck.cd.model.kotlin.BuildKotlinCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.facebook.buck.cd.model.kotlin.BuildKotlinCommand buildPartial() {
      com.facebook.buck.cd.model.kotlin.BuildKotlinCommand result = new com.facebook.buck.cd.model.kotlin.BuildKotlinCommand(this);
      if (buildCommandBuilder_ == null) {
        result.buildCommand_ = buildCommand_;
      } else {
        result.buildCommand_ = buildCommandBuilder_.build();
      }
      if (postBuildParamsBuilder_ == null) {
        result.postBuildParams_ = postBuildParams_;
      } else {
        result.postBuildParams_ = postBuildParamsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.facebook.buck.cd.model.kotlin.BuildKotlinCommand) {
        return mergeFrom((com.facebook.buck.cd.model.kotlin.BuildKotlinCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.facebook.buck.cd.model.kotlin.BuildKotlinCommand other) {
      if (other == com.facebook.buck.cd.model.kotlin.BuildKotlinCommand.getDefaultInstance()) return this;
      if (other.hasBuildCommand()) {
        mergeBuildCommand(other.getBuildCommand());
      }
      if (other.hasPostBuildParams()) {
        mergePostBuildParams(other.getPostBuildParams());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.facebook.buck.cd.model.kotlin.BuildKotlinCommand parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.facebook.buck.cd.model.kotlin.BuildKotlinCommand) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.facebook.buck.cd.model.kotlin.BuildCommand buildCommand_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.kotlin.BuildCommand, com.facebook.buck.cd.model.kotlin.BuildCommand.Builder, com.facebook.buck.cd.model.kotlin.BuildCommandOrBuilder> buildCommandBuilder_;
    /**
     * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
     */
    public boolean hasBuildCommand() {
      return buildCommandBuilder_ != null || buildCommand_ != null;
    }
    /**
     * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
     */
    public com.facebook.buck.cd.model.kotlin.BuildCommand getBuildCommand() {
      if (buildCommandBuilder_ == null) {
        return buildCommand_ == null ? com.facebook.buck.cd.model.kotlin.BuildCommand.getDefaultInstance() : buildCommand_;
      } else {
        return buildCommandBuilder_.getMessage();
      }
    }
    /**
     * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
     */
    public Builder setBuildCommand(com.facebook.buck.cd.model.kotlin.BuildCommand value) {
      if (buildCommandBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        buildCommand_ = value;
        onChanged();
      } else {
        buildCommandBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
     */
    public Builder setBuildCommand(
        com.facebook.buck.cd.model.kotlin.BuildCommand.Builder builderForValue) {
      if (buildCommandBuilder_ == null) {
        buildCommand_ = builderForValue.build();
        onChanged();
      } else {
        buildCommandBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
     */
    public Builder mergeBuildCommand(com.facebook.buck.cd.model.kotlin.BuildCommand value) {
      if (buildCommandBuilder_ == null) {
        if (buildCommand_ != null) {
          buildCommand_ =
            com.facebook.buck.cd.model.kotlin.BuildCommand.newBuilder(buildCommand_).mergeFrom(value).buildPartial();
        } else {
          buildCommand_ = value;
        }
        onChanged();
      } else {
        buildCommandBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
     */
    public Builder clearBuildCommand() {
      if (buildCommandBuilder_ == null) {
        buildCommand_ = null;
        onChanged();
      } else {
        buildCommand_ = null;
        buildCommandBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
     */
    public com.facebook.buck.cd.model.kotlin.BuildCommand.Builder getBuildCommandBuilder() {
      
      onChanged();
      return getBuildCommandFieldBuilder().getBuilder();
    }
    /**
     * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
     */
    public com.facebook.buck.cd.model.kotlin.BuildCommandOrBuilder getBuildCommandOrBuilder() {
      if (buildCommandBuilder_ != null) {
        return buildCommandBuilder_.getMessageOrBuilder();
      } else {
        return buildCommand_ == null ?
            com.facebook.buck.cd.model.kotlin.BuildCommand.getDefaultInstance() : buildCommand_;
      }
    }
    /**
     * <code>.kotlincd.api.v1.BuildCommand buildCommand = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.kotlin.BuildCommand, com.facebook.buck.cd.model.kotlin.BuildCommand.Builder, com.facebook.buck.cd.model.kotlin.BuildCommandOrBuilder> 
        getBuildCommandFieldBuilder() {
      if (buildCommandBuilder_ == null) {
        buildCommandBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.facebook.buck.cd.model.kotlin.BuildCommand, com.facebook.buck.cd.model.kotlin.BuildCommand.Builder, com.facebook.buck.cd.model.kotlin.BuildCommandOrBuilder>(
                getBuildCommand(),
                getParentForChildren(),
                isClean());
        buildCommand_ = null;
      }
      return buildCommandBuilder_;
    }

    private com.facebook.buck.cd.model.common.PostBuildParams postBuildParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.common.PostBuildParams, com.facebook.buck.cd.model.common.PostBuildParams.Builder, com.facebook.buck.cd.model.common.PostBuildParamsOrBuilder> postBuildParamsBuilder_;
    /**
     * <code>.PostBuildParams postBuildParams = 2;</code>
     */
    public boolean hasPostBuildParams() {
      return postBuildParamsBuilder_ != null || postBuildParams_ != null;
    }
    /**
     * <code>.PostBuildParams postBuildParams = 2;</code>
     */
    public com.facebook.buck.cd.model.common.PostBuildParams getPostBuildParams() {
      if (postBuildParamsBuilder_ == null) {
        return postBuildParams_ == null ? com.facebook.buck.cd.model.common.PostBuildParams.getDefaultInstance() : postBuildParams_;
      } else {
        return postBuildParamsBuilder_.getMessage();
      }
    }
    /**
     * <code>.PostBuildParams postBuildParams = 2;</code>
     */
    public Builder setPostBuildParams(com.facebook.buck.cd.model.common.PostBuildParams value) {
      if (postBuildParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        postBuildParams_ = value;
        onChanged();
      } else {
        postBuildParamsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.PostBuildParams postBuildParams = 2;</code>
     */
    public Builder setPostBuildParams(
        com.facebook.buck.cd.model.common.PostBuildParams.Builder builderForValue) {
      if (postBuildParamsBuilder_ == null) {
        postBuildParams_ = builderForValue.build();
        onChanged();
      } else {
        postBuildParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.PostBuildParams postBuildParams = 2;</code>
     */
    public Builder mergePostBuildParams(com.facebook.buck.cd.model.common.PostBuildParams value) {
      if (postBuildParamsBuilder_ == null) {
        if (postBuildParams_ != null) {
          postBuildParams_ =
            com.facebook.buck.cd.model.common.PostBuildParams.newBuilder(postBuildParams_).mergeFrom(value).buildPartial();
        } else {
          postBuildParams_ = value;
        }
        onChanged();
      } else {
        postBuildParamsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.PostBuildParams postBuildParams = 2;</code>
     */
    public Builder clearPostBuildParams() {
      if (postBuildParamsBuilder_ == null) {
        postBuildParams_ = null;
        onChanged();
      } else {
        postBuildParams_ = null;
        postBuildParamsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.PostBuildParams postBuildParams = 2;</code>
     */
    public com.facebook.buck.cd.model.common.PostBuildParams.Builder getPostBuildParamsBuilder() {
      
      onChanged();
      return getPostBuildParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.PostBuildParams postBuildParams = 2;</code>
     */
    public com.facebook.buck.cd.model.common.PostBuildParamsOrBuilder getPostBuildParamsOrBuilder() {
      if (postBuildParamsBuilder_ != null) {
        return postBuildParamsBuilder_.getMessageOrBuilder();
      } else {
        return postBuildParams_ == null ?
            com.facebook.buck.cd.model.common.PostBuildParams.getDefaultInstance() : postBuildParams_;
      }
    }
    /**
     * <code>.PostBuildParams postBuildParams = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.common.PostBuildParams, com.facebook.buck.cd.model.common.PostBuildParams.Builder, com.facebook.buck.cd.model.common.PostBuildParamsOrBuilder> 
        getPostBuildParamsFieldBuilder() {
      if (postBuildParamsBuilder_ == null) {
        postBuildParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.facebook.buck.cd.model.common.PostBuildParams, com.facebook.buck.cd.model.common.PostBuildParams.Builder, com.facebook.buck.cd.model.common.PostBuildParamsOrBuilder>(
                getPostBuildParams(),
                getParentForChildren(),
                isClean());
        postBuildParams_ = null;
      }
      return postBuildParamsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:kotlincd.api.v1.BuildKotlinCommand)
  }

  // @@protoc_insertion_point(class_scope:kotlincd.api.v1.BuildKotlinCommand)
  private static final com.facebook.buck.cd.model.kotlin.BuildKotlinCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.facebook.buck.cd.model.kotlin.BuildKotlinCommand();
  }

  public static com.facebook.buck.cd.model.kotlin.BuildKotlinCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildKotlinCommand>
      PARSER = new com.google.protobuf.AbstractParser<BuildKotlinCommand>() {
    @java.lang.Override
    public BuildKotlinCommand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuildKotlinCommand(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuildKotlinCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildKotlinCommand> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.facebook.buck.cd.model.kotlin.BuildKotlinCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

