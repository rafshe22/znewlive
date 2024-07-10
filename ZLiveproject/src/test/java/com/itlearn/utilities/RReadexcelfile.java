package com.itlearn.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class RReadexcelfile {

	
	
	

	public static final String getcellvalue = null;
	public static FileInputStream inputStream;
	public static XSSFWorkbook workBook;
	public static XSSFSheet excelSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static  String getcellvalue(String fileName,String sheetName, int rowNo, int cellNo) {
		
		
		try {
			inputStream=new FileInputStream(fileName);
			workBook =new XSSFWorkbook(inputStream);
			excelSheet=workBook.getSheet(sheetName);
			cell=excelSheet.getRow(rowNo).getCell(cellNo);
			workBook.close();
			return cell.getStringCellValue();
			
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			
			return " ";
			
		}
	}
	

	public static int getrowcount(String filename,String Sheetname) {
		
		
		try {
			inputStream=new FileInputStream(filename);
			workBook=new XSSFWorkbook(inputStream);
			excelSheet=workBook.getSheet(Sheetname);
			int xx=excelSheet.getLastRowNum()+1;
			workBook.close();
			return xx;
			
		} catch (Exception e) {
			
			return 0 ;
		}
		
		
		
	}
	
		
		public static int getcolcount(String filename,String sheetname) {
			
			
			try {
				inputStream=new FileInputStream(filename);
				workBook=new XSSFWorkbook(inputStream);
				excelSheet=workBook.getSheet(sheetname);
				int xxcell=excelSheet.getRow(0).getLastCellNum();
				workBook.close();
				return xxcell;
				
				
				
			} catch (Exception e) {
				
				
				return 0;
			}
			
			
			
		}
		
	
	
		public String getStringdata(int sheetindex,int row,int Column){
			
			return workBook.getSheetAt(sheetindex).getRow(row).getCell(Column).getStringCellValue();
		}
		
		
		public String getStringData(String sheetName,int row,int column)
		{
			return workBook.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		}
		
		
		
	public double getnumericdata( String sheetname , int row,int column  ) {
		
		
		return workBook.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
	}
		
}
	
		
		
		
	

