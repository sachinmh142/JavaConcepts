package com.java.Stream_Buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWrite 
{
public static void main(String args[])
{
	bufferWrite();
}

 public static void bufferWrite()
 {
	 BufferedWriter bt=null;
	 try
	 {
		 bt=new BufferedWriter(new FileWriter("D:/MorningBatch/FileSystem/One.txt",true));
		 
		 bt.write("Sahhvnsd,fknsfnsdkf");
		 bt.newLine();
		 System.out.println("jfdhsdjkf");
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 finally
	 {
		 try
		 {
			 bt.flush();
			 bt.close();
			 bt=null;
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
 }
 
}
