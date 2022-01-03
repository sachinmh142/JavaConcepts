package com.java.assignment;

import java.io.File;

public class DeleteXLSXFile 
{
	static File f1=null;
	static File f2=null;
	public static void main(String[] args) 
	{
		deleteXLSXFile();
		
         		
	}
	public static void deleteXLSXFile()
	{
		
		try
		
		{ 
			f1=new File("D:\\MorningBatch\\FileSystem");
			
			boolean a = f1.isDirectory();
			if(a)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("No");
			}
				
			
			String str[] = f1.list();
			int count=0;
			for(int i=0; i<str.length; i++)
			{
				f2 = new File(f1, str[i]);
				if(f2.isFile()) 
				{
					//System.out.println(f2.getPath());
					if(f2.getPath().contains(".txt")) 
					{
						count++;
					}
				}
			}
			System.out.println(count);
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			f1=null;
			f2=null;
		}
		
		
	}

}
