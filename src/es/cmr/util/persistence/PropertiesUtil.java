package es.cmr.util.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	
	public static Properties loadProperty(String propsFile) throws FileNotFoundException, IOException{
		Properties props = null;

		File f = new File(propsFile);
		
		try (FileInputStream fis = new FileInputStream(f)){
			props = new Properties();
			props.load(fis);
		} 

		return (props);
	}
}