package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ConfigReader{

	
	
	
	
	static Properties q = new Properties();
	public void fileReading() throws FileNotFoundException,IOException {
			FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
			q.load(fis);  
	}
	
	public String get(String key) throws IOException {	
		
		fileReading();
		return q.getProperty(key);
		
	}
	
	
	
	
}