// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: javacd.proto

package com.facebook.buck.cd.model.java;

@javax.annotation.Generated(value="protoc", comments="annotations:BuildTargetValueOrBuilder.java.pb.meta")
public interface BuildTargetValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:javacd.api.v1.BuildTargetValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fullyQualifiedName = 1;</code>
   */
  java.lang.String getFullyQualifiedName();
  /**
   * <code>string fullyQualifiedName = 1;</code>
   */
  com.google.protobuf.ByteString
      getFullyQualifiedNameBytes();

  /**
   * <code>.javacd.api.v1.BuildTargetValue.Type type = 2;</code>
   */
  int getTypeValue();
  /**
   * <code>.javacd.api.v1.BuildTargetValue.Type type = 2;</code>
   */
  com.facebook.buck.cd.model.java.BuildTargetValue.Type getType();

  /**
   * <code>string buildTargetConfigHash = 3;</code>
   */
  java.lang.String getBuildTargetConfigHash();
  /**
   * <code>string buildTargetConfigHash = 3;</code>
   */
  com.google.protobuf.ByteString
      getBuildTargetConfigHashBytes();
}
