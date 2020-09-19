// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package org.zhenchao.raft;

/**
 * Protobuf type {@code org.zhenchao.raft.RequestVoteResponse}
 */
public final class RequestVoteResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:org.zhenchao.raft.RequestVoteResponse)
    RequestVoteResponseOrBuilder {
  // Use RequestVoteResponse.newBuilder() to construct.
  private RequestVoteResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private RequestVoteResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final RequestVoteResponse defaultInstance;
  public static RequestVoteResponse getDefaultInstance() {
    return defaultInstance;
  }

  public RequestVoteResponse getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private RequestVoteResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
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
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            term_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            granted_ = input.readBool();
            break;
          }
          case 26: {
            org.zhenchao.raft.ErrorInfo.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = errorInfo_.toBuilder();
            }
            errorInfo_ = input.readMessage(org.zhenchao.raft.ErrorInfo.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(errorInfo_);
              errorInfo_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_RequestVoteResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_RequestVoteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zhenchao.raft.RequestVoteResponse.class, org.zhenchao.raft.RequestVoteResponse.Builder.class);
  }

  public static com.google.protobuf.Parser<RequestVoteResponse> PARSER =
      new com.google.protobuf.AbstractParser<RequestVoteResponse>() {
    public RequestVoteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestVoteResponse(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<RequestVoteResponse> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int TERM_FIELD_NUMBER = 1;
  private long term_;
  /**
   * <code>required int64 term = 1;</code>
   */
  public boolean hasTerm() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required int64 term = 1;</code>
   */
  public long getTerm() {
    return term_;
  }

  public static final int GRANTED_FIELD_NUMBER = 2;
  private boolean granted_;
  /**
   * <code>required bool granted = 2;</code>
   */
  public boolean hasGranted() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required bool granted = 2;</code>
   */
  public boolean getGranted() {
    return granted_;
  }

  public static final int ERRORINFO_FIELD_NUMBER = 3;
  private org.zhenchao.raft.ErrorInfo errorInfo_;
  /**
   * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
   */
  public boolean hasErrorInfo() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
   */
  public org.zhenchao.raft.ErrorInfo getErrorInfo() {
    return errorInfo_;
  }
  /**
   * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
   */
  public org.zhenchao.raft.ErrorInfoOrBuilder getErrorInfoOrBuilder() {
    return errorInfo_;
  }

  private void initFields() {
    term_ = 0L;
    granted_ = false;
    errorInfo_ = org.zhenchao.raft.ErrorInfo.getDefaultInstance();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasTerm()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasGranted()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (hasErrorInfo()) {
      if (!getErrorInfo().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(1, term_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBool(2, granted_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, errorInfo_);
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, term_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, granted_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, errorInfo_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.zhenchao.raft.RequestVoteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zhenchao.raft.RequestVoteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zhenchao.raft.RequestVoteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zhenchao.raft.RequestVoteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zhenchao.raft.RequestVoteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.zhenchao.raft.RequestVoteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.zhenchao.raft.RequestVoteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.zhenchao.raft.RequestVoteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.zhenchao.raft.RequestVoteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.zhenchao.raft.RequestVoteResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.zhenchao.raft.RequestVoteResponse prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.zhenchao.raft.RequestVoteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.zhenchao.raft.RequestVoteResponse)
      org.zhenchao.raft.RequestVoteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_RequestVoteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_RequestVoteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zhenchao.raft.RequestVoteResponse.class, org.zhenchao.raft.RequestVoteResponse.Builder.class);
    }

    // Construct using org.zhenchao.raft.RequestVoteResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getErrorInfoFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      term_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      granted_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      if (errorInfoBuilder_ == null) {
        errorInfo_ = org.zhenchao.raft.ErrorInfo.getDefaultInstance();
      } else {
        errorInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_RequestVoteResponse_descriptor;
    }

    public org.zhenchao.raft.RequestVoteResponse getDefaultInstanceForType() {
      return org.zhenchao.raft.RequestVoteResponse.getDefaultInstance();
    }

    public org.zhenchao.raft.RequestVoteResponse build() {
      org.zhenchao.raft.RequestVoteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.zhenchao.raft.RequestVoteResponse buildPartial() {
      org.zhenchao.raft.RequestVoteResponse result = new org.zhenchao.raft.RequestVoteResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.term_ = term_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.granted_ = granted_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      if (errorInfoBuilder_ == null) {
        result.errorInfo_ = errorInfo_;
      } else {
        result.errorInfo_ = errorInfoBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zhenchao.raft.RequestVoteResponse) {
        return mergeFrom((org.zhenchao.raft.RequestVoteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zhenchao.raft.RequestVoteResponse other) {
      if (other == org.zhenchao.raft.RequestVoteResponse.getDefaultInstance()) return this;
      if (other.hasTerm()) {
        setTerm(other.getTerm());
      }
      if (other.hasGranted()) {
        setGranted(other.getGranted());
      }
      if (other.hasErrorInfo()) {
        mergeErrorInfo(other.getErrorInfo());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasTerm()) {
        
        return false;
      }
      if (!hasGranted()) {
        
        return false;
      }
      if (hasErrorInfo()) {
        if (!getErrorInfo().isInitialized()) {
          
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.zhenchao.raft.RequestVoteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zhenchao.raft.RequestVoteResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long term_ ;
    /**
     * <code>required int64 term = 1;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 term = 1;</code>
     */
    public long getTerm() {
      return term_;
    }
    /**
     * <code>required int64 term = 1;</code>
     */
    public Builder setTerm(long value) {
      bitField0_ |= 0x00000001;
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 term = 1;</code>
     */
    public Builder clearTerm() {
      bitField0_ = (bitField0_ & ~0x00000001);
      term_ = 0L;
      onChanged();
      return this;
    }

    private boolean granted_ ;
    /**
     * <code>required bool granted = 2;</code>
     */
    public boolean hasGranted() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bool granted = 2;</code>
     */
    public boolean getGranted() {
      return granted_;
    }
    /**
     * <code>required bool granted = 2;</code>
     */
    public Builder setGranted(boolean value) {
      bitField0_ |= 0x00000002;
      granted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required bool granted = 2;</code>
     */
    public Builder clearGranted() {
      bitField0_ = (bitField0_ & ~0x00000002);
      granted_ = false;
      onChanged();
      return this;
    }

    private org.zhenchao.raft.ErrorInfo errorInfo_ = org.zhenchao.raft.ErrorInfo.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        org.zhenchao.raft.ErrorInfo, org.zhenchao.raft.ErrorInfo.Builder, org.zhenchao.raft.ErrorInfoOrBuilder> errorInfoBuilder_;
    /**
     * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
     */
    public boolean hasErrorInfo() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
     */
    public org.zhenchao.raft.ErrorInfo getErrorInfo() {
      if (errorInfoBuilder_ == null) {
        return errorInfo_;
      } else {
        return errorInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
     */
    public Builder setErrorInfo(org.zhenchao.raft.ErrorInfo value) {
      if (errorInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        errorInfo_ = value;
        onChanged();
      } else {
        errorInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
     */
    public Builder setErrorInfo(
        org.zhenchao.raft.ErrorInfo.Builder builderForValue) {
      if (errorInfoBuilder_ == null) {
        errorInfo_ = builderForValue.build();
        onChanged();
      } else {
        errorInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
     */
    public Builder mergeErrorInfo(org.zhenchao.raft.ErrorInfo value) {
      if (errorInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004) &&
            errorInfo_ != org.zhenchao.raft.ErrorInfo.getDefaultInstance()) {
          errorInfo_ =
            org.zhenchao.raft.ErrorInfo.newBuilder(errorInfo_).mergeFrom(value).buildPartial();
        } else {
          errorInfo_ = value;
        }
        onChanged();
      } else {
        errorInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
     */
    public Builder clearErrorInfo() {
      if (errorInfoBuilder_ == null) {
        errorInfo_ = org.zhenchao.raft.ErrorInfo.getDefaultInstance();
        onChanged();
      } else {
        errorInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
     */
    public org.zhenchao.raft.ErrorInfo.Builder getErrorInfoBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getErrorInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
     */
    public org.zhenchao.raft.ErrorInfoOrBuilder getErrorInfoOrBuilder() {
      if (errorInfoBuilder_ != null) {
        return errorInfoBuilder_.getMessageOrBuilder();
      } else {
        return errorInfo_;
      }
    }
    /**
     * <code>optional .org.zhenchao.raft.ErrorInfo errorInfo = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.zhenchao.raft.ErrorInfo, org.zhenchao.raft.ErrorInfo.Builder, org.zhenchao.raft.ErrorInfoOrBuilder> 
        getErrorInfoFieldBuilder() {
      if (errorInfoBuilder_ == null) {
        errorInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.zhenchao.raft.ErrorInfo, org.zhenchao.raft.ErrorInfo.Builder, org.zhenchao.raft.ErrorInfoOrBuilder>(
                getErrorInfo(),
                getParentForChildren(),
                isClean());
        errorInfo_ = null;
      }
      return errorInfoBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:org.zhenchao.raft.RequestVoteResponse)
  }

  static {
    defaultInstance = new RequestVoteResponse(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.zhenchao.raft.RequestVoteResponse)
}
