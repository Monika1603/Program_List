package com.text;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{

		String a = "keep";
		String b = "monu";
		
		char[] charArray1 = a.toCharArray();
		char[] charArray2 = b.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2))
		{
			System.out.println("This is a anagram");
		}
		else
		{
			System.out.println("This is not anagram");
		}
		
	}

}
