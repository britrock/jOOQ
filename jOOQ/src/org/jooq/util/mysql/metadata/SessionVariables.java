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
public class SessionVariables extends TableImpl {

	/**
	 * The singleton instance of SESSION_VARIABLES
	 */
	public static final SessionVariables SESSION_VARIABLES = new SessionVariables();

	/**
	 * An uncommented column
	 */
	public static final Field<String> VARIABLE_NAME = new TableFieldImpl<String>("VARIABLE_NAME", String.class, SESSION_VARIABLES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> VARIABLE_VALUE = new TableFieldImpl<String>("VARIABLE_VALUE", String.class, SESSION_VARIABLES);

	/**
	 * No further instances allowed
	 */
	private SessionVariables() {
		super("SESSION_VARIABLES", "information_schema");
	}
}
