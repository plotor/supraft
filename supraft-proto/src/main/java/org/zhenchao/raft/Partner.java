// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package org.zhenchao.raft;

/**
 * Protobuf type {@code org.zhenchao.raft.Partner}
 */
public final class Partner extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:org.zhenchao.raft.Partner)
    PartnerOrBuilder {
  // Use Partner.newBuilder() to construct.
  private Partner(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private Partner(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final Partner defaultInstance;
  public static Partner getDefaultInstance() {
    return defaultInstance;
  }

  public Partner getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private Partner(
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
          case 10: {
            org.zhenchao.raft.Endpoint.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = endpoint_.toBuilder();
            }
            endpoint_ = input.readMessage(org.zhenchao.raft.Endpoint.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(endpoint_);
              endpoint_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            groupId_ = bs;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            priority_ = input.readInt32();
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
    return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_Partner_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_Partner_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zhenchao.raft.Partner.class, org.zhenchao.raft.Partner.Builder.class);
  }

  public static com.google.protobuf.Parser<Partner> PARSER =
      new com.google.protobuf.AbstractParser<Partner>() {
    public Partner parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Partner(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<Partner> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int ENDPOINT_FIELD_NUMBER = 1;
  private org.zhenchao.raft.Endpoint endpoint_;
  /**
   * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
   */
  public boolean hasEndpoint() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
   */
  public org.zhenchao.raft.Endpoint getEndpoint() {
    return endpoint_;
  }
  /**
   * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
   */
  public org.zhenchao.raft.EndpointOrBuilder getEndpointOrBuilder() {
    return endpoint_;
  }

  public static final int GROUPID_FIELD_NUMBER = 2;
  private java.lang.Object groupId_;
  /**
   * <code>required string groupId = 2;</code>
   */
  public boolean hasGroupId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required string groupId = 2;</code>
   */
  public java.lang.String getGroupId() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        groupId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string groupId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getGroupIdBytes() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIORITY_FIELD_NUMBER = 3;
  private int priority_;
  /**
   * <code>optional int32 priority = 3;</code>
   *
   * <pre>
   * election priority
   * </pre>
   */
  public boolean hasPriority() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int32 priority = 3;</code>
   *
   * <pre>
   * election priority
   * </pre>
   */
  public int getPriority() {
    return priority_;
  }

  private void initFields() {
    endpoint_ = org.zhenchao.raft.Endpoint.getDefaultInstance();
    groupId_ = "";
    priority_ = 0;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasEndpoint()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasGroupId()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getEndpoint().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, endpoint_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getGroupIdBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(3, priority_);
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
        .computeMessageSize(1, endpoint_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getGroupIdBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, priority_);
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

  public static org.zhenchao.raft.Partner parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zhenchao.raft.Partner parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zhenchao.raft.Partner parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zhenchao.raft.Partner parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zhenchao.raft.Partner parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.zhenchao.raft.Partner parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.zhenchao.raft.Partner parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.zhenchao.raft.Partner parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.zhenchao.raft.Partner parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.zhenchao.raft.Partner parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.zhenchao.raft.Partner prototype) {
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
   * Protobuf type {@code org.zhenchao.raft.Partner}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.zhenchao.raft.Partner)
      org.zhenchao.raft.PartnerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_Partner_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_Partner_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zhenchao.raft.Partner.class, org.zhenchao.raft.Partner.Builder.class);
    }

    // Construct using org.zhenchao.raft.Partner.newBuilder()
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
        getEndpointFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (endpointBuilder_ == null) {
        endpoint_ = org.zhenchao.raft.Endpoint.getDefaultInstance();
      } else {
        endpointBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      groupId_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      priority_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_Partner_descriptor;
    }

    public org.zhenchao.raft.Partner getDefaultInstanceForType() {
      return org.zhenchao.raft.Partner.getDefaultInstance();
    }

    public org.zhenchao.raft.Partner build() {
      org.zhenchao.raft.Partner result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.zhenchao.raft.Partner buildPartial() {
      org.zhenchao.raft.Partner result = new org.zhenchao.raft.Partner(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (endpointBuilder_ == null) {
        result.endpoint_ = endpoint_;
      } else {
        result.endpoint_ = endpointBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.groupId_ = groupId_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.priority_ = priority_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zhenchao.raft.Partner) {
        return mergeFrom((org.zhenchao.raft.Partner)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zhenchao.raft.Partner other) {
      if (other == org.zhenchao.raft.Partner.getDefaultInstance()) return this;
      if (other.hasEndpoint()) {
        mergeEndpoint(other.getEndpoint());
      }
      if (other.hasGroupId()) {
        bitField0_ |= 0x00000002;
        groupId_ = other.groupId_;
        onChanged();
      }
      if (other.hasPriority()) {
        setPriority(other.getPriority());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasEndpoint()) {
        
        return false;
      }
      if (!hasGroupId()) {
        
        return false;
      }
      if (!getEndpoint().isInitialized()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.zhenchao.raft.Partner parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zhenchao.raft.Partner) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.zhenchao.raft.Endpoint endpoint_ = org.zhenchao.raft.Endpoint.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        org.zhenchao.raft.Endpoint, org.zhenchao.raft.Endpoint.Builder, org.zhenchao.raft.EndpointOrBuilder> endpointBuilder_;
    /**
     * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
     */
    public boolean hasEndpoint() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
     */
    public org.zhenchao.raft.Endpoint getEndpoint() {
      if (endpointBuilder_ == null) {
        return endpoint_;
      } else {
        return endpointBuilder_.getMessage();
      }
    }
    /**
     * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
     */
    public Builder setEndpoint(org.zhenchao.raft.Endpoint value) {
      if (endpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endpoint_ = value;
        onChanged();
      } else {
        endpointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
     */
    public Builder setEndpoint(
        org.zhenchao.raft.Endpoint.Builder builderForValue) {
      if (endpointBuilder_ == null) {
        endpoint_ = builderForValue.build();
        onChanged();
      } else {
        endpointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
     */
    public Builder mergeEndpoint(org.zhenchao.raft.Endpoint value) {
      if (endpointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            endpoint_ != org.zhenchao.raft.Endpoint.getDefaultInstance()) {
          endpoint_ =
            org.zhenchao.raft.Endpoint.newBuilder(endpoint_).mergeFrom(value).buildPartial();
        } else {
          endpoint_ = value;
        }
        onChanged();
      } else {
        endpointBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
     */
    public Builder clearEndpoint() {
      if (endpointBuilder_ == null) {
        endpoint_ = org.zhenchao.raft.Endpoint.getDefaultInstance();
        onChanged();
      } else {
        endpointBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
     */
    public org.zhenchao.raft.Endpoint.Builder getEndpointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEndpointFieldBuilder().getBuilder();
    }
    /**
     * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
     */
    public org.zhenchao.raft.EndpointOrBuilder getEndpointOrBuilder() {
      if (endpointBuilder_ != null) {
        return endpointBuilder_.getMessageOrBuilder();
      } else {
        return endpoint_;
      }
    }
    /**
     * <code>required .org.zhenchao.raft.Endpoint endpoint = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.zhenchao.raft.Endpoint, org.zhenchao.raft.Endpoint.Builder, org.zhenchao.raft.EndpointOrBuilder> 
        getEndpointFieldBuilder() {
      if (endpointBuilder_ == null) {
        endpointBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.zhenchao.raft.Endpoint, org.zhenchao.raft.Endpoint.Builder, org.zhenchao.raft.EndpointOrBuilder>(
                getEndpoint(),
                getParentForChildren(),
                isClean());
        endpoint_ = null;
      }
      return endpointBuilder_;
    }

    private java.lang.Object groupId_ = "";
    /**
     * <code>required string groupId = 2;</code>
     */
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string groupId = 2;</code>
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string groupId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string groupId = 2;</code>
     */
    public Builder setGroupId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string groupId = 2;</code>
     */
    public Builder clearGroupId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      groupId_ = getDefaultInstance().getGroupId();
      onChanged();
      return this;
    }
    /**
     * <code>required string groupId = 2;</code>
     */
    public Builder setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      groupId_ = value;
      onChanged();
      return this;
    }

    private int priority_ ;
    /**
     * <code>optional int32 priority = 3;</code>
     *
     * <pre>
     * election priority
     * </pre>
     */
    public boolean hasPriority() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 priority = 3;</code>
     *
     * <pre>
     * election priority
     * </pre>
     */
    public int getPriority() {
      return priority_;
    }
    /**
     * <code>optional int32 priority = 3;</code>
     *
     * <pre>
     * election priority
     * </pre>
     */
    public Builder setPriority(int value) {
      bitField0_ |= 0x00000004;
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 priority = 3;</code>
     *
     * <pre>
     * election priority
     * </pre>
     */
    public Builder clearPriority() {
      bitField0_ = (bitField0_ & ~0x00000004);
      priority_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.zhenchao.raft.Partner)
  }

  static {
    defaultInstance = new Partner(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.zhenchao.raft.Partner)
}

