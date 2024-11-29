package com.text;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
       int n,c,rem,arm=0;
       System.out.println("Enter any no:");
       Scanner s = new Scanner(System.in);
       n = s.nextInt();
       c=n;
       while(n>0)
       {
    	   rem=n%10;
    	   arm=(rem*rem*rem)+arm;
           n=n/10;
           }
       if(c==arm)
       {
    	 System.out.println("Armstrong no");  
       }
       else
       {
    	   System.out.println("Not Armstrong no");
       }
       }
       

}
