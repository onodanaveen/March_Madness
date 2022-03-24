package com.demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base_class.Base_Class;
import com.pom.Book_Hotel_Page;
import com.pom.Booking_Confirm_Page;
import com.pom.Home_Page;
import com.pom.Search_Hotel_Page;
import com.pom.Select_Hotel_Page;

public class Adactin_Runner extends Base_Class{
	public static WebDriver driver;
	
	public static Logger log = Logger.getLogger(Adactin_Runner.class);
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		driver = browser_Configuration("Chrome");
		
		PropertyConfigurator.configure("log4j.properties");
		
		getUrl("http://adactinhotelapp.com/index.php");
		
		log.info("Url launch successful");
		
		Home_Page hp = new Home_Page(driver);
		
		String mail = particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for Adactin.xlsx",1,5);
	
		inputValueElement(hp.getUsername(), mail);
		
		inputValueElement(hp.getPassword(),particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for Adactin.xlsx",2,5));
		
		clickOnElement(hp.getLogin());
		
		log.info("login successful");
		
		Search_Hotel_Page shp = new Search_Hotel_Page(driver);
		
		dropdown(shp.getLocation(),"Index","5");
		
		dropdown(shp.getHotels(),"Value","Hotel Hervey");
		
		dropdown(shp.getRoom_type(),"VisibleText","Super Deluxe");
		
		dropdown(shp.getRoom_count(),"Index","2");
		
		clear(shp.getCheckindate());
		inputValueElement(shp.getCheckindate(), particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for Adactin.xlsx",8,5));
		
		clear(shp.getCheckoutdate());
		inputValueElement(shp.getCheckoutdate(),particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for Adactin.xlsx",9,5));
		
		dropdown(shp.getAdultsperroom(),"VisibleText","3 - Three");
		
		clickOnElement(shp.getSubmit());
		
		Select_Hotel_Page selhp = new Select_Hotel_Page(driver);
		
		clickOnElement(selhp.getConfirm());
		
		clickOnElement(selhp.getCont());
		
		Book_Hotel_Page bhp = new Book_Hotel_Page(driver);
		
		inputValueElement(bhp.getFirstname(),particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for Adactin.xlsx",15,5));
		
		inputValueElement(bhp.getLastname(),particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for Adactin.xlsx",16,5));
		
		inputValueElement(bhp.getAddress(),particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for Adactin.xlsx",17,5));
		
		inputValueElement(bhp.getCardno(),particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for Adactin.xlsx",18,5));
		
		dropdown(bhp.getCardtype(),"Index","2");
		
		dropdown(bhp.getExpmonth(), "VisibleText","April");
		
		dropdown(bhp.getExpyear(),"Value","2022");
		
		inputValueElement(bhp.getCvv(),particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for Adactin.xlsx",22,5));
		
		clickOnElement(bhp.getBook());
		
		Thread.sleep(7000);
		
		screenshot("C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Screenshot\\booking1.png");
		
		Booking_Confirm_Page bcp = new Booking_Confirm_Page(driver);
		
		clickOnElement(bcp.getLogout());
		
		close();
	}

}
