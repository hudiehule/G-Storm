/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-21")
public class LSTopoHistoryList implements org.apache.thrift.TBase<LSTopoHistoryList, LSTopoHistoryList._Fields>, java.io.Serializable, Cloneable, Comparable<LSTopoHistoryList> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LSTopoHistoryList");

  private static final org.apache.thrift.protocol.TField TOPO_HISTORY_FIELD_DESC = new org.apache.thrift.protocol.TField("topo_history", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LSTopoHistoryListStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LSTopoHistoryListTupleSchemeFactory();

  public java.util.List<LSTopoHistory> topo_history; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOPO_HISTORY((short)1, "topo_history");

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
        case 1: // TOPO_HISTORY
          return TOPO_HISTORY;
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
    tmpMap.put(_Fields.TOPO_HISTORY, new org.apache.thrift.meta_data.FieldMetaData("topo_history", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LSTopoHistory.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LSTopoHistoryList.class, metaDataMap);
  }

  public LSTopoHistoryList() {
  }

  public LSTopoHistoryList(
    java.util.List<LSTopoHistory> topo_history)
  {
    this();
    this.topo_history = topo_history;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LSTopoHistoryList(LSTopoHistoryList other) {
    if (other.isSetTopo_history()) {
      java.util.List<LSTopoHistory> __this__topo_history = new java.util.ArrayList<LSTopoHistory>(other.topo_history.size());
      for (LSTopoHistory other_element : other.topo_history) {
        __this__topo_history.add(new LSTopoHistory(other_element));
      }
      this.topo_history = __this__topo_history;
    }
  }

  public LSTopoHistoryList deepCopy() {
    return new LSTopoHistoryList(this);
  }

  @Override
  public void clear() {
    this.topo_history = null;
  }

  public int getTopo_historySize() {
    return (this.topo_history == null) ? 0 : this.topo_history.size();
  }

  public java.util.Iterator<LSTopoHistory> getTopo_historyIterator() {
    return (this.topo_history == null) ? null : this.topo_history.iterator();
  }

  public void addToTopo_history(LSTopoHistory elem) {
    if (this.topo_history == null) {
      this.topo_history = new java.util.ArrayList<LSTopoHistory>();
    }
    this.topo_history.add(elem);
  }

  public java.util.List<LSTopoHistory> getTopo_history() {
    return this.topo_history;
  }

  public LSTopoHistoryList setTopo_history(java.util.List<LSTopoHistory> topo_history) {
    this.topo_history = topo_history;
    return this;
  }

  public void unsetTopo_history() {
    this.topo_history = null;
  }

  /** Returns true if field topo_history is set (has been assigned a value) and false otherwise */
  public boolean isSetTopo_history() {
    return this.topo_history != null;
  }

  public void setTopo_historyIsSet(boolean value) {
    if (!value) {
      this.topo_history = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TOPO_HISTORY:
      if (value == null) {
        unsetTopo_history();
      } else {
        setTopo_history((java.util.List<LSTopoHistory>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPO_HISTORY:
      return getTopo_history();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TOPO_HISTORY:
      return isSetTopo_history();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof LSTopoHistoryList)
      return this.equals((LSTopoHistoryList)that);
    return false;
  }

  public boolean equals(LSTopoHistoryList that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_topo_history = true && this.isSetTopo_history();
    boolean that_present_topo_history = true && that.isSetTopo_history();
    if (this_present_topo_history || that_present_topo_history) {
      if (!(this_present_topo_history && that_present_topo_history))
        return false;
      if (!this.topo_history.equals(that.topo_history))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTopo_history()) ? 131071 : 524287);
    if (isSetTopo_history())
      hashCode = hashCode * 8191 + topo_history.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(LSTopoHistoryList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTopo_history()).compareTo(other.isSetTopo_history());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopo_history()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topo_history, other.topo_history);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("LSTopoHistoryList(");
    boolean first = true;

    sb.append("topo_history:");
    if (this.topo_history == null) {
      sb.append("null");
    } else {
      sb.append(this.topo_history);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (topo_history == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topo_history' was not present! Struct: " + toString());
    }
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

  private static class LSTopoHistoryListStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LSTopoHistoryListStandardScheme getScheme() {
      return new LSTopoHistoryListStandardScheme();
    }
  }

  private static class LSTopoHistoryListStandardScheme extends org.apache.thrift.scheme.StandardScheme<LSTopoHistoryList> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LSTopoHistoryList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPO_HISTORY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list766 = iprot.readListBegin();
                struct.topo_history = new java.util.ArrayList<LSTopoHistory>(_list766.size);
                LSTopoHistory _elem767;
                for (int _i768 = 0; _i768 < _list766.size; ++_i768)
                {
                  _elem767 = new LSTopoHistory();
                  _elem767.read(iprot);
                  struct.topo_history.add(_elem767);
                }
                iprot.readListEnd();
              }
              struct.setTopo_historyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LSTopoHistoryList struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topo_history != null) {
        oprot.writeFieldBegin(TOPO_HISTORY_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.topo_history.size()));
          for (LSTopoHistory _iter769 : struct.topo_history)
          {
            _iter769.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LSTopoHistoryListTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LSTopoHistoryListTupleScheme getScheme() {
      return new LSTopoHistoryListTupleScheme();
    }
  }

  private static class LSTopoHistoryListTupleScheme extends org.apache.thrift.scheme.TupleScheme<LSTopoHistoryList> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LSTopoHistoryList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.topo_history.size());
        for (LSTopoHistory _iter770 : struct.topo_history)
        {
          _iter770.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LSTopoHistoryList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list771 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.topo_history = new java.util.ArrayList<LSTopoHistory>(_list771.size);
        LSTopoHistory _elem772;
        for (int _i773 = 0; _i773 < _list771.size; ++_i773)
        {
          _elem772 = new LSTopoHistory();
          _elem772.read(iprot);
          struct.topo_history.add(_elem772);
        }
      }
      struct.setTopo_historyIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

