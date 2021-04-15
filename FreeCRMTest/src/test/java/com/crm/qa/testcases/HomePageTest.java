package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage lp;
	HomePage homepage;
	ContactsPage contactsPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		contactsPage = new ContactsPage();
		lp = new LoginPage();
		homepage = lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, prop.getProperty("Title"));
	}
	
	@Test(priority=2)
	public void verifyCorrectUserNameTest() {
		Assert.assertTrue(homepage.verifyCorrectUsername());
		String userText = homepage.verifyUserName();
		Assert.assertEquals(userText, prop.getProperty("user"));
	}
	
	@Test(priority=3)
	public void contactsLinkTest() {
		contactsPage = homepage.clickOnContactsLink();		
	}

}
