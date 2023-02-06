package org.stepdefinition;

import org.junit.Assert;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Password extends BaseClass {

	@Given("Launching chrome browser")
	public void launching_chrome_browser() {
		browserLauncher();
		url("https://facebook.com");
		maximize();
}

	@When("Need to click Forgotten Password")
	public void need_to_click_Forgotten_Password() throws InterruptedException {
		LoginPojo l = new  LoginPojo();
		toClick(l.getFlogin());
		Thread.sleep(3000);
	}

	@When("Need to add phone number and click search")
	public void need_to_add_phone_number_and_click_search() {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtphone(), "9879879871");
		toClick(l.getsearchclick());
	}

	@Then("Navigate to reset password page")
	public void navigate_to_reset_password_page() {
		String curll = driver.getCurrentUrl();
	
		Assert.assertTrue("verify the recover" , curll.contains("recover"));
		System.out.println("Completed.");
		driver.close();
	}
	
}
