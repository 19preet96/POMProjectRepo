package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase{
	
	LoginPage lp;
	HomePage homepage;
	ContactsPage contactsPage;
	
	public ContactsPageTest() {
		super();		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		contactsPage = new ContactsPage();
		lp = new LoginPage();
		homepage = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnContactsLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void verifyContactsLogoTest() {
		Assert.assertTrue(contactsPage.verifyContactsLogo(), "Not at contacts page");
	}
	
	@Test(priority=2)
	public void selectContactTest() {
		contactsPage.selectContacts("Jack Harper");
	}

}
