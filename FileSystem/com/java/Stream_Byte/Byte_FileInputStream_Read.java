package com.java.Stream_Byte;

import java.io.FileInputStream;

public class Byte_FileInputStream_Read 
{

	public static void main(String[] args) 
	{
		FileRead();	
	}


	public static void FileRead()
	{
		FileInputStream fin=null;
		try
		{
			fin= new FileInputStream("D:/MorningBatch/FileSystem/One.txt");
			int n=0;
			//or while(true)
			while(fin!=null)
			{
				n=fin.read();
				if(n==-1)
				{
					break;
				}
				
				char ch=(char) n;
				
				
				System.out.print(ch);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			
			fin=null;
			
		}
		
	}
    		

}
