/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_64_69 extends org.jooq.impl.TableImpl<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 785899376;

	/**
	 * The singleton instance of X_TEST_CASE_64_69
	 */
	public static final org.jooq.test.firebird.generatedclasses.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.firebird.generatedclasses.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_64_69Record> getRecordType() {
		return org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_64_69Record.class;
	}

	/**
	 * The table column <code>X_TEST_CASE_64_69.ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_TEST_CASE_64_69.UNUSED_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	public XTestCase_64_69() {
		super("X_TEST_CASE_64_69");
	}

	public XTestCase_64_69(java.lang.String alias) {
		super(alias, null, org.jooq.test.firebird.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	@Override
	public org.jooq.test.firebird.generatedclasses.tables.XTestCase_64_69 as(java.lang.String alias) {
		return new org.jooq.test.firebird.generatedclasses.tables.XTestCase_64_69(alias);
	}
}