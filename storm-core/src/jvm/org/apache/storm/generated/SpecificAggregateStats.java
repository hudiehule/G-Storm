/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class SpecificAggregateStats extends org.apache.thrift.TUnion<SpecificAggregateStats, SpecificAggregateStats._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SpecificAggregateStats");
  private static final org.apache.thrift.protocol.TField BOLT_FIELD_DESC = new org.apache.thrift.protocol.TField("bolt", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SPOUT_FIELD_DESC = new org.apache.thrift.protocol.TField("spout", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField GPU_BOLT_FIELD_DESC = new org.apache.thrift.protocol.TField("gpu_bolt", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOLT((short)1, "bolt"),
    SPOUT((short)2, "spout"),
    GPU_BOLT((short)3, "gpu_bolt");

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
        case 1: // BOLT
          return BOLT;
        case 2: // SPOUT
          return SPOUT;
        case 3: // GPU_BOLT
          return GPU_BOLT;
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

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOLT, new org.apache.thrift.meta_data.FieldMetaData("bolt", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BoltAggregateStats.class)));
    tmpMap.put(_Fields.SPOUT, new org.apache.thrift.meta_data.FieldMetaData("spout", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SpoutAggregateStats.class)));
    tmpMap.put(_Fields.GPU_BOLT, new org.apache.thrift.meta_data.FieldMetaData("gpu_bolt", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GPUBoltAggregateStats.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SpecificAggregateStats.class, metaDataMap);
  }

  public SpecificAggregateStats() {
    super();
  }

  public SpecificAggregateStats(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public SpecificAggregateStats(SpecificAggregateStats other) {
    super(other);
  }
  public SpecificAggregateStats deepCopy() {
    return new SpecificAggregateStats(this);
  }

  public static SpecificAggregateStats bolt(BoltAggregateStats value) {
    SpecificAggregateStats x = new SpecificAggregateStats();
    x.setBolt(value);
    return x;
  }

  public static SpecificAggregateStats spout(SpoutAggregateStats value) {
    SpecificAggregateStats x = new SpecificAggregateStats();
    x.setSpout(value);
    return x;
  }

  public static SpecificAggregateStats gpu_bolt(GPUBoltAggregateStats value) {
    SpecificAggregateStats x = new SpecificAggregateStats();
    x.setGpu_bolt(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case BOLT:
        if (value instanceof BoltAggregateStats) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type BoltAggregateStats for field 'bolt', but got " + value.getClass().getSimpleName());
      case SPOUT:
        if (value instanceof SpoutAggregateStats) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type SpoutAggregateStats for field 'spout', but got " + value.getClass().getSimpleName());
      case GPU_BOLT:
        if (value instanceof GPUBoltAggregateStats) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type GPUBoltAggregateStats for field 'gpu_bolt', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case BOLT:
          if (field.type == BOLT_FIELD_DESC.type) {
            BoltAggregateStats bolt;
            bolt = new BoltAggregateStats();
            bolt.read(iprot);
            return bolt;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SPOUT:
          if (field.type == SPOUT_FIELD_DESC.type) {
            SpoutAggregateStats spout;
            spout = new SpoutAggregateStats();
            spout.read(iprot);
            return spout;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case GPU_BOLT:
          if (field.type == GPU_BOLT_FIELD_DESC.type) {
            GPUBoltAggregateStats gpu_bolt;
            gpu_bolt = new GPUBoltAggregateStats();
            gpu_bolt.read(iprot);
            return gpu_bolt;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BOLT:
        BoltAggregateStats bolt = (BoltAggregateStats)value_;
        bolt.write(oprot);
        return;
      case SPOUT:
        SpoutAggregateStats spout = (SpoutAggregateStats)value_;
        spout.write(oprot);
        return;
      case GPU_BOLT:
        GPUBoltAggregateStats gpu_bolt = (GPUBoltAggregateStats)value_;
        gpu_bolt.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case BOLT:
          BoltAggregateStats bolt;
          bolt = new BoltAggregateStats();
          bolt.read(iprot);
          return bolt;
        case SPOUT:
          SpoutAggregateStats spout;
          spout = new SpoutAggregateStats();
          spout.read(iprot);
          return spout;
        case GPU_BOLT:
          GPUBoltAggregateStats gpu_bolt;
          gpu_bolt = new GPUBoltAggregateStats();
          gpu_bolt.read(iprot);
          return gpu_bolt;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BOLT:
        BoltAggregateStats bolt = (BoltAggregateStats)value_;
        bolt.write(oprot);
        return;
      case SPOUT:
        SpoutAggregateStats spout = (SpoutAggregateStats)value_;
        spout.write(oprot);
        return;
      case GPU_BOLT:
        GPUBoltAggregateStats gpu_bolt = (GPUBoltAggregateStats)value_;
        gpu_bolt.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case BOLT:
        return BOLT_FIELD_DESC;
      case SPOUT:
        return SPOUT_FIELD_DESC;
      case GPU_BOLT:
        return GPU_BOLT_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public BoltAggregateStats getBolt() {
    if (getSetField() == _Fields.BOLT) {
      return (BoltAggregateStats)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'bolt' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBolt(BoltAggregateStats value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.BOLT;
    value_ = value;
  }

  public SpoutAggregateStats getSpout() {
    if (getSetField() == _Fields.SPOUT) {
      return (SpoutAggregateStats)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'spout' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSpout(SpoutAggregateStats value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.SPOUT;
    value_ = value;
  }

  public GPUBoltAggregateStats getGpu_bolt() {
    if (getSetField() == _Fields.GPU_BOLT) {
      return (GPUBoltAggregateStats)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'gpu_bolt' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setGpu_bolt(GPUBoltAggregateStats value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.GPU_BOLT;
    value_ = value;
  }

  public boolean isSetBolt() {
    return setField_ == _Fields.BOLT;
  }


  public boolean isSetSpout() {
    return setField_ == _Fields.SPOUT;
  }


  public boolean isSetGpu_bolt() {
    return setField_ == _Fields.GPU_BOLT;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof SpecificAggregateStats) {
      return equals((SpecificAggregateStats)other);
    } else {
      return false;
    }
  }

  public boolean equals(SpecificAggregateStats other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(SpecificAggregateStats other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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


}
