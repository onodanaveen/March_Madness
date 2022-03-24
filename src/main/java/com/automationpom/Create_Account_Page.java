package com.automationpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Account_Page {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	private WebElement gender;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstname;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastname;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "days")
	private WebElement days;
	
	@FindBy(xpath = "//select[@name='months']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@name='years']")
	private WebElement year;
	
	@FindBy(id = "firstname")
	private WebElement first;
	
	@FindBy(id = "lastname")
	private WebElement last;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "address1")
	private WebElement address;
	
	@FindBy(xpath = "//select[@name='id_state']")
	private WebElement state;
	
	@FindBy(id = "postcode")
	private WebElement postcode;
	
	@FindBy(id = "phone_mobile")
	private WebElement mobile;
	
	@FindBy(xpath = "//input[@name='alias']")
	private WebElement alias;
	
	@FindBy(xpath = "//button[@name='submitAccount']")
	private WebElement submit;
	
	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDays() {
		return days;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAlias() {
		return alias;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public Create_Account_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
}
