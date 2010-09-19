/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;


import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord;


/**
 * This class is generated by jOOQ.
 */
public class XUnused extends UpdatableTableImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of x_unused
	 */
	public static final XUnused X_UNUSED = new XUnused();

	/**
	 * The class holding records for this table
	 */
	private static final Class<XUnusedRecord> RECORD_TYPE = XUnusedRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<XUnusedRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<Integer> ID = new TableFieldImpl<Integer>("id", Integer.class, X_UNUSED);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<String> NAME = new TableFieldImpl<String>("name", String.class, X_UNUSED);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [id_ref, name_ref] REFERENCES x_unused [id, name]
	 */
	public static final TableField<Integer> ID_REF = new TableFieldImpl<Integer>("id_ref", Integer.class, X_UNUSED);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [id_ref, name_ref] REFERENCES x_unused [id, name]
	 */
	public static final TableField<String> NAME_REF = new TableFieldImpl<String>("name_ref", String.class, X_UNUSED);

	/**
	 * No further instances allowed
	 */
	private XUnused() {
		super("x_unused", Public.PUBLIC);
	}

	/*
	 * static initialiser
	 */
	static {
		X_UNUSED.addToPrimaryKey(ID);
		X_UNUSED.addToPrimaryKey(NAME);
	}

}
