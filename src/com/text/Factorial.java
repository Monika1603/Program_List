package com.text;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
       int fact = 1;
       System.out.println("Enter any no:");
       Scanner s = new Scanner(System.in);
       int nextInt = s.nextInt();
       for(int i=1;i<=nextInt;i++)
       {
    	   fact=fact*i;
       }
       
       System.out.println("factorial : "+fact);
       
	}

}
