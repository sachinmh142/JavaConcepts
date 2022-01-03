package com.java.filesystem;

import java.io.File;

public class FilePractice 
{

	public static void main(String[] args) 
	{
           File f1=null;
           File f2=null;
           File f3=null;
           
           try
           {
        	 /*  f1=new File("D:\\asa\\One.txt");
        	   f2=new File("D:\\asa\\two.txt");
        	   f3=new File("D:\\asa\\New folder\\One.txt");
        	  boolean createFile=f1.createNewFile();
        	  System.out.println(createFile);
        	  
        	  boolean renameFile = f1.renameTo(f2);
        	  System.out.println(renameFile);
        	  
        	  boolean moveFile = f2.renameTo(f3);
        	  System.out.println(moveFile);
        	  
        	 boolean delete = f2.delete();
        	 System.out.println(delete);
        	 
        	 f3.deleteOnExit();
        	 
        	 
        	 boolean createFile1=f1.createNewFile();
       	  System.out.println(createFile1);
       	  
       	  System.out.println("canRead()"+f1.canRead());
       	System.out.println("canExecute()"+f1.canExecute());
       	System.out.println("canWrite()"+f1.canWrite());
       	
    	System.out.println("isFile()"+f1.isFile());
    	System.out.println("isDirectory()"+f1.isDirectory());
    	System.out.println("exists()"+f1.exists());
    	
    	System.out.println("getAbsolutePath()"+f1.getAbsolutePath());
    	System.out.println("getAbsolutePath()"+f1.getFreeSpace());
    	System.out.println("getAbsolutePath()"+f1.getName());
    	System.out.println("getAbsolutePath()"+f1.getPath());*/
    	
    	
    	File f4=null;
    	File f5=null;
    	try
    	{
    		f4=new File("D:\\Appps");
    		boolean bln=f4.mkdir();
    		System.out.println(bln);
    		
    		String[] str=f4.list();
            for(int i=0;i<str.length;i++)
            {
            	f5= new File(f4,str[i]);
            	if(f5.isFile())
            			{
            		        System.out.println("total files : "+f5.getPath());
            			}
            }
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
       	
    	
       	  
       	  
       	  
       	  
           }catch(Exception e)
           {
        	   e.printStackTrace();
           }
	}

}
