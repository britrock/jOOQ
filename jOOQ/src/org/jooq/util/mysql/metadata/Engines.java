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
public class Engines extends TableImpl {

	/**
	 * The singleton instance of ENGINES
	 */
	public static final Engines ENGINES = new Engines();

	/**
	 * An uncommented column
	 */
	public static final Field<String> ENGINE = new TableFieldImpl<String>("ENGINE", String.class, ENGINES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> SUPPORT = new TableFieldImpl<String>("SUPPORT", String.class, ENGINES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> COMMENT = new TableFieldImpl<String>("COMMENT", String.class, ENGINES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> TRANSACTIONS = new TableFieldImpl<String>("TRANSACTIONS", String.class, ENGINES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> XA = new TableFieldImpl<String>("XA", String.class, ENGINES);

	/**
	 * An uncommented column
	 */
	public static final Field<String> SAVEPOINTS = new TableFieldImpl<String>("SAVEPOINTS", String.class, ENGINES);

	/**
	 * No further instances allowed
	 */
	private Engines() {
		super("ENGINES", "information_schema");
	}
}
