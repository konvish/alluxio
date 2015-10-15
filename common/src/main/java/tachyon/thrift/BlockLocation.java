/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-15")
public class BlockLocation implements org.apache.thrift.TBase<BlockLocation, BlockLocation._Fields>, java.io.Serializable, Cloneable, Comparable<BlockLocation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BlockLocation");

  private static final org.apache.thrift.protocol.TField WORKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("workerId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField WORKER_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("workerAddress", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField TIER_FIELD_DESC = new org.apache.thrift.protocol.TField("tier", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BlockLocationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BlockLocationTupleSchemeFactory());
  }

  public long workerId; // required
  public NetAddress workerAddress; // required
  public int tier; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WORKER_ID((short)1, "workerId"),
    WORKER_ADDRESS((short)2, "workerAddress"),
    TIER((short)3, "tier");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // WORKER_ID
          return WORKER_ID;
        case 2: // WORKER_ADDRESS
          return WORKER_ADDRESS;
        case 3: // TIER
          return TIER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __WORKERID_ISSET_ID = 0;
  private static final int __TIER_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WORKER_ID, new org.apache.thrift.meta_data.FieldMetaData("workerId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.WORKER_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("workerAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NetAddress.class)));
    tmpMap.put(_Fields.TIER, new org.apache.thrift.meta_data.FieldMetaData("tier", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BlockLocation.class, metaDataMap);
  }

  public BlockLocation() {
  }

  public BlockLocation(
    long workerId,
    NetAddress workerAddress,
    int tier)
  {
    this();
    this.workerId = workerId;
    setWorkerIdIsSet(true);
    this.workerAddress = workerAddress;
    this.tier = tier;
    setTierIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BlockLocation(BlockLocation other) {
    __isset_bitfield = other.__isset_bitfield;
    this.workerId = other.workerId;
    if (other.isSetWorkerAddress()) {
      this.workerAddress = new NetAddress(other.workerAddress);
    }
    this.tier = other.tier;
  }

  public BlockLocation deepCopy() {
    return new BlockLocation(this);
  }

  @Override
  public void clear() {
    setWorkerIdIsSet(false);
    this.workerId = 0;
    this.workerAddress = null;
    setTierIsSet(false);
    this.tier = 0;
  }

  public long getWorkerId() {
    return this.workerId;
  }

  public BlockLocation setWorkerId(long workerId) {
    this.workerId = workerId;
    setWorkerIdIsSet(true);
    return this;
  }

  public void unsetWorkerId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WORKERID_ISSET_ID);
  }

  /** Returns true if field workerId is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkerId() {
    return EncodingUtils.testBit(__isset_bitfield, __WORKERID_ISSET_ID);
  }

  public void setWorkerIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WORKERID_ISSET_ID, value);
  }

  public NetAddress getWorkerAddress() {
    return this.workerAddress;
  }

  public BlockLocation setWorkerAddress(NetAddress workerAddress) {
    this.workerAddress = workerAddress;
    return this;
  }

  public void unsetWorkerAddress() {
    this.workerAddress = null;
  }

  /** Returns true if field workerAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkerAddress() {
    return this.workerAddress != null;
  }

  public void setWorkerAddressIsSet(boolean value) {
    if (!value) {
      this.workerAddress = null;
    }
  }

  public int getTier() {
    return this.tier;
  }

  public BlockLocation setTier(int tier) {
    this.tier = tier;
    setTierIsSet(true);
    return this;
  }

  public void unsetTier() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIER_ISSET_ID);
  }

  /** Returns true if field tier is set (has been assigned a value) and false otherwise */
  public boolean isSetTier() {
    return EncodingUtils.testBit(__isset_bitfield, __TIER_ISSET_ID);
  }

  public void setTierIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WORKER_ID:
      if (value == null) {
        unsetWorkerId();
      } else {
        setWorkerId((Long)value);
      }
      break;

    case WORKER_ADDRESS:
      if (value == null) {
        unsetWorkerAddress();
      } else {
        setWorkerAddress((NetAddress)value);
      }
      break;

    case TIER:
      if (value == null) {
        unsetTier();
      } else {
        setTier((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WORKER_ID:
      return Long.valueOf(getWorkerId());

    case WORKER_ADDRESS:
      return getWorkerAddress();

    case TIER:
      return Integer.valueOf(getTier());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WORKER_ID:
      return isSetWorkerId();
    case WORKER_ADDRESS:
      return isSetWorkerAddress();
    case TIER:
      return isSetTier();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BlockLocation)
      return this.equals((BlockLocation)that);
    return false;
  }

  public boolean equals(BlockLocation that) {
    if (that == null)
      return false;

    boolean this_present_workerId = true;
    boolean that_present_workerId = true;
    if (this_present_workerId || that_present_workerId) {
      if (!(this_present_workerId && that_present_workerId))
        return false;
      if (this.workerId != that.workerId)
        return false;
    }

    boolean this_present_workerAddress = true && this.isSetWorkerAddress();
    boolean that_present_workerAddress = true && that.isSetWorkerAddress();
    if (this_present_workerAddress || that_present_workerAddress) {
      if (!(this_present_workerAddress && that_present_workerAddress))
        return false;
      if (!this.workerAddress.equals(that.workerAddress))
        return false;
    }

    boolean this_present_tier = true;
    boolean that_present_tier = true;
    if (this_present_tier || that_present_tier) {
      if (!(this_present_tier && that_present_tier))
        return false;
      if (this.tier != that.tier)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_workerId = true;
    list.add(present_workerId);
    if (present_workerId)
      list.add(workerId);

    boolean present_workerAddress = true && (isSetWorkerAddress());
    list.add(present_workerAddress);
    if (present_workerAddress)
      list.add(workerAddress);

    boolean present_tier = true;
    list.add(present_tier);
    if (present_tier)
      list.add(tier);

    return list.hashCode();
  }

  @Override
  public int compareTo(BlockLocation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWorkerId()).compareTo(other.isSetWorkerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workerId, other.workerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWorkerAddress()).compareTo(other.isSetWorkerAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkerAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workerAddress, other.workerAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTier()).compareTo(other.isSetTier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tier, other.tier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BlockLocation(");
    boolean first = true;

    sb.append("workerId:");
    sb.append(this.workerId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("workerAddress:");
    if (this.workerAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.workerAddress);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tier:");
    sb.append(this.tier);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (workerAddress != null) {
      workerAddress.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BlockLocationStandardSchemeFactory implements SchemeFactory {
    public BlockLocationStandardScheme getScheme() {
      return new BlockLocationStandardScheme();
    }
  }

  private static class BlockLocationStandardScheme extends StandardScheme<BlockLocation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BlockLocation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WORKER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.workerId = iprot.readI64();
              struct.setWorkerIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WORKER_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.workerAddress = new NetAddress();
              struct.workerAddress.read(iprot);
              struct.setWorkerAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tier = iprot.readI32();
              struct.setTierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BlockLocation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(WORKER_ID_FIELD_DESC);
      oprot.writeI64(struct.workerId);
      oprot.writeFieldEnd();
      if (struct.workerAddress != null) {
        oprot.writeFieldBegin(WORKER_ADDRESS_FIELD_DESC);
        struct.workerAddress.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIER_FIELD_DESC);
      oprot.writeI32(struct.tier);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BlockLocationTupleSchemeFactory implements SchemeFactory {
    public BlockLocationTupleScheme getScheme() {
      return new BlockLocationTupleScheme();
    }
  }

  private static class BlockLocationTupleScheme extends TupleScheme<BlockLocation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BlockLocation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetWorkerId()) {
        optionals.set(0);
      }
      if (struct.isSetWorkerAddress()) {
        optionals.set(1);
      }
      if (struct.isSetTier()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetWorkerId()) {
        oprot.writeI64(struct.workerId);
      }
      if (struct.isSetWorkerAddress()) {
        struct.workerAddress.write(oprot);
      }
      if (struct.isSetTier()) {
        oprot.writeI32(struct.tier);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BlockLocation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.workerId = iprot.readI64();
        struct.setWorkerIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.workerAddress = new NetAddress();
        struct.workerAddress.read(iprot);
        struct.setWorkerAddressIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tier = iprot.readI32();
        struct.setTierIsSet(true);
      }
    }
  }

}

