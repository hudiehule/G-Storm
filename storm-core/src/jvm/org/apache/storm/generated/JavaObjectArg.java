/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class JavaObjectArg extends org.apache.thrift.TUnion<JavaObjectArg, JavaObjectArg._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JavaObjectArg");
  private static final org.apache.thrift.protocol.TField INT_ARG_FIELD_DESC = new org.apache.thrift.protocol.TField("int_arg", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LONG_ARG_FIELD_DESC = new org.apache.thrift.protocol.TField("long_arg", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField STRING_ARG_FIELD_DESC = new org.apache.thrift.protocol.TField("string_arg", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField BOOL_ARG_FIELD_DESC = new org.apache.thrift.protocol.TField("bool_arg", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField BINARY_ARG_FIELD_DESC = new org.apache.thrift.protocol.TField("binary_arg", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField DOUBLE_ARG_FIELD_DESC = new org.apache.thrift.protocol.TField("double_arg", org.apache.thrift.protocol.TType.DOUBLE, (short)6);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INT_ARG((short)1, "int_arg"),
    LONG_ARG((short)2, "long_arg"),
    STRING_ARG((short)3, "string_arg"),
    BOOL_ARG((short)4, "bool_arg"),
    BINARY_ARG((short)5, "binary_arg"),
    DOUBLE_ARG((short)6, "double_arg");

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
        case 1: // INT_ARG
          return INT_ARG;
        case 2: // LONG_ARG
          return LONG_ARG;
        case 3: // STRING_ARG
          return STRING_ARG;
        case 4: // BOOL_ARG
          return BOOL_ARG;
        case 5: // BINARY_ARG
          return BINARY_ARG;
        case 6: // DOUBLE_ARG
          return DOUBLE_ARG;
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
    tmpMap.put(_Fields.INT_ARG, new org.apache.thrift.meta_data.FieldMetaData("int_arg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LONG_ARG, new org.apache.thrift.meta_data.FieldMetaData("long_arg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STRING_ARG, new org.apache.thrift.meta_data.FieldMetaData("string_arg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BOOL_ARG, new org.apache.thrift.meta_data.FieldMetaData("bool_arg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.BINARY_ARG, new org.apache.thrift.meta_data.FieldMetaData("binary_arg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.DOUBLE_ARG, new org.apache.thrift.meta_data.FieldMetaData("double_arg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JavaObjectArg.class, metaDataMap);
  }

  public JavaObjectArg() {
    super();
  }

  public JavaObjectArg(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public JavaObjectArg(JavaObjectArg other) {
    super(other);
  }
  public JavaObjectArg deepCopy() {
    return new JavaObjectArg(this);
  }

  public static JavaObjectArg int_arg(int value) {
    JavaObjectArg x = new JavaObjectArg();
    x.setInt_arg(value);
    return x;
  }

  public static JavaObjectArg long_arg(long value) {
    JavaObjectArg x = new JavaObjectArg();
    x.setLong_arg(value);
    return x;
  }

  public static JavaObjectArg string_arg(java.lang.String value) {
    JavaObjectArg x = new JavaObjectArg();
    x.setString_arg(value);
    return x;
  }

  public static JavaObjectArg bool_arg(boolean value) {
    JavaObjectArg x = new JavaObjectArg();
    x.setBool_arg(value);
    return x;
  }

  public static JavaObjectArg binary_arg(java.nio.ByteBuffer value) {
    JavaObjectArg x = new JavaObjectArg();
    x.setBinary_arg(value);
    return x;
  }

  public static JavaObjectArg binary_arg(byte[] value) {
    JavaObjectArg x = new JavaObjectArg();
    x.setBinary_arg(java.nio.ByteBuffer.wrap(value.clone()));
    return x;
  }

  public static JavaObjectArg double_arg(double value) {
    JavaObjectArg x = new JavaObjectArg();
    x.setDouble_arg(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case INT_ARG:
        if (value instanceof java.lang.Integer) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Integer for field 'int_arg', but got " + value.getClass().getSimpleName());
      case LONG_ARG:
        if (value instanceof java.lang.Long) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Long for field 'long_arg', but got " + value.getClass().getSimpleName());
      case STRING_ARG:
        if (value instanceof java.lang.String) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.String for field 'string_arg', but got " + value.getClass().getSimpleName());
      case BOOL_ARG:
        if (value instanceof java.lang.Boolean) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Boolean for field 'bool_arg', but got " + value.getClass().getSimpleName());
      case BINARY_ARG:
        if (value instanceof java.nio.ByteBuffer) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.nio.ByteBuffer for field 'binary_arg', but got " + value.getClass().getSimpleName());
      case DOUBLE_ARG:
        if (value instanceof java.lang.Double) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Double for field 'double_arg', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case INT_ARG:
          if (field.type == INT_ARG_FIELD_DESC.type) {
            java.lang.Integer int_arg;
            int_arg = iprot.readI32();
            return int_arg;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LONG_ARG:
          if (field.type == LONG_ARG_FIELD_DESC.type) {
            java.lang.Long long_arg;
            long_arg = iprot.readI64();
            return long_arg;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STRING_ARG:
          if (field.type == STRING_ARG_FIELD_DESC.type) {
            java.lang.String string_arg;
            string_arg = iprot.readString();
            return string_arg;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case BOOL_ARG:
          if (field.type == BOOL_ARG_FIELD_DESC.type) {
            java.lang.Boolean bool_arg;
            bool_arg = iprot.readBool();
            return bool_arg;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case BINARY_ARG:
          if (field.type == BINARY_ARG_FIELD_DESC.type) {
            java.nio.ByteBuffer binary_arg;
            binary_arg = iprot.readBinary();
            return binary_arg;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOUBLE_ARG:
          if (field.type == DOUBLE_ARG_FIELD_DESC.type) {
            java.lang.Double double_arg;
            double_arg = iprot.readDouble();
            return double_arg;
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
      case INT_ARG:
        java.lang.Integer int_arg = (java.lang.Integer)value_;
        oprot.writeI32(int_arg);
        return;
      case LONG_ARG:
        java.lang.Long long_arg = (java.lang.Long)value_;
        oprot.writeI64(long_arg);
        return;
      case STRING_ARG:
        java.lang.String string_arg = (java.lang.String)value_;
        oprot.writeString(string_arg);
        return;
      case BOOL_ARG:
        java.lang.Boolean bool_arg = (java.lang.Boolean)value_;
        oprot.writeBool(bool_arg);
        return;
      case BINARY_ARG:
        java.nio.ByteBuffer binary_arg = (java.nio.ByteBuffer)value_;
        oprot.writeBinary(binary_arg);
        return;
      case DOUBLE_ARG:
        java.lang.Double double_arg = (java.lang.Double)value_;
        oprot.writeDouble(double_arg);
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
        case INT_ARG:
          java.lang.Integer int_arg;
          int_arg = iprot.readI32();
          return int_arg;
        case LONG_ARG:
          java.lang.Long long_arg;
          long_arg = iprot.readI64();
          return long_arg;
        case STRING_ARG:
          java.lang.String string_arg;
          string_arg = iprot.readString();
          return string_arg;
        case BOOL_ARG:
          java.lang.Boolean bool_arg;
          bool_arg = iprot.readBool();
          return bool_arg;
        case BINARY_ARG:
          java.nio.ByteBuffer binary_arg;
          binary_arg = iprot.readBinary();
          return binary_arg;
        case DOUBLE_ARG:
          java.lang.Double double_arg;
          double_arg = iprot.readDouble();
          return double_arg;
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
      case INT_ARG:
        java.lang.Integer int_arg = (java.lang.Integer)value_;
        oprot.writeI32(int_arg);
        return;
      case LONG_ARG:
        java.lang.Long long_arg = (java.lang.Long)value_;
        oprot.writeI64(long_arg);
        return;
      case STRING_ARG:
        java.lang.String string_arg = (java.lang.String)value_;
        oprot.writeString(string_arg);
        return;
      case BOOL_ARG:
        java.lang.Boolean bool_arg = (java.lang.Boolean)value_;
        oprot.writeBool(bool_arg);
        return;
      case BINARY_ARG:
        java.nio.ByteBuffer binary_arg = (java.nio.ByteBuffer)value_;
        oprot.writeBinary(binary_arg);
        return;
      case DOUBLE_ARG:
        java.lang.Double double_arg = (java.lang.Double)value_;
        oprot.writeDouble(double_arg);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case INT_ARG:
        return INT_ARG_FIELD_DESC;
      case LONG_ARG:
        return LONG_ARG_FIELD_DESC;
      case STRING_ARG:
        return STRING_ARG_FIELD_DESC;
      case BOOL_ARG:
        return BOOL_ARG_FIELD_DESC;
      case BINARY_ARG:
        return BINARY_ARG_FIELD_DESC;
      case DOUBLE_ARG:
        return DOUBLE_ARG_FIELD_DESC;
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


  public int getInt_arg() {
    if (getSetField() == _Fields.INT_ARG) {
      return (java.lang.Integer)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'int_arg' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setInt_arg(int value) {
    setField_ = _Fields.INT_ARG;
    value_ = value;
  }

  public long getLong_arg() {
    if (getSetField() == _Fields.LONG_ARG) {
      return (java.lang.Long)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'long_arg' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLong_arg(long value) {
    setField_ = _Fields.LONG_ARG;
    value_ = value;
  }

  public java.lang.String getString_arg() {
    if (getSetField() == _Fields.STRING_ARG) {
      return (java.lang.String)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'string_arg' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setString_arg(java.lang.String value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.STRING_ARG;
    value_ = value;
  }

  public boolean getBool_arg() {
    if (getSetField() == _Fields.BOOL_ARG) {
      return (java.lang.Boolean)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'bool_arg' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBool_arg(boolean value) {
    setField_ = _Fields.BOOL_ARG;
    value_ = value;
  }

  public byte[] getBinary_arg() {
    setBinary_arg(org.apache.thrift.TBaseHelper.rightSize(bufferForBinary_arg()));
    java.nio.ByteBuffer b = bufferForBinary_arg();
    return b == null ? null : b.array();
  }

  public java.nio.ByteBuffer bufferForBinary_arg() {
    if (getSetField() == _Fields.BINARY_ARG) {
      return org.apache.thrift.TBaseHelper.copyBinary((java.nio.ByteBuffer)getFieldValue());
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'binary_arg' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBinary_arg(byte[] value) {
    setBinary_arg(java.nio.ByteBuffer.wrap(value.clone()));
  }

  public void setBinary_arg(java.nio.ByteBuffer value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.BINARY_ARG;
    value_ = value;
  }

  public double getDouble_arg() {
    if (getSetField() == _Fields.DOUBLE_ARG) {
      return (java.lang.Double)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'double_arg' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDouble_arg(double value) {
    setField_ = _Fields.DOUBLE_ARG;
    value_ = value;
  }

  public boolean isSetInt_arg() {
    return setField_ == _Fields.INT_ARG;
  }


  public boolean isSetLong_arg() {
    return setField_ == _Fields.LONG_ARG;
  }


  public boolean isSetString_arg() {
    return setField_ == _Fields.STRING_ARG;
  }


  public boolean isSetBool_arg() {
    return setField_ == _Fields.BOOL_ARG;
  }


  public boolean isSetBinary_arg() {
    return setField_ == _Fields.BINARY_ARG;
  }


  public boolean isSetDouble_arg() {
    return setField_ == _Fields.DOUBLE_ARG;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof JavaObjectArg) {
      return equals((JavaObjectArg)other);
    } else {
      return false;
    }
  }

  public boolean equals(JavaObjectArg other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(JavaObjectArg other) {
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
