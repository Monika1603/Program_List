package com.text;

public class ReverseString {

	public static void main(String[] args)
	{
        String a="monu";
        String rev="";
        for(int i=a.length()-1;i>=0;i--)
        {
        	rev=rev+a.charAt(i);
        }
        System.out.println(rev);

	}


}
