package com.productpurchasepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkout;

	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement proceed;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement process;
	
	@FindBy(xpath = "//a[@title='Pay by check.']")
	private WebElement payment;

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProcess() {
		return process;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	public Orders_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

}
