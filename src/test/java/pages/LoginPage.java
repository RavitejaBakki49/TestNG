package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import core.ConfigReader;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	
	}
	
	
	
	
	 
	
	
	
	
	
	public void loginPage() throws IOException {
		ConfigReader configReader = new ConfigReader();
		driver.get(configReader.get("url"));
		
		System.out.println("Hey user is on login page");
		
		
		
	}










	public void userpass(String user, String pass) {
		
		
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		
		
		
	}










	public void submit() {
	
		driver.findElement(By.id("submit")).click();
		
		
		
	}










	public void homepage() throws InterruptedException {
		boolean s=driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed();
	    Assert.assertEquals(true, s);
	
	
	}










	
	
	
	
	
	
	
	
	
	
	
	
	

}
