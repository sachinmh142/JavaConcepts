package com.java.string;

public class StringAarrayUsingSplit {

	
	public static void main(String[] args) {
		
		  String str= "Sachin,Hiremath,M2147";
		  
		   String[] arrStr= str.split(",");
		   
		   for(String strEach : arrStr)
		   {
			   System.out.println(strEach);
		   }
	}
}
