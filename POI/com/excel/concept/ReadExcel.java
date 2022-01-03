package com.excel.concept;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
		static Workbook wb=null;
	 	static Sheet sh=null;
		static	Row row=null;
		static	Cell cell=null;
		static FileInputStream fin;
		static	int rowNum = 0; 
		static	int colNum = 0;
		
   public static void main(String[] args) {
	
	   
	  
		try
		{
		   	
			fin=new FileInputStream("E:\\JavaConcepts\\JavaConcepts\\Excel.xlsx");
			
			wb=new XSSFWorkbook(fin);
			
			sh= wb.getSheet("dfgdfg");
			
            rowNum=sh.getPhysicalNumberOfRows();
            
            for(int r=0;r<rowNum;r++)
			{
				row=sh.getRow(r);
				colNum=row.getPhysicalNumberOfCells();
				
					for(int c=0;c<colNum;c++)
						
					{
						cell=row.getCell(c);
						cell.setCellType(Cell.CELL_TYPE_STRING);
						System.out.print(" "+cell.getStringCellValue()+" ");
					}
					System.out.println();
			}
            
		}catch(Exception e)
		{
		e.printStackTrace();	
		}
}
}
