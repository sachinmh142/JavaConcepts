package com.java.assignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class Bufferreader 
{

	public static void main(String[] args) 
	{
		readFile();
	}

		//read from the file
		static void readFile()
		{
			BufferedReader br = null;
			int chars=0;
			int lines=0;
			int words=0;
			try {
				br = new BufferedReader(new FileReader("D:/MorningBatch/FileSystem/One.txt"));
				
				String sLine=null;
				
				
				while((sLine = br.readLine())!=null)
				{
					lines++;
					String[] str=sLine.split(" ");
					words=words+str.length;
					for(int i=0;i<str.length;i++)
					{
						chars=chars+str[i].length();
					}
					
					System.out.println("Lines: "+lines);
					System.out.println("words: "+words);
					System.out.println("chars: "+chars);
				}
				
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				try {
					br.close();
					br = null;
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}               
		
	}


