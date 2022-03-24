package com.productpurchasepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")
	private WebElement casual;
	
	public WebElement getCasual() {
		return casual;
	}
	public Dresses_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
}
