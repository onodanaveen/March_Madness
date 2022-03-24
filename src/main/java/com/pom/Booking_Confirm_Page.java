package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;

	

	public WebElement getLogout() {
		return logout;
	}
	
	public Booking_Confirm_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

}
