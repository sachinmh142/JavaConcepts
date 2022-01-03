package com.java.string;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {
		
		String str = "bangalore";
		char ch[] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	
	}
}
