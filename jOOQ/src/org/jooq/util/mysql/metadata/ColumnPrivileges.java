/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.metadata;

import java.lang.String;
import org.jooq.Field;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
public class ColumnPrivileges extends TableImpl {

	/**
	 * The singleton instance of COLUMN_PRIVILEGES
	 */
	public static final ColumnPrivileges COLUMN_PRIVILEGES = new ColumnPrivileges();

	/**
	 * An uncommented column
	 */
	public static final Field<String> GRANTEE = new TableFieldImpl<String>("GRANTEE", String.class, COLUMN_PRIVILEGES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> TABLE_CATALOG = new TableFieldImpl<String>("TABLE_CATALOG", String.class, COLUMN_PRIVILEGES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> TABLE_SCHEMA = new TableFieldImpl<String>("TABLE_SCHEMA", String.class, COLUMN_PRIVILEGES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> TABLE_NAME = new TableFieldImpl<String>("TABLE_NAME", String.class, COLUMN_PRIVILEGES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> COLUMN_NAME = new TableFieldImpl<String>("COLUMN_NAME", String.class, COLUMN_PRIVILEGES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> PRIVILEGE_TYPE = new TableFieldImpl<String>("PRIVILEGE_TYPE", String.class, COLUMN_PRIVILEGES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> IS_GRANTABLE = new TableFieldImpl<String>("IS_GRANTABLE", String.class, COLUMN_PRIVILEGES);

	/**
	 * No further instances allowed
	 */
	private ColumnPrivileges() {
		super("COLUMN_PRIVILEGES", "information_schema");
	}
}
