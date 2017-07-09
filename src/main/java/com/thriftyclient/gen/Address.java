/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.thriftyclient.gen;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Represents an address.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-07-09")
public class Address implements org.apache.thrift.TBase<Address, Address._Fields>, java.io.Serializable, Cloneable, Comparable<Address> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Address");

  private static final org.apache.thrift.protocol.TField LINE1_FIELD_DESC = new org.apache.thrift.protocol.TField("line1", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LINE2_FIELD_DESC = new org.apache.thrift.protocol.TField("line2", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CITY_FIELD_DESC = new org.apache.thrift.protocol.TField("city", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField COUNTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("country", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AddressStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AddressTupleSchemeFactory();

  public java.lang.String line1; // required
  public java.lang.String line2; // optional
  public java.lang.String city; // required
  public java.lang.String state; // required
  public java.lang.String country; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LINE1((short)1, "line1"),
    LINE2((short)2, "line2"),
    CITY((short)3, "city"),
    STATE((short)4, "state"),
    COUNTRY((short)5, "country");

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
        case 1: // LINE1
          return LINE1;
        case 2: // LINE2
          return LINE2;
        case 3: // CITY
          return CITY;
        case 4: // STATE
          return STATE;
        case 5: // COUNTRY
          return COUNTRY;
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
  private static final _Fields optionals[] = {_Fields.LINE2};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LINE1, new org.apache.thrift.meta_data.FieldMetaData("line1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LINE2, new org.apache.thrift.meta_data.FieldMetaData("line2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CITY, new org.apache.thrift.meta_data.FieldMetaData("city", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COUNTRY, new org.apache.thrift.meta_data.FieldMetaData("country", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Address.class, metaDataMap);
  }

  public Address() {
  }

  public Address(
    java.lang.String line1,
    java.lang.String city,
    java.lang.String state,
    java.lang.String country)
  {
    this();
    this.line1 = line1;
    this.city = city;
    this.state = state;
    this.country = country;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Address(Address other) {
    if (other.isSetLine1()) {
      this.line1 = other.line1;
    }
    if (other.isSetLine2()) {
      this.line2 = other.line2;
    }
    if (other.isSetCity()) {
      this.city = other.city;
    }
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetCountry()) {
      this.country = other.country;
    }
  }

  public Address deepCopy() {
    return new Address(this);
  }

  @Override
  public void clear() {
    this.line1 = null;
    this.line2 = null;
    this.city = null;
    this.state = null;
    this.country = null;
  }

  public java.lang.String getLine1() {
    return this.line1;
  }

  public Address setLine1(java.lang.String line1) {
    this.line1 = line1;
    return this;
  }

  public void unsetLine1() {
    this.line1 = null;
  }

  /** Returns true if field line1 is set (has been assigned a value) and false otherwise */
  public boolean isSetLine1() {
    return this.line1 != null;
  }

  public void setLine1IsSet(boolean value) {
    if (!value) {
      this.line1 = null;
    }
  }

  public java.lang.String getLine2() {
    return this.line2;
  }

  public Address setLine2(java.lang.String line2) {
    this.line2 = line2;
    return this;
  }

  public void unsetLine2() {
    this.line2 = null;
  }

  /** Returns true if field line2 is set (has been assigned a value) and false otherwise */
  public boolean isSetLine2() {
    return this.line2 != null;
  }

  public void setLine2IsSet(boolean value) {
    if (!value) {
      this.line2 = null;
    }
  }

  public java.lang.String getCity() {
    return this.city;
  }

  public Address setCity(java.lang.String city) {
    this.city = city;
    return this;
  }

  public void unsetCity() {
    this.city = null;
  }

  /** Returns true if field city is set (has been assigned a value) and false otherwise */
  public boolean isSetCity() {
    return this.city != null;
  }

  public void setCityIsSet(boolean value) {
    if (!value) {
      this.city = null;
    }
  }

  public java.lang.String getState() {
    return this.state;
  }

  public Address setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public java.lang.String getCountry() {
    return this.country;
  }

  public Address setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  public void unsetCountry() {
    this.country = null;
  }

  /** Returns true if field country is set (has been assigned a value) and false otherwise */
  public boolean isSetCountry() {
    return this.country != null;
  }

  public void setCountryIsSet(boolean value) {
    if (!value) {
      this.country = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case LINE1:
      if (value == null) {
        unsetLine1();
      } else {
        setLine1((java.lang.String)value);
      }
      break;

    case LINE2:
      if (value == null) {
        unsetLine2();
      } else {
        setLine2((java.lang.String)value);
      }
      break;

    case CITY:
      if (value == null) {
        unsetCity();
      } else {
        setCity((java.lang.String)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((java.lang.String)value);
      }
      break;

    case COUNTRY:
      if (value == null) {
        unsetCountry();
      } else {
        setCountry((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LINE1:
      return getLine1();

    case LINE2:
      return getLine2();

    case CITY:
      return getCity();

    case STATE:
      return getState();

    case COUNTRY:
      return getCountry();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LINE1:
      return isSetLine1();
    case LINE2:
      return isSetLine2();
    case CITY:
      return isSetCity();
    case STATE:
      return isSetState();
    case COUNTRY:
      return isSetCountry();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Address)
      return this.equals((Address)that);
    return false;
  }

  public boolean equals(Address that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_line1 = true && this.isSetLine1();
    boolean that_present_line1 = true && that.isSetLine1();
    if (this_present_line1 || that_present_line1) {
      if (!(this_present_line1 && that_present_line1))
        return false;
      if (!this.line1.equals(that.line1))
        return false;
    }

    boolean this_present_line2 = true && this.isSetLine2();
    boolean that_present_line2 = true && that.isSetLine2();
    if (this_present_line2 || that_present_line2) {
      if (!(this_present_line2 && that_present_line2))
        return false;
      if (!this.line2.equals(that.line2))
        return false;
    }

    boolean this_present_city = true && this.isSetCity();
    boolean that_present_city = true && that.isSetCity();
    if (this_present_city || that_present_city) {
      if (!(this_present_city && that_present_city))
        return false;
      if (!this.city.equals(that.city))
        return false;
    }

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_country = true && this.isSetCountry();
    boolean that_present_country = true && that.isSetCountry();
    if (this_present_country || that_present_country) {
      if (!(this_present_country && that_present_country))
        return false;
      if (!this.country.equals(that.country))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetLine1()) ? 131071 : 524287);
    if (isSetLine1())
      hashCode = hashCode * 8191 + line1.hashCode();

    hashCode = hashCode * 8191 + ((isSetLine2()) ? 131071 : 524287);
    if (isSetLine2())
      hashCode = hashCode * 8191 + line2.hashCode();

    hashCode = hashCode * 8191 + ((isSetCity()) ? 131071 : 524287);
    if (isSetCity())
      hashCode = hashCode * 8191 + city.hashCode();

    hashCode = hashCode * 8191 + ((isSetState()) ? 131071 : 524287);
    if (isSetState())
      hashCode = hashCode * 8191 + state.hashCode();

    hashCode = hashCode * 8191 + ((isSetCountry()) ? 131071 : 524287);
    if (isSetCountry())
      hashCode = hashCode * 8191 + country.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Address other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetLine1()).compareTo(other.isSetLine1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLine1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.line1, other.line1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLine2()).compareTo(other.isSetLine2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLine2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.line2, other.line2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCity()).compareTo(other.isSetCity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.city, other.city);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCountry()).compareTo(other.isSetCountry());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCountry()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.country, other.country);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(");
    boolean first = true;

    sb.append("line1:");
    if (this.line1 == null) {
      sb.append("null");
    } else {
      sb.append(this.line1);
    }
    first = false;
    if (isSetLine2()) {
      if (!first) sb.append(", ");
      sb.append("line2:");
      if (this.line2 == null) {
        sb.append("null");
      } else {
        sb.append(this.line2);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("city:");
    if (this.city == null) {
      sb.append("null");
    } else {
      sb.append(this.city);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("country:");
    if (this.country == null) {
      sb.append("null");
    } else {
      sb.append(this.country);
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

  private static class AddressStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddressStandardScheme getScheme() {
      return new AddressStandardScheme();
    }
  }

  private static class AddressStandardScheme extends org.apache.thrift.scheme.StandardScheme<Address> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Address struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LINE1
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.line1 = iprot.readString();
              struct.setLine1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LINE2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.line2 = iprot.readString();
              struct.setLine2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.city = iprot.readString();
              struct.setCityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.state = iprot.readString();
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COUNTRY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.country = iprot.readString();
              struct.setCountryIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Address struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.line1 != null) {
        oprot.writeFieldBegin(LINE1_FIELD_DESC);
        oprot.writeString(struct.line1);
        oprot.writeFieldEnd();
      }
      if (struct.line2 != null) {
        if (struct.isSetLine2()) {
          oprot.writeFieldBegin(LINE2_FIELD_DESC);
          oprot.writeString(struct.line2);
          oprot.writeFieldEnd();
        }
      }
      if (struct.city != null) {
        oprot.writeFieldBegin(CITY_FIELD_DESC);
        oprot.writeString(struct.city);
        oprot.writeFieldEnd();
      }
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeString(struct.state);
        oprot.writeFieldEnd();
      }
      if (struct.country != null) {
        oprot.writeFieldBegin(COUNTRY_FIELD_DESC);
        oprot.writeString(struct.country);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddressTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddressTupleScheme getScheme() {
      return new AddressTupleScheme();
    }
  }

  private static class AddressTupleScheme extends org.apache.thrift.scheme.TupleScheme<Address> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Address struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLine1()) {
        optionals.set(0);
      }
      if (struct.isSetLine2()) {
        optionals.set(1);
      }
      if (struct.isSetCity()) {
        optionals.set(2);
      }
      if (struct.isSetState()) {
        optionals.set(3);
      }
      if (struct.isSetCountry()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetLine1()) {
        oprot.writeString(struct.line1);
      }
      if (struct.isSetLine2()) {
        oprot.writeString(struct.line2);
      }
      if (struct.isSetCity()) {
        oprot.writeString(struct.city);
      }
      if (struct.isSetState()) {
        oprot.writeString(struct.state);
      }
      if (struct.isSetCountry()) {
        oprot.writeString(struct.country);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Address struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.line1 = iprot.readString();
        struct.setLine1IsSet(true);
      }
      if (incoming.get(1)) {
        struct.line2 = iprot.readString();
        struct.setLine2IsSet(true);
      }
      if (incoming.get(2)) {
        struct.city = iprot.readString();
        struct.setCityIsSet(true);
      }
      if (incoming.get(3)) {
        struct.state = iprot.readString();
        struct.setStateIsSet(true);
      }
      if (incoming.get(4)) {
        struct.country = iprot.readString();
        struct.setCountryIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

