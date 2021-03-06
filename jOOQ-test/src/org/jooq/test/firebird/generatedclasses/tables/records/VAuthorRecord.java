/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "V_AUTHOR")
public class VAuthorRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.firebird.generatedclasses.tables.records.VAuthorRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String>, org.jooq.test.firebird.generatedclasses.tables.interfaces.IVAuthor {

	private static final long serialVersionUID = 1918600864;

	/**
	 * Setter for <code>V_AUTHOR.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>V_AUTHOR.ID</code>. 
	 */
	@javax.persistence.Column(name = "ID", length = 4)
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>V_AUTHOR.FIRST_NAME</code>. 
	 */
	@Override
	public void setFirstName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>V_AUTHOR.FIRST_NAME</code>. 
	 */
	@javax.persistence.Column(name = "FIRST_NAME", length = 50)
	@javax.validation.constraints.Size(max = 50)
	@Override
	public java.lang.String getFirstName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>V_AUTHOR.LAST_NAME</code>. 
	 */
	@Override
	public void setLastName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>V_AUTHOR.LAST_NAME</code>. 
	 */
	@javax.persistence.Column(name = "LAST_NAME", length = 50)
	@javax.validation.constraints.Size(max = 50)
	@Override
	public java.lang.String getLastName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>V_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	@Override
	public void setDateOfBirth(java.sql.Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>V_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	@javax.persistence.Column(name = "DATE_OF_BIRTH", length = 4)
	@Override
	public java.sql.Date getDateOfBirth() {
		return (java.sql.Date) getValue(3);
	}

	/**
	 * Setter for <code>V_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	@Override
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>V_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	@javax.persistence.Column(name = "YEAR_OF_BIRTH", length = 4)
	@Override
	public java.lang.Integer getYearOfBirth() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>V_AUTHOR.ADDRESS</code>. 
	 */
	@Override
	public void setAddress(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>V_AUTHOR.ADDRESS</code>. 
	 */
	@javax.persistence.Column(name = "ADDRESS", length = 50)
	@javax.validation.constraints.Size(max = 50)
	@Override
	public java.lang.String getAddress() {
		return (java.lang.String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.firebird.generatedclasses.tables.VAuthor.V_AUTHOR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.firebird.generatedclasses.tables.VAuthor.V_AUTHOR.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.firebird.generatedclasses.tables.VAuthor.V_AUTHOR.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.test.firebird.generatedclasses.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.firebird.generatedclasses.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.test.firebird.generatedclasses.tables.VAuthor.V_AUTHOR.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getDateOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getYearOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getAddress();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.IVAuthor from) {
		setId(from.getId());
		setFirstName(from.getFirstName());
		setLastName(from.getLastName());
		setDateOfBirth(from.getDateOfBirth());
		setYearOfBirth(from.getYearOfBirth());
		setAddress(from.getAddress());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.IVAuthor> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VAuthorRecord
	 */
	public VAuthorRecord() {
		super(org.jooq.test.firebird.generatedclasses.tables.VAuthor.V_AUTHOR);
	}
}
