package com.productpurchasepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Confirmation_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//strong[text()='Your order will be sent as soon as we receive your payment.']")
	private WebElement move;
	
	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement back;
	
	public WebElement getBack() {
		return back;
	}

	public WebElement getMove() {
		return move;
	}

	public Order_Confirmation_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
}
