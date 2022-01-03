package com.java.Stream_Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class BufferRead 
{

	
	public static void main(String[] args) 
	{

		readBuffer();

	}
	
	public static void readBuffer()
	{
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new FileReader("D:\\New Text Document.txt"));
			String str=null;
			str=br.readLine();
			 while(str!=null)
			 {
				 
				 System.out.println(str);
				
		     }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				br.close();
				br=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
