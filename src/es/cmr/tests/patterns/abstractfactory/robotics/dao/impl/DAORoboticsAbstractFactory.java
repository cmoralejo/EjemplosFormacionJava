/**
 * 
 */
package es.cmr.tests.patterns.abstractfactory.robotics.dao.impl;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import es.cmr.util.persistence.PropertiesUtil;



/**
 * @author Carlos
 *
 */
public abstract class DAORoboticsAbstractFactory implements IDAORoboticsAbstractFactory {

	


private enum TECH_PERSISTENCE {
	FILE_PROPERTIES("es.cmr.util.persistence.PropertiesUtil","loadProperty","String","./config/DAORoboticsAbstractFactory.properties","getProperty","dao.robotics.ImplClass"),
	FILE_PROPERTIES1("es.cmr.util.persistence.PropertiesUtil","loadProperty","String","./config/prueba.properties","getProperty","XXXX");
	
	private String techClass;
	private String techLoadMethod;
	private String techLoadMethodTypeParams;
	private String techLoadMethodValueParams;
	private String techFindValueMethodTypeParams;
	private String techFindValueMethodValueParams;
	
	private TECH_PERSISTENCE(String techClass, String techLoadMethod, String techLoadMethodTypeParams,
			String techLoadMethodValueParams, String techFindValueMethodTypeParams,
			String techFindValueMethodValueParams) {
		this.techClass = techClass;
		this.techLoadMethod = techLoadMethod;
		this.techLoadMethodTypeParams = techLoadMethodTypeParams;
		this.techLoadMethodValueParams = techLoadMethodValueParams;
		this.techFindValueMethodTypeParams = techFindValueMethodTypeParams;
		this.techFindValueMethodValueParams = techFindValueMethodValueParams;
	}

	protected String getTechClass() {
		return techClass;
	}

	protected String getTechLoadMethod() {
		return techLoadMethod;
	}

	protected String getTechLoadMethodTypeParams() {
		return techLoadMethodTypeParams;
	}

	protected String getTechLoadMethodValueParams() {
		return techLoadMethodValueParams;
	}

	protected String getTechFindValueMethodTypeParams() {
		return techFindValueMethodTypeParams;
	}

	protected String getTechFindValueMethodValueParams() {
		return techFindValueMethodValueParams;
	}
	
	
	
}
	
	
	public static DAORoboticsAbstractFactory getDAORoboticsAbstractFactory() throws DAORoboticsAbstractFactoryException {
		TECH_PERSISTENCE selectedTechnologyPersistance = TECH_PERSISTENCE.FILE_PROPERTIES; 
		
		String nameConcreteFactory = null;
		Class<?> classConcreteFactory = null;
		DAORoboticsAbstractFactory instanceConcreteFactory = null;
		 
		nameConcreteFactory = getNameClassDAORoboticsConcreteFactory(selectedTechnologyPersistance);
		
		try {
			classConcreteFactory = Class.forName(nameConcreteFactory);
			instanceConcreteFactory = ((DAORoboticsAbstractFactory) classConcreteFactory.newInstance());

		} catch (ClassNotFoundException e1) {
			throw new DAORoboticsAbstractFactoryException("Not possible to get class reference of " + nameConcreteFactory, e1);

		} catch (InstantiationException | IllegalAccessException e2) {
			throw new DAORoboticsAbstractFactoryException("Not possible to instance concrete factory of " + nameConcreteFactory, e2);
		}    
		
		return(instanceConcreteFactory);
		
	}

	
	private static String getNameClassDAORoboticsConcreteFactory(TECH_PERSISTENCE techPersistanceSelected) throws DAORoboticsAbstractFactoryException {
		
		System.out.println(techPersistanceSelected);
	
		String nameClass = null;
		
		String techClass = techPersistanceSelected.getTechClass();
		String techLoadMethod = techPersistanceSelected.getTechLoadMethod();
		String techLoadMethodTypeParams = techPersistanceSelected.getTechLoadMethodTypeParams();
		String techLoadMethodValueParams = techPersistanceSelected.getTechLoadMethodValueParams();
		String techFindValueMethodTypeParams = techPersistanceSelected.getTechFindValueMethodTypeParams();
		String techFindValueMethodValueParams = techPersistanceSelected.getTechFindValueMethodValueParams();
		
		
		//TODO COGER METODO INVOKE DE LA LIBRERIA YA HECHA Y QUITAR LO DEL PROPERTIES
		try {
					Properties props = PropertiesUtil.loadProperty(techLoadMethodValueParams);
					nameClass = props.getProperty(techFindValueMethodValueParams);
			
		} 
		catch (IOException e1) {
			throw new DAORoboticsAbstractFactoryException("Not possible to get name class of DAORoboticsConcreteFactory ", e1);
		}
		
		return(nameClass);
	}

}
