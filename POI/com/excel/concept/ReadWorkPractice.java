package com.excel.concept;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWorkPractice 
{

	 public static void main(String[] args) {
		
		 try
		 {
			 
			 FileInputStream fin=new FileInputStream("E:\\JavaConcepts\\JavaConcepts\\Excel.xlsx");
			 Workbook wb=new XSSFWorkbook(fin);
			 
			 Sheet sh=wb.getSheet("dfgdfg");
			 
			 
			 int rowTotal = sh.getPhysicalNumberOfRows();
			 
			 for(int i=0;i<rowTotal;i++)
			 {
				 Row rw=sh.getRow(i);
				 
				int cellTotal= rw.getPhysicalNumberOfCells();
				 
				 for(int j=0;j<cellTotal;j++)
				 {
					 Cell cell=rw.getCell(j);
					String as = cell.getStringCellValue();
					 System.out.print(as);
					 System.out.print(" ");
				 }
			
				 
			 }
			 
			 
			 
			 
			 
		 }catch(Exception e )

	 {
			 }
	 }
}
