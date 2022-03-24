package com.productpurchasepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dresses_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Printed Dress'])[2]")
	private WebElement printed;

	

	public WebElement getPrinted() {
		return printed;
	}
	
	public Casual_Dresses_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
}
