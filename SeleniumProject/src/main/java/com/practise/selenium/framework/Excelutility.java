package com.practise.selenium.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelutility {
	
	private static XSSFWorkbook workBook;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	private static String filepath=".\\src\\main\\resources\\ExcelData\\TestData.xlsx";
	
	public static void setUpDataEngine() throws IOException
	{
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		workBook = new XSSFWorkbook(fis);
		sheet = workBook.getSheet("test");
	}
	
	public static String getCellData(int rnum,int cnum)
	{
		row = sheet.getRow(rnum);
		cell=row.getCell(cnum);
		String celldata=getcellvalue(cell);
		return celldata;
	}

	private static String getcellvalue(XSSFCell cell) {
		int type;
		Object result = null;
		type=cell.getCellType();
		switch(type)
		{
		
		case 0:
			result = cell.getNumericCellValue();
			break;
		
		
		case 1:
			result = cell.getStringCellValue();
			break;
		}
		return result.toString();
	}

}
