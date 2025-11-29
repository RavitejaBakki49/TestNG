package core;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	
	private static WebDriver driver;

    public static WebDriver getDriver() throws IOException {
    	//String browser = System.getProperty("browser", "edge");
    	
    	
    	String browser = ConfigReader.get("browser");
    	 if (driver == null) {
        switch (browser.toLowerCase()) {

        case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            break;

        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            break;

        case "edge":
        default:
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            break;
        }
    	 }
    return driver;
        
    
        
    }


    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	

}
