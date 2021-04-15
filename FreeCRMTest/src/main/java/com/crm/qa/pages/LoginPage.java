package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory or OR Object Repo
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginButton;
	
	@FindBy(linkText = "Sign Up")
	WebElement signUp;
	
	//Initializing Page Objects
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}
	
	

}

