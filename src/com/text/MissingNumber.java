package com.text;

import java.util.Iterator;

public class MissingNumber {

	public static void main(String[] args)
	{
       int A[] = {1,2,3,4,5,7,8};
       int x = A.length+1;
       int total_sum=x*(x+1)/2;
       int sum = 0;
       for(int i=0;i<A.length;i++)
       {
    	   sum=sum+A[i];
       }
       System.out.println("Missing number :"+(total_sum-sum));
	}

}
