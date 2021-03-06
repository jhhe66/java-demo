// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.ejyi.demo.springboot.grpc.proto.hello;

/**
 * <pre>
 * The request message containing the user's name.
 * </pre>
 *
 * Protobuf type {@code helloworld.HelloRequest1}
 */
public  final class HelloRequest1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helloworld.HelloRequest1)
    HelloRequest1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use HelloRequest1.newBuilder() to construct.
  private HelloRequest1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloRequest1() {
    name_ = "";
    id_ = 0;
    helloType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HelloRequest1(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            id_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            helloType_ = rawValue;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              mapStr_ = com.google.protobuf.MapField.newMapField(
                  MapStrDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000008;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            mapStr__ = input.readMessage(
                MapStrDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            mapStr_.getMutableMap().put(
                mapStr__.getKey(), mapStr__.getValue());
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
    return com.ejyi.demo.springboot.grpc.proto.hello.HelloProto.internal_static_helloworld_HelloRequest1_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetMapStr();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ejyi.demo.springboot.grpc.proto.hello.HelloProto.internal_static_helloworld_HelloRequest1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1.class, com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 2;
  private int id_;
  /**
   * <code>int32 id = 2;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int HELLOTYPE_FIELD_NUMBER = 3;
  private int helloType_;
  /**
   * <code>.helloworld.HelloType HelloType = 3;</code>
   */
  public int getHelloTypeValue() {
    return helloType_;
  }
  /**
   * <code>.helloworld.HelloType HelloType = 3;</code>
   */
  public com.ejyi.demo.springboot.grpc.proto.hello.HelloType getHelloType() {
    com.ejyi.demo.springboot.grpc.proto.hello.HelloType result = com.ejyi.demo.springboot.grpc.proto.hello.HelloType.valueOf(helloType_);
    return result == null ? com.ejyi.demo.springboot.grpc.proto.hello.HelloType.UNRECOGNIZED : result;
  }

  public static final int MAPSTR_FIELD_NUMBER = 4;
  private static final class MapStrDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.ejyi.demo.springboot.grpc.proto.hello.HelloProto.internal_static_helloworld_HelloRequest1_MapStrEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> mapStr_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetMapStr() {
    if (mapStr_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MapStrDefaultEntryHolder.defaultEntry);
    }
    return mapStr_;
  }

  public int getMapStrCount() {
    return internalGetMapStr().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; mapStr = 4;</code>
   */

  public boolean containsMapStr(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetMapStr().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMapStrMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMapStr() {
    return getMapStrMap();
  }
  /**
   * <code>map&lt;string, string&gt; mapStr = 4;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getMapStrMap() {
    return internalGetMapStr().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; mapStr = 4;</code>
   */

  public java.lang.String getMapStrOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMapStr().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; mapStr = 4;</code>
   */

  public java.lang.String getMapStrOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMapStr().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (id_ != 0) {
      output.writeInt32(2, id_);
    }
    if (helloType_ != com.ejyi.demo.springboot.grpc.proto.hello.HelloType.Type1.getNumber()) {
      output.writeEnum(3, helloType_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMapStr(),
        MapStrDefaultEntryHolder.defaultEntry,
        4);
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, id_);
    }
    if (helloType_ != com.ejyi.demo.springboot.grpc.proto.hello.HelloType.Type1.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, helloType_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetMapStr().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      mapStr__ = MapStrDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, mapStr__);
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
    if (!(obj instanceof com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1)) {
      return super.equals(obj);
    }
    com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 other = (com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (getId()
        == other.getId());
    result = result && helloType_ == other.helloType_;
    result = result && internalGetMapStr().equals(
        other.internalGetMapStr());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + HELLOTYPE_FIELD_NUMBER;
    hash = (53 * hash) + helloType_;
    if (!internalGetMapStr().getMap().isEmpty()) {
      hash = (37 * hash) + MAPSTR_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMapStr().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * The request message containing the user's name.
   * </pre>
   *
   * Protobuf type {@code helloworld.HelloRequest1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.HelloRequest1)
      com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ejyi.demo.springboot.grpc.proto.hello.HelloProto.internal_static_helloworld_HelloRequest1_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMapStr();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableMapStr();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ejyi.demo.springboot.grpc.proto.hello.HelloProto.internal_static_helloworld_HelloRequest1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1.class, com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1.Builder.class);
    }

    // Construct using com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1.newBuilder()
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
    public Builder clear() {
      super.clear();
      name_ = "";

      id_ = 0;

      helloType_ = 0;

      internalGetMutableMapStr().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ejyi.demo.springboot.grpc.proto.hello.HelloProto.internal_static_helloworld_HelloRequest1_descriptor;
    }

    public com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 getDefaultInstanceForType() {
      return com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1.getDefaultInstance();
    }

    public com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 build() {
      com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 buildPartial() {
      com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 result = new com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      result.id_ = id_;
      result.helloType_ = helloType_;
      result.mapStr_ = internalGetMapStr();
      result.mapStr_.makeImmutable();
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1) {
        return mergeFrom((com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 other) {
      if (other == com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.helloType_ != 0) {
        setHelloTypeValue(other.getHelloTypeValue());
      }
      internalGetMutableMapStr().mergeFrom(
          other.internalGetMapStr());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 2;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 2;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 2;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int helloType_ = 0;
    /**
     * <code>.helloworld.HelloType HelloType = 3;</code>
     */
    public int getHelloTypeValue() {
      return helloType_;
    }
    /**
     * <code>.helloworld.HelloType HelloType = 3;</code>
     */
    public Builder setHelloTypeValue(int value) {
      helloType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.helloworld.HelloType HelloType = 3;</code>
     */
    public com.ejyi.demo.springboot.grpc.proto.hello.HelloType getHelloType() {
      com.ejyi.demo.springboot.grpc.proto.hello.HelloType result = com.ejyi.demo.springboot.grpc.proto.hello.HelloType.valueOf(helloType_);
      return result == null ? com.ejyi.demo.springboot.grpc.proto.hello.HelloType.UNRECOGNIZED : result;
    }
    /**
     * <code>.helloworld.HelloType HelloType = 3;</code>
     */
    public Builder setHelloType(com.ejyi.demo.springboot.grpc.proto.hello.HelloType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      helloType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.helloworld.HelloType HelloType = 3;</code>
     */
    public Builder clearHelloType() {
      
      helloType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> mapStr_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMapStr() {
      if (mapStr_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MapStrDefaultEntryHolder.defaultEntry);
      }
      return mapStr_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableMapStr() {
      onChanged();;
      if (mapStr_ == null) {
        mapStr_ = com.google.protobuf.MapField.newMapField(
            MapStrDefaultEntryHolder.defaultEntry);
      }
      if (!mapStr_.isMutable()) {
        mapStr_ = mapStr_.copy();
      }
      return mapStr_;
    }

    public int getMapStrCount() {
      return internalGetMapStr().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; mapStr = 4;</code>
     */

    public boolean containsMapStr(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetMapStr().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMapStrMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMapStr() {
      return getMapStrMap();
    }
    /**
     * <code>map&lt;string, string&gt; mapStr = 4;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getMapStrMap() {
      return internalGetMapStr().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; mapStr = 4;</code>
     */

    public java.lang.String getMapStrOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMapStr().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; mapStr = 4;</code>
     */

    public java.lang.String getMapStrOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMapStr().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMapStr() {
      internalGetMutableMapStr().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; mapStr = 4;</code>
     */

    public Builder removeMapStr(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableMapStr().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableMapStr() {
      return internalGetMutableMapStr().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; mapStr = 4;</code>
     */
    public Builder putMapStr(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableMapStr().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; mapStr = 4;</code>
     */

    public Builder putAllMapStr(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMapStr().getMutableMap()
          .putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:helloworld.HelloRequest1)
  }

  // @@protoc_insertion_point(class_scope:helloworld.HelloRequest1)
  private static final com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1();
  }

  public static com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloRequest1>
      PARSER = new com.google.protobuf.AbstractParser<HelloRequest1>() {
    public HelloRequest1 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HelloRequest1(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HelloRequest1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloRequest1> getParserForType() {
    return PARSER;
  }

  public com.ejyi.demo.springboot.grpc.proto.hello.HelloRequest1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

