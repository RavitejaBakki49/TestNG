package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import core.DriverManager;
import hooks.Hooks;
import io.cucumber.java.en.*;
import io.cucumber.messages.types.Hook;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver;
	
	LoginPage login;
	

	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string){
		
		
		
		
		
	}   

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
	    
	}
	
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws IOException {
		
        driver = DriverManager.getDriver();
		login = new LoginPage(driver);
		login.loginPage();
	    
	}
	@When("user enters {string} and {string} on the login page")
	public void user_enters_and_on_the_login_page(String user, String pass) {	
		login.userpass(user,pass);
	}
	@Then("user clicks on submit button")
	public void user_clicks_on_submit()  {
		login.submit();	
	}
	
	
	@Then("user redirects to homepage")
	public void user_on_homepage() throws InterruptedException {
		
		login.homepage();
		
		
		
	}

	

}
