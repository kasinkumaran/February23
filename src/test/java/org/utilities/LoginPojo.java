package org.utilities;

import org.utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(id="identify_email")
	private WebElement txtphone;
	
	@FindBy(id="pass")
	private WebElement txtPass;

	@FindBy(xpath="//button[text()='Log in']")
	private WebElement blogin;
	

	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchclick;
	
	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getsearchclick() {
		return searchclick;
	}
	
	public void setTxtUser(WebElement txtUser) {
		this.txtUser = txtUser;
	}

	public WebElement getTxtphone() {
		return txtphone;
	}

	public void setTxtphone(WebElement txtphone) {
		this.txtphone = txtphone;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}

	public WebElement getBlogin() {
		return blogin;
	}

	public WebElement getFlogin() {
		return flogin;
	}

	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement flogin;
	
}
