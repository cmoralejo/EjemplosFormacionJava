/**
 * 
 */
package es.cmr.tests.patterns.abstractfactory.robotics.dao.impl;

/**
 * @author Carlos
 *
 */
public class DAORoboticsAbstractFactoryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2725549685963021469L;

	public DAORoboticsAbstractFactoryException() {
		super();
	}

	public DAORoboticsAbstractFactoryException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DAORoboticsAbstractFactoryException(String message, Throwable cause) {
		super(message, cause);
	}

	public DAORoboticsAbstractFactoryException(String message) {
		super(message);
	}

	public DAORoboticsAbstractFactoryException(Throwable cause) {
		super(cause);
	}

}
