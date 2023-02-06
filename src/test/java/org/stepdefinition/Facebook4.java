package org.stepdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.xml.LaunchSuite;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import io.cucumber.java.en.*;

public class Facebook4 extends BaseClass {

	@Given("Open the browser and load the facebook url")
	public void openTheBrowserAndLoadTheFacebookUrl() {
		browserLauncher();
		url("https://facebook.com");
		maximize();
	}

	@When("Enter the invalid username and password")
	public void enterTheInvalidUsernameAndPassword() {
		LoginPojo lo = new LoginPojo();
		fill(lo.getTxtUser(), "Greens");
		fill(lo.getTxtPass(), "14506");
	}

	@When("Click the login button")
	public void clickTheLoginButton() throws InterruptedException {
		LoginPojo lo = new LoginPojo();
		toClick(lo.getBlogin());
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}

	@Then("Navigate to invalid password page")
	public void navigateToInvalidPasswordPage() {
		String cuur = driver.getCurrentUrl();

		Assert.assertTrue("Verifying the current url", cuur.contains("privacy"));
		System.out.println("Completed: Invalid password/username page verified.");
		close();
	}

	@When("Enter the invalid username and valid password")
	public void enterTheInvalidUsernameAndValidPassword() {
		LoginPojo lo = new LoginPojo();
		fill(lo.getTxtUser(), "Greens");
		fill(lo.getTxtPass(), "14506bcabb");
	}

	@When("Enter the valid username and invalid password")
	public void enterTheValidUsernameAndInvalidPassword() {
		LoginPojo lo = new LoginPojo();
		fill(lo.getTxtUser(), "06kumaran@gmail.com");
		fill(lo.getTxtPass(), "145890bbbba");
	}

	@When("Enter the valid username and give the password as space")
	public void enterTheValidUsernameAndGiveThePasswordAsSpace() {
		LoginPojo lo = new LoginPojo();
		fill(lo.getTxtUser(), "06kumaran@gmail.com");
		fill(lo.getTxtPass(), " ");
	}

	@When("Enter the valid username and valid password")
	public void enterTheValidUsernameAndValidPassword() {
		LoginPojo lo = new LoginPojo();
		fill(lo.getTxtUser(), "06kumaran@gmail.com");
		fill(lo.getTxtPass(), "14506bcabb");
	}

	@Then("Navigate to home page")
	public void navigateToHomePage() {
		String title = driver.getCurrentUrl();

		if (title.contains("checkpoint")) {
			System.out.println("At checkpoint, login successful.");
		}else {
			System.out.println("Login unsuccessful.");
		}
		//Assert.assertTrue(title.contains("checkpoint"));
		//System.out.println("At checkpoint, login successful.");
		close();
		}

	@When("Enter the valid username {string} and valid password {string}")
	public void enterTheValidUsernameAndValidPassword(String nam, String pas) {
		LoginPojo lo = new LoginPojo();
		fill(lo.getTxtUser(), nam);
		fill(lo.getTxtPass(), pas);
	}

	
}
