// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package org.zhenchao.raft;

/**
 * Protobuf type {@code org.zhenchao.raft.RequestVoteRequest}
 */
public final class RequestVoteRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:org.zhenchao.raft.RequestVoteRequest)
    RequestVoteRequestOrBuilder {
  // Use RequestVoteRequest.newBuilder() to construct.
  private RequestVoteRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private RequestVoteRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final RequestVoteRequest defaultInstance;
  public static RequestVoteRequest getDefaultInstance() {
    return defaultInstance;
  }

  public RequestVoteRequest getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private RequestVoteRequest(
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
            org.zhenchao.raft.Partner.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = candidateId_.toBuilder();
            }
            candidateId_ = input.readMessage(org.zhenchao.raft.Partner.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(candidateId_);
              candidateId_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            term_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            lastLogTerm_ = input.readInt64();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            lastLogIndex_ = input.readInt64();
            break;
          }
          case 42: {
            org.zhenchao.raft.Partner.Builder subBuilder = null;
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
              subBuilder = targetPartner_.toBuilder();
            }
            targetPartner_ = input.readMessage(org.zhenchao.raft.Partner.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(targetPartner_);
              targetPartner_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000010;
            break;
          }
          case 48: {
            bitField0_ |= 0x00000020;
            preVote_ = input.readBool();
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
    return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_RequestVoteRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_RequestVoteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zhenchao.raft.RequestVoteRequest.class, org.zhenchao.raft.RequestVoteRequest.Builder.class);
  }

  public static com.google.protobuf.Parser<RequestVoteRequest> PARSER =
      new com.google.protobuf.AbstractParser<RequestVoteRequest>() {
    public RequestVoteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestVoteRequest(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<RequestVoteRequest> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int CANDIDATEID_FIELD_NUMBER = 1;
  private org.zhenchao.raft.Partner candidateId_;
  /**
   * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
   */
  public boolean hasCandidateId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
   */
  public org.zhenchao.raft.Partner getCandidateId() {
    return candidateId_;
  }
  /**
   * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
   */
  public org.zhenchao.raft.PartnerOrBuilder getCandidateIdOrBuilder() {
    return candidateId_;
  }

  public static final int TERM_FIELD_NUMBER = 2;
  private long term_;
  /**
   * <code>required int64 term = 2;</code>
   */
  public boolean hasTerm() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required int64 term = 2;</code>
   */
  public long getTerm() {
    return term_;
  }

  public static final int LASTLOGTERM_FIELD_NUMBER = 3;
  private long lastLogTerm_;
  /**
   * <code>required int64 lastLogTerm = 3;</code>
   */
  public boolean hasLastLogTerm() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required int64 lastLogTerm = 3;</code>
   */
  public long getLastLogTerm() {
    return lastLogTerm_;
  }

  public static final int LASTLOGINDEX_FIELD_NUMBER = 4;
  private long lastLogIndex_;
  /**
   * <code>required int64 lastLogIndex = 4;</code>
   */
  public boolean hasLastLogIndex() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>required int64 lastLogIndex = 4;</code>
   */
  public long getLastLogIndex() {
    return lastLogIndex_;
  }

  public static final int TARGETPARTNER_FIELD_NUMBER = 5;
  private org.zhenchao.raft.Partner targetPartner_;
  /**
   * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
   */
  public boolean hasTargetPartner() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
   */
  public org.zhenchao.raft.Partner getTargetPartner() {
    return targetPartner_;
  }
  /**
   * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
   */
  public org.zhenchao.raft.PartnerOrBuilder getTargetPartnerOrBuilder() {
    return targetPartner_;
  }

  public static final int PREVOTE_FIELD_NUMBER = 6;
  private boolean preVote_;
  /**
   * <code>optional bool preVote = 6 [default = false];</code>
   */
  public boolean hasPreVote() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>optional bool preVote = 6 [default = false];</code>
   */
  public boolean getPreVote() {
    return preVote_;
  }

  private void initFields() {
    candidateId_ = org.zhenchao.raft.Partner.getDefaultInstance();
    term_ = 0L;
    lastLogTerm_ = 0L;
    lastLogIndex_ = 0L;
    targetPartner_ = org.zhenchao.raft.Partner.getDefaultInstance();
    preVote_ = false;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasCandidateId()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasTerm()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasLastLogTerm()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasLastLogIndex()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasTargetPartner()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getCandidateId().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getTargetPartner().isInitialized()) {
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
      output.writeMessage(1, candidateId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, term_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, lastLogTerm_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt64(4, lastLogIndex_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeMessage(5, targetPartner_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeBool(6, preVote_);
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
        .computeMessageSize(1, candidateId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, term_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, lastLogTerm_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, lastLogIndex_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, targetPartner_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, preVote_);
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

  public static org.zhenchao.raft.RequestVoteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zhenchao.raft.RequestVoteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zhenchao.raft.RequestVoteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zhenchao.raft.RequestVoteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zhenchao.raft.RequestVoteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.zhenchao.raft.RequestVoteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.zhenchao.raft.RequestVoteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.zhenchao.raft.RequestVoteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.zhenchao.raft.RequestVoteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.zhenchao.raft.RequestVoteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.zhenchao.raft.RequestVoteRequest prototype) {
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
   * Protobuf type {@code org.zhenchao.raft.RequestVoteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.zhenchao.raft.RequestVoteRequest)
      org.zhenchao.raft.RequestVoteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_RequestVoteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_RequestVoteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zhenchao.raft.RequestVoteRequest.class, org.zhenchao.raft.RequestVoteRequest.Builder.class);
    }

    // Construct using org.zhenchao.raft.RequestVoteRequest.newBuilder()
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
        getCandidateIdFieldBuilder();
        getTargetPartnerFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (candidateIdBuilder_ == null) {
        candidateId_ = org.zhenchao.raft.Partner.getDefaultInstance();
      } else {
        candidateIdBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      term_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      lastLogTerm_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      lastLogIndex_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      if (targetPartnerBuilder_ == null) {
        targetPartner_ = org.zhenchao.raft.Partner.getDefaultInstance();
      } else {
        targetPartnerBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000010);
      preVote_ = false;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_RequestVoteRequest_descriptor;
    }

    public org.zhenchao.raft.RequestVoteRequest getDefaultInstanceForType() {
      return org.zhenchao.raft.RequestVoteRequest.getDefaultInstance();
    }

    public org.zhenchao.raft.RequestVoteRequest build() {
      org.zhenchao.raft.RequestVoteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.zhenchao.raft.RequestVoteRequest buildPartial() {
      org.zhenchao.raft.RequestVoteRequest result = new org.zhenchao.raft.RequestVoteRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (candidateIdBuilder_ == null) {
        result.candidateId_ = candidateId_;
      } else {
        result.candidateId_ = candidateIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.term_ = term_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.lastLogTerm_ = lastLogTerm_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.lastLogIndex_ = lastLogIndex_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      if (targetPartnerBuilder_ == null) {
        result.targetPartner_ = targetPartner_;
      } else {
        result.targetPartner_ = targetPartnerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
        to_bitField0_ |= 0x00000020;
      }
      result.preVote_ = preVote_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zhenchao.raft.RequestVoteRequest) {
        return mergeFrom((org.zhenchao.raft.RequestVoteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zhenchao.raft.RequestVoteRequest other) {
      if (other == org.zhenchao.raft.RequestVoteRequest.getDefaultInstance()) return this;
      if (other.hasCandidateId()) {
        mergeCandidateId(other.getCandidateId());
      }
      if (other.hasTerm()) {
        setTerm(other.getTerm());
      }
      if (other.hasLastLogTerm()) {
        setLastLogTerm(other.getLastLogTerm());
      }
      if (other.hasLastLogIndex()) {
        setLastLogIndex(other.getLastLogIndex());
      }
      if (other.hasTargetPartner()) {
        mergeTargetPartner(other.getTargetPartner());
      }
      if (other.hasPreVote()) {
        setPreVote(other.getPreVote());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasCandidateId()) {
        
        return false;
      }
      if (!hasTerm()) {
        
        return false;
      }
      if (!hasLastLogTerm()) {
        
        return false;
      }
      if (!hasLastLogIndex()) {
        
        return false;
      }
      if (!hasTargetPartner()) {
        
        return false;
      }
      if (!getCandidateId().isInitialized()) {
        
        return false;
      }
      if (!getTargetPartner().isInitialized()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.zhenchao.raft.RequestVoteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zhenchao.raft.RequestVoteRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.zhenchao.raft.Partner candidateId_ = org.zhenchao.raft.Partner.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        org.zhenchao.raft.Partner, org.zhenchao.raft.Partner.Builder, org.zhenchao.raft.PartnerOrBuilder> candidateIdBuilder_;
    /**
     * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
     */
    public boolean hasCandidateId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
     */
    public org.zhenchao.raft.Partner getCandidateId() {
      if (candidateIdBuilder_ == null) {
        return candidateId_;
      } else {
        return candidateIdBuilder_.getMessage();
      }
    }
    /**
     * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
     */
    public Builder setCandidateId(org.zhenchao.raft.Partner value) {
      if (candidateIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        candidateId_ = value;
        onChanged();
      } else {
        candidateIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
     */
    public Builder setCandidateId(
        org.zhenchao.raft.Partner.Builder builderForValue) {
      if (candidateIdBuilder_ == null) {
        candidateId_ = builderForValue.build();
        onChanged();
      } else {
        candidateIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
     */
    public Builder mergeCandidateId(org.zhenchao.raft.Partner value) {
      if (candidateIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            candidateId_ != org.zhenchao.raft.Partner.getDefaultInstance()) {
          candidateId_ =
            org.zhenchao.raft.Partner.newBuilder(candidateId_).mergeFrom(value).buildPartial();
        } else {
          candidateId_ = value;
        }
        onChanged();
      } else {
        candidateIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
     */
    public Builder clearCandidateId() {
      if (candidateIdBuilder_ == null) {
        candidateId_ = org.zhenchao.raft.Partner.getDefaultInstance();
        onChanged();
      } else {
        candidateIdBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
     */
    public org.zhenchao.raft.Partner.Builder getCandidateIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCandidateIdFieldBuilder().getBuilder();
    }
    /**
     * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
     */
    public org.zhenchao.raft.PartnerOrBuilder getCandidateIdOrBuilder() {
      if (candidateIdBuilder_ != null) {
        return candidateIdBuilder_.getMessageOrBuilder();
      } else {
        return candidateId_;
      }
    }
    /**
     * <code>required .org.zhenchao.raft.Partner candidateId = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.zhenchao.raft.Partner, org.zhenchao.raft.Partner.Builder, org.zhenchao.raft.PartnerOrBuilder> 
        getCandidateIdFieldBuilder() {
      if (candidateIdBuilder_ == null) {
        candidateIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.zhenchao.raft.Partner, org.zhenchao.raft.Partner.Builder, org.zhenchao.raft.PartnerOrBuilder>(
                getCandidateId(),
                getParentForChildren(),
                isClean());
        candidateId_ = null;
      }
      return candidateIdBuilder_;
    }

    private long term_ ;
    /**
     * <code>required int64 term = 2;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 term = 2;</code>
     */
    public long getTerm() {
      return term_;
    }
    /**
     * <code>required int64 term = 2;</code>
     */
    public Builder setTerm(long value) {
      bitField0_ |= 0x00000002;
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 term = 2;</code>
     */
    public Builder clearTerm() {
      bitField0_ = (bitField0_ & ~0x00000002);
      term_ = 0L;
      onChanged();
      return this;
    }

    private long lastLogTerm_ ;
    /**
     * <code>required int64 lastLogTerm = 3;</code>
     */
    public boolean hasLastLogTerm() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 lastLogTerm = 3;</code>
     */
    public long getLastLogTerm() {
      return lastLogTerm_;
    }
    /**
     * <code>required int64 lastLogTerm = 3;</code>
     */
    public Builder setLastLogTerm(long value) {
      bitField0_ |= 0x00000004;
      lastLogTerm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 lastLogTerm = 3;</code>
     */
    public Builder clearLastLogTerm() {
      bitField0_ = (bitField0_ & ~0x00000004);
      lastLogTerm_ = 0L;
      onChanged();
      return this;
    }

    private long lastLogIndex_ ;
    /**
     * <code>required int64 lastLogIndex = 4;</code>
     */
    public boolean hasLastLogIndex() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int64 lastLogIndex = 4;</code>
     */
    public long getLastLogIndex() {
      return lastLogIndex_;
    }
    /**
     * <code>required int64 lastLogIndex = 4;</code>
     */
    public Builder setLastLogIndex(long value) {
      bitField0_ |= 0x00000008;
      lastLogIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 lastLogIndex = 4;</code>
     */
    public Builder clearLastLogIndex() {
      bitField0_ = (bitField0_ & ~0x00000008);
      lastLogIndex_ = 0L;
      onChanged();
      return this;
    }

    private org.zhenchao.raft.Partner targetPartner_ = org.zhenchao.raft.Partner.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        org.zhenchao.raft.Partner, org.zhenchao.raft.Partner.Builder, org.zhenchao.raft.PartnerOrBuilder> targetPartnerBuilder_;
    /**
     * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
     */
    public boolean hasTargetPartner() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
     */
    public org.zhenchao.raft.Partner getTargetPartner() {
      if (targetPartnerBuilder_ == null) {
        return targetPartner_;
      } else {
        return targetPartnerBuilder_.getMessage();
      }
    }
    /**
     * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
     */
    public Builder setTargetPartner(org.zhenchao.raft.Partner value) {
      if (targetPartnerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetPartner_ = value;
        onChanged();
      } else {
        targetPartnerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
     */
    public Builder setTargetPartner(
        org.zhenchao.raft.Partner.Builder builderForValue) {
      if (targetPartnerBuilder_ == null) {
        targetPartner_ = builderForValue.build();
        onChanged();
      } else {
        targetPartnerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
     */
    public Builder mergeTargetPartner(org.zhenchao.raft.Partner value) {
      if (targetPartnerBuilder_ == null) {
        if (((bitField0_ & 0x00000010) == 0x00000010) &&
            targetPartner_ != org.zhenchao.raft.Partner.getDefaultInstance()) {
          targetPartner_ =
            org.zhenchao.raft.Partner.newBuilder(targetPartner_).mergeFrom(value).buildPartial();
        } else {
          targetPartner_ = value;
        }
        onChanged();
      } else {
        targetPartnerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
     */
    public Builder clearTargetPartner() {
      if (targetPartnerBuilder_ == null) {
        targetPartner_ = org.zhenchao.raft.Partner.getDefaultInstance();
        onChanged();
      } else {
        targetPartnerBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
     */
    public org.zhenchao.raft.Partner.Builder getTargetPartnerBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getTargetPartnerFieldBuilder().getBuilder();
    }
    /**
     * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
     */
    public org.zhenchao.raft.PartnerOrBuilder getTargetPartnerOrBuilder() {
      if (targetPartnerBuilder_ != null) {
        return targetPartnerBuilder_.getMessageOrBuilder();
      } else {
        return targetPartner_;
      }
    }
    /**
     * <code>required .org.zhenchao.raft.Partner targetPartner = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.zhenchao.raft.Partner, org.zhenchao.raft.Partner.Builder, org.zhenchao.raft.PartnerOrBuilder> 
        getTargetPartnerFieldBuilder() {
      if (targetPartnerBuilder_ == null) {
        targetPartnerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.zhenchao.raft.Partner, org.zhenchao.raft.Partner.Builder, org.zhenchao.raft.PartnerOrBuilder>(
                getTargetPartner(),
                getParentForChildren(),
                isClean());
        targetPartner_ = null;
      }
      return targetPartnerBuilder_;
    }

    private boolean preVote_ ;
    /**
     * <code>optional bool preVote = 6 [default = false];</code>
     */
    public boolean hasPreVote() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bool preVote = 6 [default = false];</code>
     */
    public boolean getPreVote() {
      return preVote_;
    }
    /**
     * <code>optional bool preVote = 6 [default = false];</code>
     */
    public Builder setPreVote(boolean value) {
      bitField0_ |= 0x00000020;
      preVote_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool preVote = 6 [default = false];</code>
     */
    public Builder clearPreVote() {
      bitField0_ = (bitField0_ & ~0x00000020);
      preVote_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.zhenchao.raft.RequestVoteRequest)
  }

  static {
    defaultInstance = new RequestVoteRequest(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.zhenchao.raft.RequestVoteRequest)
}

