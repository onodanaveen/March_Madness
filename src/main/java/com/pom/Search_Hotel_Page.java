package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[2]")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room_type;
	
	@FindBy(id = "room_nos")
	private WebElement room_count;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement checkindate;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement checkoutdate;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultsperroom;
	
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement submit;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_count() {
		return room_count;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public Search_Hotel_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
		
	}
}
