package com.text;

public class MinMaxNum {

	public static void main(String[] args)
	{
		int a[] = {2,3,4,5,6,7,8,9};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max +"is max no");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min +"is min no");
	}

}
