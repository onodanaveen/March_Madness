package com.productpurchasepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed_Dress_Page {
	

	public WebDriver driver;
	
	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size;
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement addcount;
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement checkout;
	
	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddcount() {
		return addcount;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public Printed_Dress_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

}
