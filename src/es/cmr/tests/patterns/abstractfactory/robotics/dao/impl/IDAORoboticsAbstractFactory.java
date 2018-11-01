/**
 * 
 */
package es.cmr.tests.patterns.abstractfactory.robotics.dao.impl;

import es.cmr.tests.patterns.abstractfactory.robotics.dao.func.ExecutionRoboticsDAO;
import es.cmr.tests.patterns.abstractfactory.robotics.dao.func.ResourceRoboticsDAO;

/**
 * @author Carlos
 *
 */
public interface IDAORoboticsAbstractFactory {

	// There will be a method for each DAO that can be 
	  // created. The concrete factories will have to 
	  // implement these methods.
	  public abstract ExecutionRoboticsDAO getExecutionRoboticsDAO();
	  public abstract ResourceRoboticsDAO getResourceRoboticsDAO();
	  
}
