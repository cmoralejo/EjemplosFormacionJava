/**
 * 
 */
package es.cmr.tests.patterns.abstractfactory.robotics.dao.func;

import java.util.List;

import es.cmr.tests.patterns.abstractfactory.robotics.dao.model.Execution;

/**
 * @author Carlos
 *
 */
public interface ExecutionRoboticsDAO {
	public List<Execution> getExecutionsByStatus(Execution.STATUS status);
	public List<Execution> getHangedRunningExecutions(Execution.TIME_UNIT timeUnit, int numberInterval);
}
