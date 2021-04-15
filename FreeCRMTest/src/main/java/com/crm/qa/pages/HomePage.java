package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement calender;
	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement home;
	
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement calendar;
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement usernameDisplay;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink() {
		contacts.click();
		return new ContactsPage();
	}
	
	public HomePage clickOnHome() {
		home.click();
		return new HomePage();
	}
	
	public CalendarPage clickOnCalendar() {
		calendar.click();
		return new CalendarPage();
	}
	
	public boolean verifyCorrectUsername() {
		return usernameDisplay.isDisplayed();
	}
	
	public String verifyUserName() {
		return usernameDisplay.getText();
	}
	

}
