// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package org.zhenchao.raft;

public interface EndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.zhenchao.raft.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required string ip = 1;</code>
   */
  boolean hasIp();
  /**
   * <code>required string ip = 1;</code>
   */
  java.lang.String getIp();
  /**
   * <code>required string ip = 1;</code>
   */
  com.google.protobuf.ByteString
      getIpBytes();

  /**
   * <code>required int32 port = 2;</code>
   */
  boolean hasPort();
  /**
   * <code>required int32 port = 2;</code>
   */
  int getPort();
}
