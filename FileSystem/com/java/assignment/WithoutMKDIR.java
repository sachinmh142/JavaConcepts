package com.java.assignment;

import java.io.File;

public class WithoutMKDIR {

	public static void main(String[] args) 
	{
		
		String strNames[]= {"Ram","Sham","Anil","Amar"};
		String s="D:\\MorningBatch";
		File f=null;
		
		for(int i=0;i<strNames.length;i++)
		{
			//Concatenate :  D:\\MorningBatch + Ram
			//               D:\\MorningBatch + Sham etc
			s+="\\"+strNames[i];
			f=new File(s);
			//System.out.println(s);
			f.mkdir();
		}
		
	}

}
