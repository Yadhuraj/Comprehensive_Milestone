package com.mindtree.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecompanents.BaseClass;

public class ExcelSheet extends BaseClass {
	
	public static String Excelread(int rownum,int cellnum) throws IOException
	{
		Iterator<Row> rows = sheet.rowIterator();
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = null;
		if(cell.getCellType()==CellType.STRING)
		{
			value= cell.getStringCellValue();
		}
		
		else if(cell.getCellType()==CellType.NUMERIC)
		{
			value= ((int)cell.getNumericCellValue()+"");
		}
		return value;
	}
}
