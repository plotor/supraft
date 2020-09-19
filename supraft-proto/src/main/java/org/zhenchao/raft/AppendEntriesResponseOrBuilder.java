// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package org.zhenchao.raft;

public interface AppendEntriesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.zhenchao.raft.AppendEntriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required bool success = 1;</code>
   */
  boolean hasSuccess();
  /**
   * <code>required bool success = 1;</code>
   */
  boolean getSuccess();

  /**
   * <code>required int64 term = 2;</code>
   */
  boolean hasTerm();
  /**
   * <code>required int64 term = 2;</code>
   */
  long getTerm();

  /**
   * <code>optional int64 lastLogIndex = 3;</code>
   */
  boolean hasLastLogIndex();
  /**
   * <code>optional int64 lastLogIndex = 3;</code>
   */
  long getLastLogIndex();

  /**
   * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 4;</code>
   */
  boolean hasErrorInfo();
  /**
   * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 4;</code>
   */
  org.zhenchao.raft.ErrorInfo getErrorInfo();
  /**
   * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 4;</code>
   */
  org.zhenchao.raft.ErrorInfoOrBuilder getErrorInfoOrBuilder();
}
