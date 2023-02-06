package org.stepdefinition;

import static org.testng.Assert.assertTrue;

import org.testng.AssertJUnit;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass  {

	/*@Given("Launching chrome and loading url")
	public void launching_chrome_and_loading_url() {
		browserLauncher();
		url("https://facebook.com/");
		maximize();
		System.out.println("maxi from stepdef");
	}*/

	@When("Type invalid username and password")
	public void type_invalid_username_and_password() {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(), "Greens");
		fill(l.getTxtPass(), "green");
		System.out.println("password from stepdef");
	}
	
	@When("Click login button")
	public void click_login_button() throws InterruptedException {
	 	LoginPojo l = new LoginPojo();
		toClick(l.getBlogin());
		Thread.sleep(3000);
		System.out.println("click from stepdef");
	}

	/*@Then("Navigate to incorrect credential page")
	public void navigate_to_incorrect_credential_page() {
		String curl = driver.getCurrentUrl();
		
		Assert.assertTrue("Verify the incorrect page" , curl.contains("privacy"));
		System.out.println("Verifies");
		close();
		System.out.println("closed from stepdef");*/
	}
	
	

