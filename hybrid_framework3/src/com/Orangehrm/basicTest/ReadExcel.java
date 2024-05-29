package com.Orangehrm.basicTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements FrameworkConstants
{
	public static String Readdata(String Sheet, int row, int Cell) throws Exception
	{
		FileInputStream fis=new FileInputStream(Excel_path);
		Workbook book = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Cell cell=book.getSheet(Sheet).getRow(row).getCell(Cell);
		String value = cell.getStringCellValue().toString();
		return value;
		
		
	}

}
