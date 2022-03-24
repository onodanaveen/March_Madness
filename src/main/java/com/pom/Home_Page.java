package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(name = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public Home_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}


}
