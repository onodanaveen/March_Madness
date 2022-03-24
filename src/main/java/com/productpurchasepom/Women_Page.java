package com.productpurchasepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")
	private WebElement dresses;

	
	public WebElement getDresses() {
		return dresses;
	}
	
	public Women_Page(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

}
