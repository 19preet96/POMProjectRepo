package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage lp;
	HomePage hp;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		lp = new LoginPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = lp.verifyLoginPageTitle();
		Assert.assertEquals(title, prop.getProperty("Title"));
	}
	
	@Test(priority=2)
	public void loginTest() {
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
}
