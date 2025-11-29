package hooks;




import java.io.IOException;

import core.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	
	

    @Before
    public void setUp() throws IOException {
       DriverManager.getDriver();
        System.out.println("Browser started");
    }

    @After
    public void tearDown() throws IOException{
      DriverManager.quitDriver();
        System.out.println("Browser closed");
    }
  
	
	

}
