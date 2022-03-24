package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_Page {
	
	
	public WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cardno;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardtype;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expmonth;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expyear;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement book;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public Book_Hotel_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

}
