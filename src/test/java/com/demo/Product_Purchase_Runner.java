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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.base_class.Base_Class;
import com.productpurchasepom.Casual_Dresses_Page;
import com.productpurchasepom.Dresses_Page;
import com.productpurchasepom.Home_Page;
import com.productpurchasepom.Login_Page;
import com.productpurchasepom.Order_Confirmation_Page;
import com.productpurchasepom.Order_History_Page;
import com.productpurchasepom.Order_Summary_Page;
import com.productpurchasepom.Orders_Page;
import com.productpurchasepom.Printed_Dress_Page;
import com.productpurchasepom.Women_Page;

public class Product_Purchase_Runner extends Base_Class {
	public static WebDriver driver;
	
	public static Logger log = Logger.getLogger(Product_Purchase_Runner.class);
	
	public static void main(String[] args) throws IOException {
	
		driver= browser_Configuration("Chrome");
		
		PropertyConfigurator.configure("log4j.properties");
		
		getUrl("http://automationpractice.com/index.php");
		
		log.info("Url Launched");

		implicitWait(10);
		
		Home_Page hp = new Home_Page(driver);
		
		clickOnElement(hp.getWomen());
		
		Women_Page wp = new Women_Page(driver);
		
		clickOnElement(wp.getDresses());
		
		Dresses_Page dp = new Dresses_Page(driver);
		
		clickOnElement(dp.getCasual());
		
		Casual_Dresses_Page cdp = new Casual_Dresses_Page(driver);
		
		clickOnElement(cdp.getPrinted());
		
		Printed_Dress_Page pdp = new Printed_Dress_Page(driver);
		
		dropdown(pdp.getSize(),"Value","3");
		
		clickOnElement(pdp.getAddcount());
		clickOnElement(pdp.getAddcount());
		
		clickOnElement(pdp.getSubmit());
		
		clickOnElement(pdp.getCheckout());
		
		Orders_Page op = new Orders_Page(driver);
		
		clickOnElement(op.getCheckout());
		
		Login_Page lp = new Login_Page(driver);
		
		inputValueElement(lp.getEmail(), particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for Automation dress purchase.xlsx",11,5));
		
		inputValueElement(lp.getPassword(), particular_Data("C:\\Users\\91952\\eclipse-workspace\\Project\\TC for Automation dress purchase.xlsx",12,5));
		
		clickOnElement(lp.getSignin());
		
		log.info("login Successful");
		
		clickOnElement(op.getProceed());
	
		clickOnElement(op.getCheckbox());

		clickOnElement(op.getProcess());
	
		clickOnElement(op.getPayment());
		
		Order_Summary_Page osp = new Order_Summary_Page(driver);
		
		clickOnElement(osp.getSubmit());
		
		Order_Confirmation_Page ocp = new Order_Confirmation_Page(driver);
		
		drag(ocp.getMove());
		
		screenshot("C:\\Users\\91952\\eclipse-workspace\\Automation_Practice_Mini_Project\\Screenshot\\orderdetails_draggeddown.png");
		
		clickOnElement(ocp.getBack());
		
		screenshot("C:\\Users\\91952\\eclipse-workspace\\Automation_Practice_Mini_Project\\Screenshot\\ORDERS.png");
		
		Order_History_Page ohp = new Order_History_Page(driver);
		
		clickOnElement(ohp.getLogout());

		close();
		
	}
}
