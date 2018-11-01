/**
 * 
 */
package es.cmr.tests.patterns.abstractfactory.robotics.dao.blueprism.v5;

import es.cmr.tests.patterns.abstractfactory.robotics.dao.func.ExecutionRoboticsDAO;
import es.cmr.tests.patterns.abstractfactory.robotics.dao.func.ResourceRoboticsDAO;
import es.cmr.tests.patterns.abstractfactory.robotics.dao.impl.DAORoboticsAbstractFactory;

/**
 * @author Carlos
 *
 */
public class BluePrismv5DAORoboticsConcreteFactory extends DAORoboticsAbstractFactory {

	/**
	 * 
	 */
	public BluePrismv5DAORoboticsConcreteFactory() {
		System.out.println(this);
	}

	/* (non-Javadoc)
	 * @see es.cmr.tests.patterns.abstractfactory.robotics.dao.impl.IDAORoboticsAbstractFactory#getExecutionRoboticsDAO()
	 */
	@Override
	public ExecutionRoboticsDAO getExecutionRoboticsDAO() {
		System.out.println(this + "ExecutionRoboticsDAO getExecutionRoboticsDAO()");
		return new BluePrismv5ExecutionRoboticsDAO();
	}

	/* (non-Javadoc)
	 * @see es.cmr.tests.patterns.abstractfactory.robotics.dao.impl.IDAORoboticsAbstractFactory#getResourceRoboticsDAO()
	 */
	@Override
	public ResourceRoboticsDAO getResourceRoboticsDAO() {
		System.out.println(this + "ExecutionRoboticsDAO getResourceRoboticsDAO()");
		return new BluePrismv5ResourceRoboticsDAO();
	}


}
