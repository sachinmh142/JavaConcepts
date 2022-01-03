package  com.java.filesystem;

import java.io.File;


public class FileOperation 
{
	
    public static void main(String[] args)
    {
    	//createFile();
    	//renameFile();
    	//moveFile();
    	//delete();
    	//deleteOnExit();
    	//fileAttributes();
    	FileCollectons();
    	//fileCollection2();
    	
    }
    
    
    // createNewFile(): to create a new blank file. returns boolean.
     static void createFile()
    {
    	 File f1=null;
    	 //just give the path with file name , create method will create file .
    	
    	f1=new File("D:\\MorningBatch\\SG_13th-Jan-2020_MorningBatch_FileSystem\\FileOne.txt");
    	try 
    	{
			boolean newFile = f1.createNewFile();
			if(newFile)
			{
				System.out.println("File created Successfully");
			}
			else
			{
				System.out.println("File not created ");
				
			}
		
		} 
    	catch (Exception e) 
    	{
			
			e.printStackTrace();
		}
    	finally
    	{
    		f1=null;
    	}
    }
  
     //renameTo(): to rename files 
     static void renameFile()
     {
    	 File f1=null;
    	 File f2=null;
    	 try
    	 {
    		 //f1 file should exists to do this operation  , thats renaming to f2
    		 f1=new File("D:\\MorningBatch\\SG_13th-Jan-2020_MorningBatch_FileSystem\\FileOne.txt");
    		 f2=new File("D:\\MorningBatch\\SG_13th-Jan-2020_MorningBatch_FileSystem\\FileTwo.txt");
    		 //important : f1 is renaming to f2
    		 boolean blnRes = f1.renameTo(f2);
    		 if(blnRes)
    		 {
    			 System.out.println("file Renamed");
    		 }
    		 else
    		 {
    			 System.out.println("Not renamed");
    		 }
    		 
    	 }
    	 catch (Exception e) 
     	{
 			
 			e.printStackTrace();
 		}
    	 finally
    	 {
    		 f1=null;
    		 f2=null;
    	 }
     }
     //renameTo(): to rename files OR to move (Cut & paste) files.returns boolean

      static void moveFile()
      {
    	  File f1=null;
    	  File f2=null;
    	  
    	  try
    	  {
    		  f1=new File("D:\\MorningBatch\\SG_13th-Jan-2020_MorningBatch_FileSystem\\FileTwo.txt");
    		  f2=new File("D:\\MorningBatch\\SG_13th-Jan-2020_MorningBatch_FileSystem\\MoveFile\\FileTwo.txt");
    		  
    		   boolean blnRes = f1.renameTo(f2);
    		   if(blnRes)
    		   {
    			   System.out.println("File Moved Successfully");
    		   }
    		   else
    		   {
    			   System.out.println("File Not Moved Successfully");
    	    		
    			   
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
     
      //delete(): to delete the files which returns boolean
      static void delete()
      {
    	  File f1=null;
    	  
    	  try
    	  {
    		 f1=new File("D:\\MorningBatch\\SG_13th-Jan-2020_MorningBatch_FileSystem\\MoveFile\\FileTwo.txt");
    		 
    		 boolean bnRes=f1.delete();
    		 if(bnRes)
    		 {
    			 System.out.println("File Deleted Successfully");
    		}
    		 else
    		 {
    			 System.out.println("Not deleted");
    		 }
    		  
    	  }
    	  catch(Exception e)
     	  {
    		  
    	  }finally
    	  {
    		f1=null;
    		
    	  }
      }
      
      //deleteOnExit(): to delete the files which is void
      static void deleteOnExit()
      {
    	  File f2=null;
    	  try
    	  {
    		  // direclty we can delete the file by giving path of the file , just for understanding 
    		  //i reused above methods.
    		  createFile();
    		  renameFile();
    		  moveFile();
    		  f2=new File("D:\\MorningBatch\\SG_13th-Jan-2020_MorningBatch_FileSystem\\MoveFile\\FileTwo.txt");
    		  f2.deleteOnExit();
    		  
    		  
    		  
    	  }catch(Exception e)
    	  {
    		  e.printStackTrace();
    		  
    	  }finally
    	  {
    	        f2=null;	  
    	  }
      }
      
      
      
      //FileProperties
      
      
      
      static void fileAttributes()
      {
    	  File f1=null;
    	  
    	  try {
    		  
    		  f1=new File("file:///D:/MorningBatch/SG_13th-Jan-2020_MorningBatch_FileSystem/FileOne.txt");
    		System.out.println("getAbsolutePath: "+f1.getAbsolutePath());
  			System.out.println("getFreeSpace: "+f1.getFreeSpace());
  			System.out.println("getName: "+f1.getName());
  			System.out.println("getParent: "+f1.getParent());
  			System.out.println("getPath: "+f1.getPath());
  			System.out.println("getTotalSpace: "+f1.getTotalSpace());
  			System.out.println("getUsableSpace: "+f1.getUsableSpace());
  		
  			//getMethods : getFreeSpace , getAbsolutePath ,  
  			//getParent , getName , getTotalSpace ,f1.getPath 			
  			
  			
  			System.out.println("canExecute: "+f1.canExecute());
  			System.out.println("canRead: "+f1.canRead());
  			System.out.println("canWrite: "+f1.canWrite());
  			
  			//can methods : canWrite , canRead , canExecute ,isHidden
  			
  			
  			System.out.println("isDirectory: "+f1.isDirectory());
  			System.out.println("isFile: "+f1.isFile());
  			System.out.println("isHidden: "+f1.isHidden());
  			System.out.println("exists: "+f1.exists());
  			
  			
  			//is : isDirectory , isFile , isHidden , exists
  			
  			System.out.println("setWritable: "+f1.setWritable(true));
  			System.out.println("setReadOnly: "+f1.setReadOnly());
  			
  		   //set : setWritable , setReadOnly
  			
  		
    		  
    	  }catch(Exception e)
    	  {
    		  e.printStackTrace();
    	  }finally
    	  {

    		  
    	  }
      }
      
      public static void FileCollectons()
  	{
  		File f1=null;
  		File f2=null;
  		
  		try
  		{
  			f1=new File("D://MorningBatch//FileSystem");
  			 String[] str = f1.list();
  			 
  			 for(int i=0;i<str.length;i++)
  			 {
  				 f2=new File(f1,str[i]);
  				 if(f2.isFile())
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
  		
      
      static void fileCollection2()
  	{
  		File f1 = null;
  	
  		try {
  			f1 = new File("D:\\MorningBatch\\SG_13th-Jan-2020_MorningBatch_FileSystem");
  			File str[] = f1.listFiles();
  			for(int i=0; i<str.length; i++)
  			{
  				if(str[i].isFile()) 
  				{
  					System.out.println(str[i].getPath());
  				}
  			}
  		}
  		catch(Exception e)
  		{
  			System.out.println(e);
  		}
  		finally
  		{
  			f1 = null;
  		}
  	}
     
    
}
