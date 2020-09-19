// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package org.zhenchao.raft;

/**
 * Protobuf type {@code org.zhenchao.raft.AppendEntriesRequest}
 */
public final class AppendEntriesRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:org.zhenchao.raft.AppendEntriesRequest)
    AppendEntriesRequestOrBuilder {
  // Use AppendEntriesRequest.newBuilder() to construct.
  private AppendEntriesRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private AppendEntriesRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final AppendEntriesRequest defaultInstance;
  public static AppendEntriesRequest getDefaultInstance() {
    return defaultInstance;
  }

  public AppendEntriesRequest getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private AppendEntriesRequest(
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
              subBuilder = leaderId_.toBuilder();
            }
            leaderId_ = input.readMessage(org.zhenchao.raft.Partner.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(leaderId_);
              leaderId_ = subBuilder.buildPartial();
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
            prevLogTerm_ = input.readInt64();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            prevLogIndex_ = input.readInt64();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              entry_ = new java.util.ArrayList<org.zhenchao.raft.LogEntry>();
              mutable_bitField0_ |= 0x00000010;
            }
            entry_.add(input.readMessage(org.zhenchao.raft.LogEntry.PARSER, extensionRegistry));
            break;
          }
          case 48: {
            bitField0_ |= 0x00000010;
            committedIndex_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        entry_ = java.util.Collections.unmodifiableList(entry_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_AppendEntriesRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_AppendEntriesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zhenchao.raft.AppendEntriesRequest.class, org.zhenchao.raft.AppendEntriesRequest.Builder.class);
  }

  public static com.google.protobuf.Parser<AppendEntriesRequest> PARSER =
      new com.google.protobuf.AbstractParser<AppendEntriesRequest>() {
    public AppendEntriesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppendEntriesRequest(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<AppendEntriesRequest> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int LEADERID_FIELD_NUMBER = 1;
  private org.zhenchao.raft.Partner leaderId_;
  /**
   * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
   */
  public boolean hasLeaderId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
   */
  public org.zhenchao.raft.Partner getLeaderId() {
    return leaderId_;
  }
  /**
   * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
   */
  public org.zhenchao.raft.PartnerOrBuilder getLeaderIdOrBuilder() {
    return leaderId_;
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

  public static final int PREVLOGTERM_FIELD_NUMBER = 3;
  private long prevLogTerm_;
  /**
   * <code>required int64 prevLogTerm = 3;</code>
   */
  public boolean hasPrevLogTerm() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required int64 prevLogTerm = 3;</code>
   */
  public long getPrevLogTerm() {
    return prevLogTerm_;
  }

  public static final int PREVLOGINDEX_FIELD_NUMBER = 4;
  private long prevLogIndex_;
  /**
   * <code>required int64 prevLogIndex = 4;</code>
   */
  public boolean hasPrevLogIndex() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>required int64 prevLogIndex = 4;</code>
   */
  public long getPrevLogIndex() {
    return prevLogIndex_;
  }

  public static final int ENTRY_FIELD_NUMBER = 5;
  private java.util.List<org.zhenchao.raft.LogEntry> entry_;
  /**
   * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
   */
  public java.util.List<org.zhenchao.raft.LogEntry> getEntryList() {
    return entry_;
  }
  /**
   * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
   */
  public java.util.List<? extends org.zhenchao.raft.LogEntryOrBuilder> 
      getEntryOrBuilderList() {
    return entry_;
  }
  /**
   * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
   */
  public int getEntryCount() {
    return entry_.size();
  }
  /**
   * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
   */
  public org.zhenchao.raft.LogEntry getEntry(int index) {
    return entry_.get(index);
  }
  /**
   * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
   */
  public org.zhenchao.raft.LogEntryOrBuilder getEntryOrBuilder(
      int index) {
    return entry_.get(index);
  }

  public static final int COMMITTEDINDEX_FIELD_NUMBER = 6;
  private long committedIndex_;
  /**
   * <code>required int64 committedIndex = 6;</code>
   */
  public boolean hasCommittedIndex() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>required int64 committedIndex = 6;</code>
   */
  public long getCommittedIndex() {
    return committedIndex_;
  }

  private void initFields() {
    leaderId_ = org.zhenchao.raft.Partner.getDefaultInstance();
    term_ = 0L;
    prevLogTerm_ = 0L;
    prevLogIndex_ = 0L;
    entry_ = java.util.Collections.emptyList();
    committedIndex_ = 0L;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasLeaderId()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasTerm()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasPrevLogTerm()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasPrevLogIndex()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasCommittedIndex()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getLeaderId().isInitialized()) {
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
      output.writeMessage(1, leaderId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, term_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, prevLogTerm_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt64(4, prevLogIndex_);
    }
    for (int i = 0; i < entry_.size(); i++) {
      output.writeMessage(5, entry_.get(i));
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeInt64(6, committedIndex_);
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
        .computeMessageSize(1, leaderId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, term_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, prevLogTerm_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, prevLogIndex_);
    }
    for (int i = 0; i < entry_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, entry_.get(i));
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, committedIndex_);
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

  public static org.zhenchao.raft.AppendEntriesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zhenchao.raft.AppendEntriesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zhenchao.raft.AppendEntriesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zhenchao.raft.AppendEntriesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zhenchao.raft.AppendEntriesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.zhenchao.raft.AppendEntriesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.zhenchao.raft.AppendEntriesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.zhenchao.raft.AppendEntriesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.zhenchao.raft.AppendEntriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.zhenchao.raft.AppendEntriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.zhenchao.raft.AppendEntriesRequest prototype) {
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
   * Protobuf type {@code org.zhenchao.raft.AppendEntriesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.zhenchao.raft.AppendEntriesRequest)
      org.zhenchao.raft.AppendEntriesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_AppendEntriesRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_AppendEntriesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zhenchao.raft.AppendEntriesRequest.class, org.zhenchao.raft.AppendEntriesRequest.Builder.class);
    }

    // Construct using org.zhenchao.raft.AppendEntriesRequest.newBuilder()
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
        getLeaderIdFieldBuilder();
        getEntryFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (leaderIdBuilder_ == null) {
        leaderId_ = org.zhenchao.raft.Partner.getDefaultInstance();
      } else {
        leaderIdBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      term_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      prevLogTerm_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      prevLogIndex_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      if (entryBuilder_ == null) {
        entry_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
      } else {
        entryBuilder_.clear();
      }
      committedIndex_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zhenchao.raft.Raft.internal_static_org_zhenchao_raft_AppendEntriesRequest_descriptor;
    }

    public org.zhenchao.raft.AppendEntriesRequest getDefaultInstanceForType() {
      return org.zhenchao.raft.AppendEntriesRequest.getDefaultInstance();
    }

    public org.zhenchao.raft.AppendEntriesRequest build() {
      org.zhenchao.raft.AppendEntriesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.zhenchao.raft.AppendEntriesRequest buildPartial() {
      org.zhenchao.raft.AppendEntriesRequest result = new org.zhenchao.raft.AppendEntriesRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (leaderIdBuilder_ == null) {
        result.leaderId_ = leaderId_;
      } else {
        result.leaderId_ = leaderIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.term_ = term_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.prevLogTerm_ = prevLogTerm_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.prevLogIndex_ = prevLogIndex_;
      if (entryBuilder_ == null) {
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          entry_ = java.util.Collections.unmodifiableList(entry_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.entry_ = entry_;
      } else {
        result.entry_ = entryBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
        to_bitField0_ |= 0x00000010;
      }
      result.committedIndex_ = committedIndex_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zhenchao.raft.AppendEntriesRequest) {
        return mergeFrom((org.zhenchao.raft.AppendEntriesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zhenchao.raft.AppendEntriesRequest other) {
      if (other == org.zhenchao.raft.AppendEntriesRequest.getDefaultInstance()) return this;
      if (other.hasLeaderId()) {
        mergeLeaderId(other.getLeaderId());
      }
      if (other.hasTerm()) {
        setTerm(other.getTerm());
      }
      if (other.hasPrevLogTerm()) {
        setPrevLogTerm(other.getPrevLogTerm());
      }
      if (other.hasPrevLogIndex()) {
        setPrevLogIndex(other.getPrevLogIndex());
      }
      if (entryBuilder_ == null) {
        if (!other.entry_.isEmpty()) {
          if (entry_.isEmpty()) {
            entry_ = other.entry_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureEntryIsMutable();
            entry_.addAll(other.entry_);
          }
          onChanged();
        }
      } else {
        if (!other.entry_.isEmpty()) {
          if (entryBuilder_.isEmpty()) {
            entryBuilder_.dispose();
            entryBuilder_ = null;
            entry_ = other.entry_;
            bitField0_ = (bitField0_ & ~0x00000010);
            entryBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getEntryFieldBuilder() : null;
          } else {
            entryBuilder_.addAllMessages(other.entry_);
          }
        }
      }
      if (other.hasCommittedIndex()) {
        setCommittedIndex(other.getCommittedIndex());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasLeaderId()) {
        
        return false;
      }
      if (!hasTerm()) {
        
        return false;
      }
      if (!hasPrevLogTerm()) {
        
        return false;
      }
      if (!hasPrevLogIndex()) {
        
        return false;
      }
      if (!hasCommittedIndex()) {
        
        return false;
      }
      if (!getLeaderId().isInitialized()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.zhenchao.raft.AppendEntriesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zhenchao.raft.AppendEntriesRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.zhenchao.raft.Partner leaderId_ = org.zhenchao.raft.Partner.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        org.zhenchao.raft.Partner, org.zhenchao.raft.Partner.Builder, org.zhenchao.raft.PartnerOrBuilder> leaderIdBuilder_;
    /**
     * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
     */
    public boolean hasLeaderId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
     */
    public org.zhenchao.raft.Partner getLeaderId() {
      if (leaderIdBuilder_ == null) {
        return leaderId_;
      } else {
        return leaderIdBuilder_.getMessage();
      }
    }
    /**
     * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
     */
    public Builder setLeaderId(org.zhenchao.raft.Partner value) {
      if (leaderIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        leaderId_ = value;
        onChanged();
      } else {
        leaderIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
     */
    public Builder setLeaderId(
        org.zhenchao.raft.Partner.Builder builderForValue) {
      if (leaderIdBuilder_ == null) {
        leaderId_ = builderForValue.build();
        onChanged();
      } else {
        leaderIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
     */
    public Builder mergeLeaderId(org.zhenchao.raft.Partner value) {
      if (leaderIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            leaderId_ != org.zhenchao.raft.Partner.getDefaultInstance()) {
          leaderId_ =
            org.zhenchao.raft.Partner.newBuilder(leaderId_).mergeFrom(value).buildPartial();
        } else {
          leaderId_ = value;
        }
        onChanged();
      } else {
        leaderIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
     */
    public Builder clearLeaderId() {
      if (leaderIdBuilder_ == null) {
        leaderId_ = org.zhenchao.raft.Partner.getDefaultInstance();
        onChanged();
      } else {
        leaderIdBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
     */
    public org.zhenchao.raft.Partner.Builder getLeaderIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLeaderIdFieldBuilder().getBuilder();
    }
    /**
     * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
     */
    public org.zhenchao.raft.PartnerOrBuilder getLeaderIdOrBuilder() {
      if (leaderIdBuilder_ != null) {
        return leaderIdBuilder_.getMessageOrBuilder();
      } else {
        return leaderId_;
      }
    }
    /**
     * <code>required .org.zhenchao.raft.Partner leaderId = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.zhenchao.raft.Partner, org.zhenchao.raft.Partner.Builder, org.zhenchao.raft.PartnerOrBuilder> 
        getLeaderIdFieldBuilder() {
      if (leaderIdBuilder_ == null) {
        leaderIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.zhenchao.raft.Partner, org.zhenchao.raft.Partner.Builder, org.zhenchao.raft.PartnerOrBuilder>(
                getLeaderId(),
                getParentForChildren(),
                isClean());
        leaderId_ = null;
      }
      return leaderIdBuilder_;
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

    private long prevLogTerm_ ;
    /**
     * <code>required int64 prevLogTerm = 3;</code>
     */
    public boolean hasPrevLogTerm() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 prevLogTerm = 3;</code>
     */
    public long getPrevLogTerm() {
      return prevLogTerm_;
    }
    /**
     * <code>required int64 prevLogTerm = 3;</code>
     */
    public Builder setPrevLogTerm(long value) {
      bitField0_ |= 0x00000004;
      prevLogTerm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 prevLogTerm = 3;</code>
     */
    public Builder clearPrevLogTerm() {
      bitField0_ = (bitField0_ & ~0x00000004);
      prevLogTerm_ = 0L;
      onChanged();
      return this;
    }

    private long prevLogIndex_ ;
    /**
     * <code>required int64 prevLogIndex = 4;</code>
     */
    public boolean hasPrevLogIndex() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int64 prevLogIndex = 4;</code>
     */
    public long getPrevLogIndex() {
      return prevLogIndex_;
    }
    /**
     * <code>required int64 prevLogIndex = 4;</code>
     */
    public Builder setPrevLogIndex(long value) {
      bitField0_ |= 0x00000008;
      prevLogIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 prevLogIndex = 4;</code>
     */
    public Builder clearPrevLogIndex() {
      bitField0_ = (bitField0_ & ~0x00000008);
      prevLogIndex_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<org.zhenchao.raft.LogEntry> entry_ =
      java.util.Collections.emptyList();
    private void ensureEntryIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        entry_ = new java.util.ArrayList<org.zhenchao.raft.LogEntry>(entry_);
        bitField0_ |= 0x00000010;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.zhenchao.raft.LogEntry, org.zhenchao.raft.LogEntry.Builder, org.zhenchao.raft.LogEntryOrBuilder> entryBuilder_;

    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public java.util.List<org.zhenchao.raft.LogEntry> getEntryList() {
      if (entryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entry_);
      } else {
        return entryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public int getEntryCount() {
      if (entryBuilder_ == null) {
        return entry_.size();
      } else {
        return entryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public org.zhenchao.raft.LogEntry getEntry(int index) {
      if (entryBuilder_ == null) {
        return entry_.get(index);
      } else {
        return entryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public Builder setEntry(
        int index, org.zhenchao.raft.LogEntry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.set(index, value);
        onChanged();
      } else {
        entryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public Builder setEntry(
        int index, org.zhenchao.raft.LogEntry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.set(index, builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public Builder addEntry(org.zhenchao.raft.LogEntry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.add(value);
        onChanged();
      } else {
        entryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public Builder addEntry(
        int index, org.zhenchao.raft.LogEntry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.add(index, value);
        onChanged();
      } else {
        entryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public Builder addEntry(
        org.zhenchao.raft.LogEntry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.add(builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public Builder addEntry(
        int index, org.zhenchao.raft.LogEntry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.add(index, builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public Builder addAllEntry(
        java.lang.Iterable<? extends org.zhenchao.raft.LogEntry> values) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entry_);
        onChanged();
      } else {
        entryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public Builder clearEntry() {
      if (entryBuilder_ == null) {
        entry_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        entryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public Builder removeEntry(int index) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.remove(index);
        onChanged();
      } else {
        entryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public org.zhenchao.raft.LogEntry.Builder getEntryBuilder(
        int index) {
      return getEntryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public org.zhenchao.raft.LogEntryOrBuilder getEntryOrBuilder(
        int index) {
      if (entryBuilder_ == null) {
        return entry_.get(index);  } else {
        return entryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public java.util.List<? extends org.zhenchao.raft.LogEntryOrBuilder> 
         getEntryOrBuilderList() {
      if (entryBuilder_ != null) {
        return entryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entry_);
      }
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public org.zhenchao.raft.LogEntry.Builder addEntryBuilder() {
      return getEntryFieldBuilder().addBuilder(
          org.zhenchao.raft.LogEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public org.zhenchao.raft.LogEntry.Builder addEntryBuilder(
        int index) {
      return getEntryFieldBuilder().addBuilder(
          index, org.zhenchao.raft.LogEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .org.zhenchao.raft.LogEntry entry = 5;</code>
     */
    public java.util.List<org.zhenchao.raft.LogEntry.Builder> 
         getEntryBuilderList() {
      return getEntryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.zhenchao.raft.LogEntry, org.zhenchao.raft.LogEntry.Builder, org.zhenchao.raft.LogEntryOrBuilder> 
        getEntryFieldBuilder() {
      if (entryBuilder_ == null) {
        entryBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.zhenchao.raft.LogEntry, org.zhenchao.raft.LogEntry.Builder, org.zhenchao.raft.LogEntryOrBuilder>(
                entry_,
                ((bitField0_ & 0x00000010) == 0x00000010),
                getParentForChildren(),
                isClean());
        entry_ = null;
      }
      return entryBuilder_;
    }

    private long committedIndex_ ;
    /**
     * <code>required int64 committedIndex = 6;</code>
     */
    public boolean hasCommittedIndex() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required int64 committedIndex = 6;</code>
     */
    public long getCommittedIndex() {
      return committedIndex_;
    }
    /**
     * <code>required int64 committedIndex = 6;</code>
     */
    public Builder setCommittedIndex(long value) {
      bitField0_ |= 0x00000020;
      committedIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 committedIndex = 6;</code>
     */
    public Builder clearCommittedIndex() {
      bitField0_ = (bitField0_ & ~0x00000020);
      committedIndex_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.zhenchao.raft.AppendEntriesRequest)
  }

  static {
    defaultInstance = new AppendEntriesRequest(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.zhenchao.raft.AppendEntriesRequest)
}

