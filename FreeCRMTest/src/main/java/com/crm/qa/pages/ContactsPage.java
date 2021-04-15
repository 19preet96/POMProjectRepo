package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement contactsLogo;
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactsLogo() {
		return contactsLogo.isDisplayed();
	}
	
	public void selectContacts(String contactName) {
		//driver.findElement(By.xpath("//a[text()='"+contactName+"']//parent::td[@class='datalistrow']"
		//			+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}

}
