package com.base_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static String value;
	
	public static WebDriver driver;
	
	public static WebDriver browser_Configuration(String type) {
		if(type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		if (type.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\91952\\eclipse-workspace\\Selenium_demo\\Mozilla_Driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		return driver;	
	}
		
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void inputValueElement(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void close() {
		driver.close();
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void dropdown(WebElement element,String type, String data) {
		if (type.equalsIgnoreCase("Value")) {
			Select s = new Select(element);
			s.selectByValue(data);
		}
		else if (type.equalsIgnoreCase("VisibleText")) {
			Select s = new Select(element);
			s.selectByVisibleText(data);
		}
		else if (type.equalsIgnoreCase("index")) {
			Select s = new Select(element);
			int index = Integer.parseInt(data);
			s.selectByIndex(index);
		}
	}
	public static void screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}
	public static void implicitWait(int number) {
		driver.manage().timeouts().implicitlyWait(number, TimeUnit.SECONDS);
	}
	public static void drag(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	
	public static String particular_Data(String path, int row_index, int cell_index) throws IOException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(row_index);
		
		Cell c = r.getCell(cell_index);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			
			value = c.getStringCellValue();
			
		}
		else if (type.equals(CellType.NUMERIC)) {
			
			double numericCellValue = c.getNumericCellValue();
			
			int val = (int) numericCellValue;
			
			value = String.valueOf(val);
			
		}
		
		
		return value;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
