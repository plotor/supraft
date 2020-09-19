// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package org.zhenchao.raft;

/**
 * Protobuf enum {@code org.zhenchao.raft.PartnerRole}
 */
public enum PartnerRole
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LEADER = 1;</code>
   */
  LEADER(0, 1),
  /**
   * <code>CANDIDATE = 2;</code>
   */
  CANDIDATE(1, 2),
  /**
   * <code>FOLLOWER = 3;</code>
   */
  FOLLOWER(2, 3),
  ;

  /**
   * <code>LEADER = 1;</code>
   */
  public static final int LEADER_VALUE = 1;
  /**
   * <code>CANDIDATE = 2;</code>
   */
  public static final int CANDIDATE_VALUE = 2;
  /**
   * <code>FOLLOWER = 3;</code>
   */
  public static final int FOLLOWER_VALUE = 3;


  public final int getNumber() { return value; }

  public static PartnerRole valueOf(int value) {
    switch (value) {
      case 1: return LEADER;
      case 2: return CANDIDATE;
      case 3: return FOLLOWER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PartnerRole>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static com.google.protobuf.Internal.EnumLiteMap<PartnerRole>
      internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PartnerRole>() {
          public PartnerRole findValueByNumber(int number) {
            return PartnerRole.valueOf(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(index);
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.zhenchao.raft.Raft.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final PartnerRole[] VALUES = values();

  public static PartnerRole valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int index;
  private final int value;

  private PartnerRole(int index, int value) {
    this.index = index;
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:org.zhenchao.raft.PartnerRole)
}

