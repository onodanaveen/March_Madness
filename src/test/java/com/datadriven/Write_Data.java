package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("‪C:\\Users\\91952\\Desktop\\Write_Excel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.createSheet("Temple Monkeys");	
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);	
		cell.setCellValue("Mate Vinadhunga");
		
		wb.getSheet("Temple Monkeys").getRow(0).createCell(1).setCellValue("butta bomma");
		
		wb.getSheet("Temple Monkeys").createRow(1).createCell(0).setCellValue("Inkem inkem kaavale");
		
		wb.getSheet("Temple Monkeys").getRow(1).createCell(1).setCellValue("Oke oke lokam");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
	}

}
