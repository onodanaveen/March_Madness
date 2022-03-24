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
import org.openqa.selenium.support.ui.Select;

import com.automationpom.Create_Account_Page;
import com.automationpom.Home_Page;
import com.automationpom.Login_Page;
import com.base_class.Base_Class;

public class Automation_Runner extends Base_Class {
	public static WebDriver driver;
	
	public static Logger log = Logger.getLogger(Automation_Runner.class);
	
	public static void main(String[] args) throws IOException {
	
		driver = browser_Configuration("Chrome");
		
		PropertyConfigurator.configure("log4j.properties");
		
		getUrl("http://automationpractice.com/index.php");
		
		log.info("URL launch");
		
		implicitWait(10);
		
		Home_Page hp = new Home_Page(driver);
		
		clickOnElement(hp.getLogin());
		
		Login_Page lp = new Login_Page(driver);
		
		String mail = particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for sign up.xlsx",2,5);

		inputValueElement(lp.getEmail(), mail);
	
		clickOnElement(lp.getSubmit());
		
		Create_Account_Page cap = new Create_Account_Page(driver);
	
		clickOnElement(cap.getGender());
	
		inputValueElement(cap.getFirstname(), "want");

		inputValueElement(cap.getLastname(), "peace");

		inputValueElement(cap.getPassword(), "stopwar");

		dropdown(cap.getDays(),"Value","11");

		dropdown(cap.getMonth(),"Index","2");

		dropdown(cap.getYear(),"Value","2022");

		inputValueElement(cap.getFirst(), "Russia");

		inputValueElement(cap.getLast(), "UkraineWar");
	
		inputValueElement(cap.getCity(), "Kyiv");

		inputValueElement(cap.getAddress(), "25/02,war starts");
		
		dropdown(cap.getState(), "VisibleText","Kentucky");
		
		inputValueElement(cap.getPostcode(), "63600");

		inputValueElement(cap.getMobile(), "9524775509");

		inputValueElement(cap.getAlias(),"Fake kingdom, 50002");
	
		clickOnElement(cap.getSubmit());
		
		screenshot("C:\\Users\\91952\\eclipse-workspace\\Automation_Practice_Mini_Project\\Screenshot\\accountCreate.png");	
		
	}
	
}
