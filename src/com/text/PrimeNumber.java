package com.text;

public class PrimeNumber {

	public static void main(String[] args)
	{
       int no = 1;
       boolean isPrime = true;
       for(int i=2;i<=no/2;i++)
       {
    	   if(no%i==0)
    	   {
    		   isPrime = false;
    		   break;
    	   }
       }
       if(isPrime && no>1)
       {
    	   System.out.println(no +"is a prime no");
       }
       else
       {
    	   System.out.println(no +"is not a prime no");
       }
       }
	}


