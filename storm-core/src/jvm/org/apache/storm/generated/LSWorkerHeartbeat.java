/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-21")
public class LSWorkerHeartbeat implements org.apache.thrift.TBase<LSWorkerHeartbeat, LSWorkerHeartbeat._Fields>, java.io.Serializable, Cloneable, Comparable<LSWorkerHeartbeat> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LSWorkerHeartbeat");

  private static final org.apache.thrift.protocol.TField TIME_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("time_secs", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TOPOLOGY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("topology_id", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXECUTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("executors", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LSWorkerHeartbeatStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LSWorkerHeartbeatTupleSchemeFactory();

  public int time_secs; // required
  public java.lang.String topology_id; // required
  public java.util.List<ExecutorInfo> executors; // required
  public int port; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TIME_SECS((short)1, "time_secs"),
    TOPOLOGY_ID((short)2, "topology_id"),
    EXECUTORS((short)3, "executors"),
    PORT((short)4, "port");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TIME_SECS
          return TIME_SECS;
        case 2: // TOPOLOGY_ID
          return TOPOLOGY_ID;
        case 3: // EXECUTORS
          return EXECUTORS;
        case 4: // PORT
          return PORT;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIME_SECS_ISSET_ID = 0;
  private static final int __PORT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIME_SECS, new org.apache.thrift.meta_data.FieldMetaData("time_secs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOPOLOGY_ID, new org.apache.thrift.meta_data.FieldMetaData("topology_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXECUTORS, new org.apache.thrift.meta_data.FieldMetaData("executors", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ExecutorInfo.class))));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LSWorkerHeartbeat.class, metaDataMap);
  }

  public LSWorkerHeartbeat() {
  }

  public LSWorkerHeartbeat(
    int time_secs,
    java.lang.String topology_id,
    java.util.List<ExecutorInfo> executors,
    int port)
  {
    this();
    this.time_secs = time_secs;
    setTime_secsIsSet(true);
    this.topology_id = topology_id;
    this.executors = executors;
    this.port = port;
    setPortIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LSWorkerHeartbeat(LSWorkerHeartbeat other) {
    __isset_bitfield = other.__isset_bitfield;
    this.time_secs = other.time_secs;
    if (other.isSetTopology_id()) {
      this.topology_id = other.topology_id;
    }
    if (other.isSetExecutors()) {
      java.util.List<ExecutorInfo> __this__executors = new java.util.ArrayList<ExecutorInfo>(other.executors.size());
      for (ExecutorInfo other_element : other.executors) {
        __this__executors.add(new ExecutorInfo(other_element));
      }
      this.executors = __this__executors;
    }
    this.port = other.port;
  }

  public LSWorkerHeartbeat deepCopy() {
    return new LSWorkerHeartbeat(this);
  }

  @Override
  public void clear() {
    setTime_secsIsSet(false);
    this.time_secs = 0;
    this.topology_id = null;
    this.executors = null;
    setPortIsSet(false);
    this.port = 0;
  }

  public int getTime_secs() {
    return this.time_secs;
  }

  public LSWorkerHeartbeat setTime_secs(int time_secs) {
    this.time_secs = time_secs;
    setTime_secsIsSet(true);
    return this;
  }

  public void unsetTime_secs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIME_SECS_ISSET_ID);
  }

  /** Returns true if field time_secs is set (has been assigned a value) and false otherwise */
  public boolean isSetTime_secs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIME_SECS_ISSET_ID);
  }

  public void setTime_secsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIME_SECS_ISSET_ID, value);
  }

  public java.lang.String getTopology_id() {
    return this.topology_id;
  }

  public LSWorkerHeartbeat setTopology_id(java.lang.String topology_id) {
    this.topology_id = topology_id;
    return this;
  }

  public void unsetTopology_id() {
    this.topology_id = null;
  }

  /** Returns true if field topology_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTopology_id() {
    return this.topology_id != null;
  }

  public void setTopology_idIsSet(boolean value) {
    if (!value) {
      this.topology_id = null;
    }
  }

  public int getExecutorsSize() {
    return (this.executors == null) ? 0 : this.executors.size();
  }

  public java.util.Iterator<ExecutorInfo> getExecutorsIterator() {
    return (this.executors == null) ? null : this.executors.iterator();
  }

  public void addToExecutors(ExecutorInfo elem) {
    if (this.executors == null) {
      this.executors = new java.util.ArrayList<ExecutorInfo>();
    }
    this.executors.add(elem);
  }

  public java.util.List<ExecutorInfo> getExecutors() {
    return this.executors;
  }

  public LSWorkerHeartbeat setExecutors(java.util.List<ExecutorInfo> executors) {
    this.executors = executors;
    return this;
  }

  public void unsetExecutors() {
    this.executors = null;
  }

  /** Returns true if field executors is set (has been assigned a value) and false otherwise */
  public boolean isSetExecutors() {
    return this.executors != null;
  }

  public void setExecutorsIsSet(boolean value) {
    if (!value) {
      this.executors = null;
    }
  }

  public int getPort() {
    return this.port;
  }

  public LSWorkerHeartbeat setPort(int port) {
    this.port = port;
    setPortIsSet(true);
    return this;
  }

  public void unsetPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean isSetPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  public void setPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TIME_SECS:
      if (value == null) {
        unsetTime_secs();
      } else {
        setTime_secs((java.lang.Integer)value);
      }
      break;

    case TOPOLOGY_ID:
      if (value == null) {
        unsetTopology_id();
      } else {
        setTopology_id((java.lang.String)value);
      }
      break;

    case EXECUTORS:
      if (value == null) {
        unsetExecutors();
      } else {
        setExecutors((java.util.List<ExecutorInfo>)value);
      }
      break;

    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TIME_SECS:
      return getTime_secs();

    case TOPOLOGY_ID:
      return getTopology_id();

    case EXECUTORS:
      return getExecutors();

    case PORT:
      return getPort();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TIME_SECS:
      return isSetTime_secs();
    case TOPOLOGY_ID:
      return isSetTopology_id();
    case EXECUTORS:
      return isSetExecutors();
    case PORT:
      return isSetPort();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof LSWorkerHeartbeat)
      return this.equals((LSWorkerHeartbeat)that);
    return false;
  }

  public boolean equals(LSWorkerHeartbeat that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_time_secs = true;
    boolean that_present_time_secs = true;
    if (this_present_time_secs || that_present_time_secs) {
      if (!(this_present_time_secs && that_present_time_secs))
        return false;
      if (this.time_secs != that.time_secs)
        return false;
    }

    boolean this_present_topology_id = true && this.isSetTopology_id();
    boolean that_present_topology_id = true && that.isSetTopology_id();
    if (this_present_topology_id || that_present_topology_id) {
      if (!(this_present_topology_id && that_present_topology_id))
        return false;
      if (!this.topology_id.equals(that.topology_id))
        return false;
    }

    boolean this_present_executors = true && this.isSetExecutors();
    boolean that_present_executors = true && that.isSetExecutors();
    if (this_present_executors || that_present_executors) {
      if (!(this_present_executors && that_present_executors))
        return false;
      if (!this.executors.equals(that.executors))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + time_secs;

    hashCode = hashCode * 8191 + ((isSetTopology_id()) ? 131071 : 524287);
    if (isSetTopology_id())
      hashCode = hashCode * 8191 + topology_id.hashCode();

    hashCode = hashCode * 8191 + ((isSetExecutors()) ? 131071 : 524287);
    if (isSetExecutors())
      hashCode = hashCode * 8191 + executors.hashCode();

    hashCode = hashCode * 8191 + port;

    return hashCode;
  }

  @Override
  public int compareTo(LSWorkerHeartbeat other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTime_secs()).compareTo(other.isSetTime_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time_secs, other.time_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTopology_id()).compareTo(other.isSetTopology_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopology_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topology_id, other.topology_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExecutors()).compareTo(other.isSetExecutors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExecutors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executors, other.executors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPort()).compareTo(other.isSetPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("LSWorkerHeartbeat(");
    boolean first = true;

    sb.append("time_secs:");
    sb.append(this.time_secs);
    first = false;
    if (!first) sb.append(", ");
    sb.append("topology_id:");
    if (this.topology_id == null) {
      sb.append("null");
    } else {
      sb.append(this.topology_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("executors:");
    if (this.executors == null) {
      sb.append("null");
    } else {
      sb.append(this.executors);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'time_secs' because it's a primitive and you chose the non-beans generator.
    if (topology_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topology_id' was not present! Struct: " + toString());
    }
    if (executors == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'executors' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'port' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LSWorkerHeartbeatStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LSWorkerHeartbeatStandardScheme getScheme() {
      return new LSWorkerHeartbeatStandardScheme();
    }
  }

  private static class LSWorkerHeartbeatStandardScheme extends org.apache.thrift.scheme.StandardScheme<LSWorkerHeartbeat> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LSWorkerHeartbeat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIME_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.time_secs = iprot.readI32();
              struct.setTime_secsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPOLOGY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.topology_id = iprot.readString();
              struct.setTopology_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXECUTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list742 = iprot.readListBegin();
                struct.executors = new java.util.ArrayList<ExecutorInfo>(_list742.size);
                ExecutorInfo _elem743;
                for (int _i744 = 0; _i744 < _list742.size; ++_i744)
                {
                  _elem743 = new ExecutorInfo();
                  _elem743.read(iprot);
                  struct.executors.add(_elem743);
                }
                iprot.readListEnd();
              }
              struct.setExecutorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
              struct.setPortIsSet(true);
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
      if (!struct.isSetTime_secs()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'time_secs' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetPort()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'port' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LSWorkerHeartbeat struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TIME_SECS_FIELD_DESC);
      oprot.writeI32(struct.time_secs);
      oprot.writeFieldEnd();
      if (struct.topology_id != null) {
        oprot.writeFieldBegin(TOPOLOGY_ID_FIELD_DESC);
        oprot.writeString(struct.topology_id);
        oprot.writeFieldEnd();
      }
      if (struct.executors != null) {
        oprot.writeFieldBegin(EXECUTORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.executors.size()));
          for (ExecutorInfo _iter745 : struct.executors)
          {
            _iter745.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PORT_FIELD_DESC);
      oprot.writeI32(struct.port);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LSWorkerHeartbeatTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LSWorkerHeartbeatTupleScheme getScheme() {
      return new LSWorkerHeartbeatTupleScheme();
    }
  }

  private static class LSWorkerHeartbeatTupleScheme extends org.apache.thrift.scheme.TupleScheme<LSWorkerHeartbeat> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LSWorkerHeartbeat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.time_secs);
      oprot.writeString(struct.topology_id);
      {
        oprot.writeI32(struct.executors.size());
        for (ExecutorInfo _iter746 : struct.executors)
        {
          _iter746.write(oprot);
        }
      }
      oprot.writeI32(struct.port);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LSWorkerHeartbeat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.time_secs = iprot.readI32();
      struct.setTime_secsIsSet(true);
      struct.topology_id = iprot.readString();
      struct.setTopology_idIsSet(true);
      {
        org.apache.thrift.protocol.TList _list747 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.executors = new java.util.ArrayList<ExecutorInfo>(_list747.size);
        ExecutorInfo _elem748;
        for (int _i749 = 0; _i749 < _list747.size; ++_i749)
        {
          _elem748 = new ExecutorInfo();
          _elem748.read(iprot);
          struct.executors.add(_elem748);
        }
      }
      struct.setExecutorsIsSet(true);
      struct.port = iprot.readI32();
      struct.setPortIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

