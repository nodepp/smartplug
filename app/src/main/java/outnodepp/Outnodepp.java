// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: outnodepp.proto

package outnodepp;

public final class Outnodepp {
  private Outnodepp() {}
  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DataOrBuilder
          extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 did = 7;
    /**
     * <code>optional uint64 did = 7;</code>
     *
     * <pre>
     *did
     * </pre>
     */
    boolean hasDid();
    /**
     * <code>optional uint64 did = 7;</code>
     *
     * <pre>
     *did
     * </pre>
     */
    long getDid();

    // optional uint64 uid = 8;
    /**
     * <code>optional uint64 uid = 8;</code>
     *
     * <pre>
     *uid
     * </pre>
     */
    boolean hasUid();
    /**
     * <code>optional uint64 uid = 8;</code>
     *
     * <pre>
     *uid
     * </pre>
     */
    long getUid();

    // optional bytes interdata = 11;
    /**
     * <code>optional bytes interdata = 11;</code>
     *
     * <pre>
     *ƒ⁄≤„pb ˝æ›
     * </pre>
     */
    boolean hasInterdata();
    /**
     * <code>optional bytes interdata = 11;</code>
     *
     * <pre>
     *ƒ⁄≤„pb ˝æ›
     * </pre>
     */
    com.google.protobuf.ByteString getInterdata();
  }
  /**
   * Protobuf type {@code outnodepp.Data}
   */
  public static final class Data extends
          com.google.protobuf.GeneratedMessage
          implements DataOrBuilder {
    // Use Data.newBuilder() to construct.
    private Data(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Data(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Data defaultInstance;
    public static Data getDefaultInstance() {
      return defaultInstance;
    }

    public Data getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Data(
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
            case 56: {
              bitField0_ |= 0x00000001;
              did_ = input.readUInt64();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000002;
              uid_ = input.readUInt64();
              break;
            }
            case 90: {
              bitField0_ |= 0x00000004;
              interdata_ = input.readBytes();
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
      return outnodepp.Outnodepp.internal_static_outnodepp_Data_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return outnodepp.Outnodepp.internal_static_outnodepp_Data_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      outnodepp.Outnodepp.Data.class, outnodepp.Outnodepp.Data.Builder.class);
    }

    public static com.google.protobuf.Parser<Data> PARSER =
            new com.google.protobuf.AbstractParser<Data>() {
              public Data parsePartialFrom(
                      com.google.protobuf.CodedInputStream input,
                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                      throws com.google.protobuf.InvalidProtocolBufferException {
                return new Data(input, extensionRegistry);
              }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<Data> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional uint64 did = 7;
    public static final int DID_FIELD_NUMBER = 7;
    private long did_;
    /**
     * <code>optional uint64 did = 7;</code>
     *
     * <pre>
     *did
     * </pre>
     */
    public boolean hasDid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 did = 7;</code>
     *
     * <pre>
     *did
     * </pre>
     */
    public long getDid() {
      return did_;
    }

    // optional uint64 uid = 8;
    public static final int UID_FIELD_NUMBER = 8;
    private long uid_;
    /**
     * <code>optional uint64 uid = 8;</code>
     *
     * <pre>
     *uid
     * </pre>
     */
    public boolean hasUid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 uid = 8;</code>
     *
     * <pre>
     *uid
     * </pre>
     */
    public long getUid() {
      return uid_;
    }

    // optional bytes interdata = 11;
    public static final int INTERDATA_FIELD_NUMBER = 11;
    private com.google.protobuf.ByteString interdata_;
    /**
     * <code>optional bytes interdata = 11;</code>
     *
     * <pre>
     *ƒ⁄≤„pb ˝æ›
     * </pre>
     */
    public boolean hasInterdata() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes interdata = 11;</code>
     *
     * <pre>
     *ƒ⁄≤„pb ˝æ›
     * </pre>
     */
    public com.google.protobuf.ByteString getInterdata() {
      return interdata_;
    }

    private void initFields() {
      did_ = 0L;
      uid_ = 0L;
      interdata_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(7, did_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(8, uid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(11, interdata_);
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
                .computeUInt64Size(7, did_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
                .computeUInt64Size(8, uid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
                .computeBytesSize(11, interdata_);
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

    public static outnodepp.Outnodepp.Data parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static outnodepp.Outnodepp.Data parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static outnodepp.Outnodepp.Data parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static outnodepp.Outnodepp.Data parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static outnodepp.Outnodepp.Data parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static outnodepp.Outnodepp.Data parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static outnodepp.Outnodepp.Data parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static outnodepp.Outnodepp.Data parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static outnodepp.Outnodepp.Data parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static outnodepp.Outnodepp.Data parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(outnodepp.Outnodepp.Data prototype) {
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
     * Protobuf type {@code outnodepp.Data}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements outnodepp.Outnodepp.DataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return outnodepp.Outnodepp.internal_static_outnodepp_Data_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return outnodepp.Outnodepp.internal_static_outnodepp_Data_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        outnodepp.Outnodepp.Data.class, outnodepp.Outnodepp.Data.Builder.class);
      }

      // Construct using outnodepp.Outnodepp.Data.newBuilder()
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
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        did_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        interdata_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return outnodepp.Outnodepp.internal_static_outnodepp_Data_descriptor;
      }

      public outnodepp.Outnodepp.Data getDefaultInstanceForType() {
        return outnodepp.Outnodepp.Data.getDefaultInstance();
      }

      public outnodepp.Outnodepp.Data build() {
        outnodepp.Outnodepp.Data result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public outnodepp.Outnodepp.Data buildPartial() {
        outnodepp.Outnodepp.Data result = new outnodepp.Outnodepp.Data(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.did_ = did_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.uid_ = uid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.interdata_ = interdata_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof outnodepp.Outnodepp.Data) {
          return mergeFrom((outnodepp.Outnodepp.Data)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(outnodepp.Outnodepp.Data other) {
        if (other == outnodepp.Outnodepp.Data.getDefaultInstance()) return this;
        if (other.hasDid()) {
          setDid(other.getDid());
        }
        if (other.hasUid()) {
          setUid(other.getUid());
        }
        if (other.hasInterdata()) {
          setInterdata(other.getInterdata());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        outnodepp.Outnodepp.Data parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (outnodepp.Outnodepp.Data) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional uint64 did = 7;
      private long did_ ;
      /**
       * <code>optional uint64 did = 7;</code>
       *
       * <pre>
       *did
       * </pre>
       */
      public boolean hasDid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 did = 7;</code>
       *
       * <pre>
       *did
       * </pre>
       */
      public long getDid() {
        return did_;
      }
      /**
       * <code>optional uint64 did = 7;</code>
       *
       * <pre>
       *did
       * </pre>
       */
      public Builder setDid(long value) {
        bitField0_ |= 0x00000001;
        did_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 did = 7;</code>
       *
       * <pre>
       *did
       * </pre>
       */
      public Builder clearDid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        did_ = 0L;
        onChanged();
        return this;
      }

      // optional uint64 uid = 8;
      private long uid_ ;
      /**
       * <code>optional uint64 uid = 8;</code>
       *
       * <pre>
       *uid
       * </pre>
       */
      public boolean hasUid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint64 uid = 8;</code>
       *
       * <pre>
       *uid
       * </pre>
       */
      public long getUid() {
        return uid_;
      }
      /**
       * <code>optional uint64 uid = 8;</code>
       *
       * <pre>
       *uid
       * </pre>
       */
      public Builder setUid(long value) {
        bitField0_ |= 0x00000002;
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 uid = 8;</code>
       *
       * <pre>
       *uid
       * </pre>
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        uid_ = 0L;
        onChanged();
        return this;
      }

      // optional bytes interdata = 11;
      private com.google.protobuf.ByteString interdata_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes interdata = 11;</code>
       *
       * <pre>
       *ƒ⁄≤„pb ˝æ›
       * </pre>
       */
      public boolean hasInterdata() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bytes interdata = 11;</code>
       *
       * <pre>
       *ƒ⁄≤„pb ˝æ›
       * </pre>
       */
      public com.google.protobuf.ByteString getInterdata() {
        return interdata_;
      }
      /**
       * <code>optional bytes interdata = 11;</code>
       *
       * <pre>
       *ƒ⁄≤„pb ˝æ›
       * </pre>
       */
      public Builder setInterdata(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        interdata_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes interdata = 11;</code>
       *
       * <pre>
       *ƒ⁄≤„pb ˝æ›
       * </pre>
       */
      public Builder clearInterdata() {
        bitField0_ = (bitField0_ & ~0x00000004);
        interdata_ = getDefaultInstance().getInterdata();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:outnodepp.Data)
    }

    static {
      defaultInstance = new Data(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:outnodepp.Data)
  }

  private static com.google.protobuf.Descriptors.Descriptor
          internal_static_outnodepp_Data_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internal_static_outnodepp_Data_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
          descriptor;
  static {
    java.lang.String[] descriptorData = {
            "\n\017outnodepp.proto\022\toutnodepp\"3\n\004Data\022\013\n\003" +
                    "did\030\007 \001(\004\022\013\n\003uid\030\010 \001(\004\022\021\n\tinterdata\030\013 \001(" +
                    "\014"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
            new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
              public com.google.protobuf.ExtensionRegistry assignDescriptors(
                      com.google.protobuf.Descriptors.FileDescriptor root) {
                descriptor = root;
                internal_static_outnodepp_Data_descriptor =
                        getDescriptor().getMessageTypes().get(0);
                internal_static_outnodepp_Data_fieldAccessorTable = new
                        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                        internal_static_outnodepp_Data_descriptor,
                        new java.lang.String[] { "Did", "Uid", "Interdata", });
                return null;
              }
            };
    com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(descriptorData,
                    new com.google.protobuf.Descriptors.FileDescriptor[] {
                    }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
