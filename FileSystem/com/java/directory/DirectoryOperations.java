package com.java.directory;

import java.io.File;

public class DirectoryOperations 
{

	public static void main(String[] args) 
	{
		//createDir();  
		//createDireteries();
       		//renameDir();
		//moveDir();
		//deleteDir();
		//deleteOnExitDir();
		
		//dirAttributes();
		
		DirCollectons();
		//FileCollectionusingFileObject();
	}

	
	//mkDir(): to create a blank directory. Returns boolean
	 public static void createDir()
	 {
		 File f1=null;
		 try {
		
		 f1=new File("D:\\MorningBatch\\FileSystem\\Directory\\Sample");
		 boolean DirCreate = f1.mkdir();
		 if(DirCreate)
		 {
			 System.out.println("Directory created");
		 }else
		 {
			 System.out.println("Directory created"); 
		 }
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }finally
		 {
			 f1 = null;
		 }
	 } 
		 
		//mkDirs() :  to create a nested directories. Returns boolean
		 
		 public static void createDireteries()
		 {
			  File f1=null;
			  try
			  {
				  f1=new File("D:\\MorningBatch\\FileSystem\\Directory\\Sample\\A\\B\\C\\D");
				   boolean bln = f1.mkdirs();
				   if(bln)
				   {
					   System.out.println("multiple Directories created");
				   }
				   else
				   {
					   System.out.println("Failed to create drie's");
				   }
			    
			  }
			  catch(Exception e)
			  {
				  e.printStackTrace();
			  }finally
			  {
				  f1=null;
			  }
		 }
		 
		 
		 
		 //renameTo(): to rename OR to move the directories. Returns boolean
		 
		 public static void renameDir()
		 {
			 File f1=null;
			 
			 File f2=null;
			 
			 try {
			 
			 f1=new File("D:\\MorningBatch\\FileSystem\\Directory\\Test");
			 f2=new File("D:\\MorningBatch\\FileSystem\\Directory\\Demo");
			   boolean bln = f1.renameTo(f2);
			   if(bln==true) 
			   {
				   System.out.println("Renamed1");
			   }
			   else
			   {
				   System.out.println("Unable to rename");
			   }
			 
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 finally
			 {
				 f1=null;
				 f2=null;
			 }
		 }
		 
		 
//renameTo(): to rename OR to move the directories. Returns boolean
		 
		 public static void moveDir()
		 {
			 File f1=null;
			 
			 File f2=null;
			 
			 try {
			 
			 f1=new File("D:\\MorningBatch\\FileSystem\\Directory\\Sample");
			 f2=new File("D:\\MorningBatch\\FileSystem");
			   boolean bln = f1.renameTo(f2);
			   if(bln==true) 
			   {
				   System.out.println("Mb   oved");
			   }
			   else
			   {
				   System.out.println("Unable to move");
			   }
			 
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 finally
			 {
				 f1=null;
				 f2=null;
			 }
		 }
		 
	 public static void deleteDir()
	 {
		 File f1=null;
		 
		 try
		 {
			 f1=new File("D:\\MorningBatch\\FileSystem\\Directory\\Demo");
			 if(f1.delete())
			 {
				 System.out.println("Delete Sucess");
			 }
			 else
			 {
				 System.out.println("not success");
			 }
			 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 finally
		 {
			 f1=null;
		 }
	 }
		 
		 
	 public static void deleteOnExitDir()
	 {
		 File f1=null;
		 
		 try
		 {
			 f1=new File("D:\\MorningBatch\\FileSystem\\Directory\\Sample\\A\\B\\C\\D");
			 f1.deleteOnExit();
			 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 finally
		 {
			 f1=null;
			 System.out.println("*************************************************");
		 }
	 }
	 
	 
	//file attribute
	public	static void dirAttributes()
		{
		 File f1=null;
		 try
		 {
			 f1=new File("D:\\MorningBatch\\FileSystem\\Directory\\Sample\\A\\B\\C");
			 System.out.println("f1.getAbsoluteFile(): "+f1.getAbsoluteFile());
			 System.out.println("f1.getFreeSpace()"+f1.getFreeSpace());
			 System.out.println("f1.getTotalSpace() "+f1.getTotalSpace());
			 System.out.println("f1.getParentFile()"+f1.getParentFile());
			 System.out.println("f1.exists()"+f1.exists());
             System.out.println("f1.isDirectory()"+f1.isDirectory());		
             
		        
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally
		 {
			 f1=null;
		 }
		 
	 
		}
	
	
	public static void DirCollectons()
	{
		File f1=null;
		File f2=null;
		
		try
		{
			f1=new File("D:\\MorningBatch\\FileSystem\\Directory\\Sample");
			 String[] str = f1.list();
			 
			 for(int i=0;i<str.length;i++)
			 {
				 f2=new File(f1,str[i]);
				 if(f2.isDirectory())
					 {
						 System.out.println(f2.getPath());
					 }
				 
			 }
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		 {
			f1=null;
			f2=null;
		}
	}
		
		public static void FileCollectionusingFileObject()
		{
			File f1=null;
			File f2=null;
			try
			{
				f1=new File("D:\\MorningBatch\\FileSystem\\Directory\\Sample\\A");
			    File strObject[] = f1.listFiles();
			    
			    for(int i=0;i<strObject.length;i++)
			    {
			    	if(strObject[i].isDirectory())
			    	{
			    		System.out.println(strObject[i].getPath());
			    	}
			    }
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		    finally {
		    	f1=null;
		    	f2=null;
		    }
		 
			
		}
		
		
	 }

