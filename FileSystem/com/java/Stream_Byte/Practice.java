package com.java.Stream_Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Practice {

	public static void main(String[] args) 
	{
         FileInputStream fin=null;
         FileOutputStream fout=null;
         
         
        try
        {
        	fin=new FileInputStream("D:\\asa\\One.txt");
        	fout=new FileOutputStream("D:\\asa\\One.txt");
        	int n=0;
        	while(true)
        	{
        		n=fin.read();
        		if(n==-1)
        		{
        			break;
        		}
        		
        		char ch=(char) n;
        		System.out.print(ch);
        		
        		fout.write('s');
        		System.out.println("sdd");
        		
        	}
        }catch(Exception e)
        {
        	e.printStackTrace();
        }finally
        {
         try
         {
        	 fin=null;
        	 
        	 
         }catch(Exception e)
         {
        	 e.printStackTrace();
         }
        }
	}

}
