/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.liyanxu.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserSpecific extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4516776076455200547L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserSpecific\",\"namespace\":\"org.liyanxu.model\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"phoneNumbers\",\"type\":{\"type\":\"array\",\"items\":\"string\",\"java-class\":\"java.util.List\"}},{\"name\":\"company\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserSpecific> ENCODER =
          new BinaryMessageEncoder<UserSpecific>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserSpecific> DECODER =
          new BinaryMessageDecoder<UserSpecific>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<UserSpecific> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<UserSpecific> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserSpecific>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this UserSpecific to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a UserSpecific from a ByteBuffer. */
  public static UserSpecific fromByteBuffer(
          java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence name;
  @Deprecated public int age;
  @Deprecated public java.util.List<java.lang.CharSequence> phoneNumbers;
  @Deprecated public java.lang.CharSequence company;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserSpecific() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param age The new value for age
   * @param phoneNumbers The new value for phoneNumbers
   * @param company The new value for company
   */
  public UserSpecific(java.lang.CharSequence name, java.lang.Integer age, java.util.List<java.lang.CharSequence> phoneNumbers, java.lang.CharSequence company) {
    this.name = name;
    this.age = age;
    this.phoneNumbers = phoneNumbers;
    this.company = company;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0: return name;
      case 1: return age;
      case 2: return phoneNumbers;
      case 3: return company;
      default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0: name = (java.lang.CharSequence)value$; break;
      case 1: age = (java.lang.Integer)value$; break;
      case 2: phoneNumbers = (java.util.List<java.lang.CharSequence>)value$; break;
      case 3: company = (java.lang.CharSequence)value$; break;
      default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'phoneNumbers' field.
   * @return The value of the 'phoneNumbers' field.
   */
  public java.util.List<java.lang.CharSequence> getPhoneNumbers() {
    return phoneNumbers;
  }

  /**
   * Sets the value of the 'phoneNumbers' field.
   * @param value the value to set.
   */
  public void setPhoneNumbers(java.util.List<java.lang.CharSequence> value) {
    this.phoneNumbers = value;
  }

  /**
   * Gets the value of the 'company' field.
   * @return The value of the 'company' field.
   */
  public java.lang.CharSequence getCompany() {
    return company;
  }

  /**
   * Sets the value of the 'company' field.
   * @param value the value to set.
   */
  public void setCompany(java.lang.CharSequence value) {
    this.company = value;
  }

  /**
   * Creates a new UserSpecific RecordBuilder.
   * @return A new UserSpecific RecordBuilder
   */
  public static org.liyanxu.model.UserSpecific.Builder newBuilder() {
    return new org.liyanxu.model.UserSpecific.Builder();
  }

  /**
   * Creates a new UserSpecific RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserSpecific RecordBuilder
   */
  public static org.liyanxu.model.UserSpecific.Builder newBuilder(org.liyanxu.model.UserSpecific.Builder other) {
    return new org.liyanxu.model.UserSpecific.Builder(other);
  }

  /**
   * Creates a new UserSpecific RecordBuilder by copying an existing UserSpecific instance.
   * @param other The existing instance to copy.
   * @return A new UserSpecific RecordBuilder
   */
  public static org.liyanxu.model.UserSpecific.Builder newBuilder(org.liyanxu.model.UserSpecific other) {
    return new org.liyanxu.model.UserSpecific.Builder(other);
  }

  /**
   * RecordBuilder for UserSpecific instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserSpecific>
          implements org.apache.avro.data.RecordBuilder<UserSpecific> {

    private java.lang.CharSequence name;
    private int age;
    private java.util.List<java.lang.CharSequence> phoneNumbers;
    private java.lang.CharSequence company;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.liyanxu.model.UserSpecific.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.phoneNumbers)) {
        this.phoneNumbers = data().deepCopy(fields()[2].schema(), other.phoneNumbers);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.company)) {
        this.company = data().deepCopy(fields()[3].schema(), other.company);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UserSpecific instance
     * @param other The existing instance to copy.
     */
    private Builder(org.liyanxu.model.UserSpecific other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.phoneNumbers)) {
        this.phoneNumbers = data().deepCopy(fields()[2].schema(), other.phoneNumbers);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.company)) {
        this.company = data().deepCopy(fields()[3].schema(), other.company);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Gets the value of the 'name' field.
     * @return The value.
     */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
     * Sets the value of the 'name' field.
     * @param value The value of 'name'.
     * @return This builder.
     */
    public org.liyanxu.model.UserSpecific.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'name' field has been set.
     * @return True if the 'name' field has been set, false otherwise.
     */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
     * Clears the value of the 'name' field.
     * @return This builder.
     */
    public org.liyanxu.model.UserSpecific.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'age' field.
     * @return The value.
     */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
     * Sets the value of the 'age' field.
     * @param value The value of 'age'.
     * @return This builder.
     */
    public org.liyanxu.model.UserSpecific.Builder setAge(int value) {
      validate(fields()[1], value);
      this.age = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'age' field has been set.
     * @return True if the 'age' field has been set, false otherwise.
     */
    public boolean hasAge() {
      return fieldSetFlags()[1];
    }


    /**
     * Clears the value of the 'age' field.
     * @return This builder.
     */
    public org.liyanxu.model.UserSpecific.Builder clearAge() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
     * Gets the value of the 'phoneNumbers' field.
     * @return The value.
     */
    public java.util.List<java.lang.CharSequence> getPhoneNumbers() {
      return phoneNumbers;
    }

    /**
     * Sets the value of the 'phoneNumbers' field.
     * @param value The value of 'phoneNumbers'.
     * @return This builder.
     */
    public org.liyanxu.model.UserSpecific.Builder setPhoneNumbers(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.phoneNumbers = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
     * Checks whether the 'phoneNumbers' field has been set.
     * @return True if the 'phoneNumbers' field has been set, false otherwise.
     */
    public boolean hasPhoneNumbers() {
      return fieldSetFlags()[2];
    }


    /**
     * Clears the value of the 'phoneNumbers' field.
     * @return This builder.
     */
    public org.liyanxu.model.UserSpecific.Builder clearPhoneNumbers() {
      phoneNumbers = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
     * Gets the value of the 'company' field.
     * @return The value.
     */
    public java.lang.CharSequence getCompany() {
      return company;
    }

    /**
     * Sets the value of the 'company' field.
     * @param value The value of 'company'.
     * @return This builder.
     */
    public org.liyanxu.model.UserSpecific.Builder setCompany(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.company = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
     * Checks whether the 'company' field has been set.
     * @return True if the 'company' field has been set, false otherwise.
     */
    public boolean hasCompany() {
      return fieldSetFlags()[3];
    }


    /**
     * Clears the value of the 'company' field.
     * @return This builder.
     */
    public org.liyanxu.model.UserSpecific.Builder clearCompany() {
      company = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserSpecific build() {
      try {
        UserSpecific record = new UserSpecific();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.age = fieldSetFlags()[1] ? this.age : (java.lang.Integer) defaultValue(fields()[1]);
        record.phoneNumbers = fieldSetFlags()[2] ? this.phoneNumbers : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        record.company = fieldSetFlags()[3] ? this.company : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserSpecific>
          WRITER$ = (org.apache.avro.io.DatumWriter<UserSpecific>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserSpecific>
          READER$ = (org.apache.avro.io.DatumReader<UserSpecific>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
