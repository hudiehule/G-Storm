/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-21")
public class HBRecords implements org.apache.thrift.TBase<HBRecords, HBRecords._Fields>, java.io.Serializable, Cloneable, Comparable<HBRecords> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HBRecords");

  private static final org.apache.thrift.protocol.TField PULSES_FIELD_DESC = new org.apache.thrift.protocol.TField("pulses", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HBRecordsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HBRecordsTupleSchemeFactory();

  public java.util.List<HBPulse> pulses; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PULSES((short)1, "pulses");

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
        case 1: // PULSES
          return PULSES;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PULSES, new org.apache.thrift.meta_data.FieldMetaData("pulses", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HBPulse.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HBRecords.class, metaDataMap);
  }

  public HBRecords() {
  }

  public HBRecords(
    java.util.List<HBPulse> pulses)
  {
    this();
    this.pulses = pulses;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HBRecords(HBRecords other) {
    if (other.isSetPulses()) {
      java.util.List<HBPulse> __this__pulses = new java.util.ArrayList<HBPulse>(other.pulses.size());
      for (HBPulse other_element : other.pulses) {
        __this__pulses.add(new HBPulse(other_element));
      }
      this.pulses = __this__pulses;
    }
  }

  public HBRecords deepCopy() {
    return new HBRecords(this);
  }

  @Override
  public void clear() {
    this.pulses = null;
  }

  public int getPulsesSize() {
    return (this.pulses == null) ? 0 : this.pulses.size();
  }

  public java.util.Iterator<HBPulse> getPulsesIterator() {
    return (this.pulses == null) ? null : this.pulses.iterator();
  }

  public void addToPulses(HBPulse elem) {
    if (this.pulses == null) {
      this.pulses = new java.util.ArrayList<HBPulse>();
    }
    this.pulses.add(elem);
  }

  public java.util.List<HBPulse> getPulses() {
    return this.pulses;
  }

  public HBRecords setPulses(java.util.List<HBPulse> pulses) {
    this.pulses = pulses;
    return this;
  }

  public void unsetPulses() {
    this.pulses = null;
  }

  /** Returns true if field pulses is set (has been assigned a value) and false otherwise */
  public boolean isSetPulses() {
    return this.pulses != null;
  }

  public void setPulsesIsSet(boolean value) {
    if (!value) {
      this.pulses = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case PULSES:
      if (value == null) {
        unsetPulses();
      } else {
        setPulses((java.util.List<HBPulse>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PULSES:
      return getPulses();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PULSES:
      return isSetPulses();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof HBRecords)
      return this.equals((HBRecords)that);
    return false;
  }

  public boolean equals(HBRecords that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_pulses = true && this.isSetPulses();
    boolean that_present_pulses = true && that.isSetPulses();
    if (this_present_pulses || that_present_pulses) {
      if (!(this_present_pulses && that_present_pulses))
        return false;
      if (!this.pulses.equals(that.pulses))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPulses()) ? 131071 : 524287);
    if (isSetPulses())
      hashCode = hashCode * 8191 + pulses.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(HBRecords other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPulses()).compareTo(other.isSetPulses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPulses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pulses, other.pulses);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("HBRecords(");
    boolean first = true;

    sb.append("pulses:");
    if (this.pulses == null) {
      sb.append("null");
    } else {
      sb.append(this.pulses);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HBRecordsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HBRecordsStandardScheme getScheme() {
      return new HBRecordsStandardScheme();
    }
  }

  private static class HBRecordsStandardScheme extends org.apache.thrift.scheme.StandardScheme<HBRecords> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HBRecords struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PULSES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list792 = iprot.readListBegin();
                struct.pulses = new java.util.ArrayList<HBPulse>(_list792.size);
                HBPulse _elem793;
                for (int _i794 = 0; _i794 < _list792.size; ++_i794)
                {
                  _elem793 = new HBPulse();
                  _elem793.read(iprot);
                  struct.pulses.add(_elem793);
                }
                iprot.readListEnd();
              }
              struct.setPulsesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HBRecords struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pulses != null) {
        oprot.writeFieldBegin(PULSES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.pulses.size()));
          for (HBPulse _iter795 : struct.pulses)
          {
            _iter795.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HBRecordsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HBRecordsTupleScheme getScheme() {
      return new HBRecordsTupleScheme();
    }
  }

  private static class HBRecordsTupleScheme extends org.apache.thrift.scheme.TupleScheme<HBRecords> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HBRecords struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPulses()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPulses()) {
        {
          oprot.writeI32(struct.pulses.size());
          for (HBPulse _iter796 : struct.pulses)
          {
            _iter796.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HBRecords struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list797 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.pulses = new java.util.ArrayList<HBPulse>(_list797.size);
          HBPulse _elem798;
          for (int _i799 = 0; _i799 < _list797.size; ++_i799)
          {
            _elem798 = new HBPulse();
            _elem798.read(iprot);
            struct.pulses.add(_elem798);
          }
        }
        struct.setPulsesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

