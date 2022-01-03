package com.java.Stream_Char;

import java.io.FileReader;

public class ReadOperation 
{
    public static void main(String args[])
    {
    	charFileRead();
    	
    }
    public static void charFileRead()
    {
    FileReader fin=null;
    	try
    	{
    		fin=new FileReader("D:/MorningBatch/FileSystem/One.txt");
    		int n=0;
    		while(true)
    		{
    			n=fin.read();
    			if(n==-1)
    			{
    				break;
    				
    			}
    		 char  ch=(char)n;
    		 System.out.print(ch);
    			
    		}
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		
    	}
    }
}
