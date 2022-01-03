package com.java.string;

import java.util.Arrays;

public class ToString {

	public static void main(String[] args) {
		
		String str = "bangalore";
		char ch[] = str.toCharArray();
		System.out.println(Arrays.toString(ch));
		String asd = Arrays.toString(ch);
		
		System.out.println(asd);
	}
}
