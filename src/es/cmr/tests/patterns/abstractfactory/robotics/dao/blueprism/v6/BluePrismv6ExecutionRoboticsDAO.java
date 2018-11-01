/**
 * 
 */
package es.cmr.tests.patterns.abstractfactory.robotics.dao.blueprism.v6;

import java.util.List;

import es.cmr.tests.patterns.abstractfactory.robotics.dao.func.ExecutionRoboticsDAO;
import es.cmr.tests.patterns.abstractfactory.robotics.dao.model.Execution;
import es.cmr.tests.patterns.abstractfactory.robotics.dao.model.Execution.STATUS;
import es.cmr.tests.patterns.abstractfactory.robotics.dao.model.Execution.TIME_UNIT;

/**
 * @author Carlos
 *
 */
public class BluePrismv6ExecutionRoboticsDAO implements ExecutionRoboticsDAO {

	/**
	 * 
	 */
	public BluePrismv6ExecutionRoboticsDAO() {
		System.out.println(this);
	}

	/* (non-Javadoc)
	 * @see es.cmr.tests.patterns.abstractfactory.robotics.dao.func.ExecutionRoboticsDAO#getExecutionsByStatus(es.cmr.tests.patterns.abstractfactory.robotics.model.Execution.STATUS)
	 */
	@Override
	public List<Execution> getExecutionsByStatus(STATUS status) {
		System.out.println(this + "BluePrismv5ExecutionRoboticsDAO getExecutionsByStatus()");
		return null;
	}

	/* (non-Javadoc)
	 * @see es.cmr.tests.patterns.abstractfactory.robotics.dao.func.ExecutionRoboticsDAO#getHangedRunningExecutions(es.cmr.tests.patterns.abstractfactory.robotics.model.Execution.TIME_UNIT, int)
	 */
	@Override
	public List<Execution> getHangedRunningExecutions(TIME_UNIT timeUnit, int numberInterval) {
		System.out.println(this + "BluePrismv5ExecutionRoboticsDAO getHangedRunningExecutions()");
		return null;
	}

}
