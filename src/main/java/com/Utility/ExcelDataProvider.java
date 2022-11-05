package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		String filepath="C:\\Users\\verma\\eclipse-workspace\\AAAA\\TestData\\DataExcel.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	wb=new XSSFWorkbook(fis);
	}
	public String getDataFromExcel(String sheetname,int row,int cell ) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	

}
