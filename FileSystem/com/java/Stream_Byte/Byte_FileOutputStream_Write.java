
package com.java.Stream_Byte;

import java.io.FileOutputStream;

public class Byte_FileOutputStream_Write {

	 static FileOutputStream fout=null;
	public static void main(String[] args) 
	{

		FileOutputStreamDemo();

	}

	 public static void FileOutputStreamDemo()
	 {
		
		 try
		 {
			 fout=new FileOutputStream("D:/MorningBatch/FileSystem/Two.txt");
	
			 fout.write(65);
			 fout.write(66);
			 fout.write(67);
			 fout.write('a');
			 
			 for(int i='a';i<='z';i++)
			 {
				 fout.write(i);
			 }
			System.out.println("Written Successfully"); 
		 }catch(Exception e )
		  {
			 e.printStackTrace();
		 }
		 finally
		 {
		    try
		    {
		    	fout.flush();
		    	fout.close();
		    	fout=null;
		    	
		    	
		    }catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
		 }
	 }
}
