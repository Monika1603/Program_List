package com.text;

public class Palindrome {

	public static void main(String[] args) 
	{
      String s = "monu";
      String rev = "";
      for(int i=s.length()-1;i>=0;i--)
      {
    	 rev=rev+s.charAt(i);
      }
      System.out.println(rev);
      if(s.equals(rev))
      {
    	  System.out.println("This is a palindrome");
      }
      else
      {
		System.out.println("This is not a palindrome");
	}
	}

}
