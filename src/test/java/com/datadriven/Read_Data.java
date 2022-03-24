package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void Particular_Cell_Data() throws IOException {
		
		File f = new File("C:\\Users\\91952\\eclipse-workspace\\Project\\Dummy data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheet("List");
		
		Row r = s.getRow(3);
		
		Cell c = r.getCell(1);
		
		CellType type = c.getCellType();
		
		if(type.equals(CellType.STRING)) {
			
			String cellValue = c.getStringCellValue();
			
			System.out.println(cellValue);
		}
		else if(type.equals(CellType.NUMERIC)) {
			
			double cellValue = c.getNumericCellValue();
			
			int value = (int) cellValue;
			
			System.out.println(value);
		}
		wb.close();
	}
	public static void main(String[] args) throws IOException {
//		Particular_Cell_Data();
		All_Data();
//		Particular_Row_Data();
//		Particular_Column_Data();
	}
	public static void All_Data() throws IOException {
		
		File f = new File("C:\\Users\\91952\\eclipse-workspace\\Project\\Dummy data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);
				
				CellType type = c.getCellType();
				
				if (type.equals(CellType.STRING)) {
					
					String value = c.getStringCellValue();
					
					System.out.println(value);
				}
				else if(type.equals(CellType.NUMERIC)) {
					
					double numericValue = c.getNumericCellValue();
					
					int value = (int) numericValue;
					
					String v = String.valueOf(value);
					
					System.out.println(v);
				}
				
			}
		}
		wb.close();
		
	}
	private static void Particular_Row_Data() throws IOException {
			
		File f = new File("C:\\Users\\91952\\eclipse-workspace\\Project\\Dummy data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet s = wb.getSheet("List");
		
		XSSFRow row = s.getRow(2);
		
		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			
			XSSFCell cell = row.getCell(i);
			
			CellType type = cell.getCellType();
			
			if(type.equals(CellType.STRING)) {
				
				String value = cell.getStringCellValue();
				
				System.out.println(value);
			}
			
			else if (type.equals(CellType.NUMERIC)) {
				
				double numericValue = cell.getNumericCellValue();
				
				int value = (int) numericValue;
				
				String v = String.valueOf(value);
				
				System.out.println(v);
				
			}
			
		}
		wb.close();	
		
	}
		private static void Particular_Column_Data() throws IOException {
			File f = new File("C:\\Users\\91952\\eclipse-workspace\\Project\\Dummy data.xlsx");
			
			FileInputStream fis = new FileInputStream(f);
			
			Workbook wb = new XSSFWorkbook(fis);
			
			Sheet s = wb.getSheet("List");
			
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				
				Row r = s.getRow(i);
				
				Cell c = r.getCell(1);
				
				CellType type = c.getCellType();
				
				if (type.equals(CellType.STRING)) {
					
					String value = c.getStringCellValue();
					
					System.out.println(value);
				}
				
				else if(type.equals(CellType.NUMERIC)) {
					
					double numericValue= c.getNumericCellValue();
					
					int value = (int) numericValue;
					
					String va = String.valueOf(value);
					
					System.out.println(va);
				}
			}
			wb.close();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
