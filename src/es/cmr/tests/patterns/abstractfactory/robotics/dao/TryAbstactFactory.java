/**
 * 
 */
package es.cmr.tests.patterns.abstractfactory.robotics.dao;

import java.util.List;

import es.cmr.tests.patterns.abstractfactory.robotics.dao.func.ExecutionRoboticsDAO;
import es.cmr.tests.patterns.abstractfactory.robotics.dao.impl.DAORoboticsAbstractFactory;
import es.cmr.tests.patterns.abstractfactory.robotics.dao.impl.DAORoboticsAbstractFactoryException;
import es.cmr.tests.patterns.abstractfactory.robotics.dao.model.Execution;
import es.cmr.tests.patterns.abstractfactory.robotics.dao.model.Execution.STATUS;
import es.cmr.tests.patterns.abstractfactory.robotics.dao.model.Execution.TIME_UNIT;

/**
 * @author Carlos
 *
 */
public class TryAbstactFactory {

	/**
	 * 
	 */
	public TryAbstactFactory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DAORoboticsAbstractFactory factory = DAORoboticsAbstractFactory.getDAORoboticsAbstractFactory();
			
			System.out.println(factory);
			
			ExecutionRoboticsDAO daoExecs = factory.getExecutionRoboticsDAO();
			
			System.out.println(daoExecs);
			
			List<Execution> lExec1 = daoExecs.getExecutionsByStatus(STATUS.RUNNING);
			
			List<Execution> lExec2 = daoExecs.getHangedRunningExecutions(TIME_UNIT.MINUTE, 15);
			
		} catch (DAORoboticsAbstractFactoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
