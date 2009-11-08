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
public class UserPrivileges extends TableImpl {

	/**
	 * The singleton instance of USER_PRIVILEGES
	 */
	public static final UserPrivileges USER_PRIVILEGES = new UserPrivileges();

	/**
	 * An uncommented column
	 */
	public static final Field<String> GRANTEE = new TableFieldImpl<String>("GRANTEE", String.class, USER_PRIVILEGES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> TABLE_CATALOG = new TableFieldImpl<String>("TABLE_CATALOG", String.class, USER_PRIVILEGES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> PRIVILEGE_TYPE = new TableFieldImpl<String>("PRIVILEGE_TYPE", String.class, USER_PRIVILEGES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> IS_GRANTABLE = new TableFieldImpl<String>("IS_GRANTABLE", String.class, USER_PRIVILEGES);

	/**
	 * No further instances allowed
	 */
	private UserPrivileges() {
		super("USER_PRIVILEGES", "information_schema");
	}
}
