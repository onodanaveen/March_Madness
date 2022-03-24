package com.automationpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
	@FindBy(id = "email_create")
	private WebElement email;
	
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	private WebElement submit;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public Login_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

}
