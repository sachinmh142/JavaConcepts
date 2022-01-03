package com.java.Stream_Char;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		
		
		charFileWrite();
	}

	public static void charFileWrite()
	{
		FileWriter fout=null;
		
		try
		{
			fout=new FileWriter("D:/MorningBatch/FileSystem/One.txt", false);
		//	fout.write("\n");
			fout.write("HI Bfsnfkskjdfn");
			fout.write("\n");
			System.out.println("Hi");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.flush();
				fout=null;
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
}
