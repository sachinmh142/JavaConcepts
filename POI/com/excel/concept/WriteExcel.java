package com.excel.concept;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel 
{

	
	 static FileOutputStream fout;
	 static Workbook wb=null;
	 static Sheet sh=null;
	 static Row row=null;
	 static Cell cell=null;
	public static void main(String[] args) {
		
		
		try
		 {
			
			wb=new XSSFWorkbook();
			
			sh=wb.createSheet("dfgdfg");
			
			
			for(int i=0;i<1;i++)
			{
			row=sh.createRow(i);
			
			for(int j=0;j<4;j++)
			{
			cell=row.createCell(j);
			
			
			cell.setCellValue("a");
			}
			
			}
			fout=new FileOutputStream("E:\\JavaConcepts\\JavaConcepts\\Excel.xlsx");
			
			wb.write(fout);;	
			System.out.println("written");
			 
		 }catch(Exception e){
			 
		 }
	} 
	 
	 
	 
	 
}
