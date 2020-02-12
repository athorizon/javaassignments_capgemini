package com.cg.lab6.excercise8;

public class Excercise8 {
	boolean isPositiveString(String s) 
	{
		int n=s.length();
		char arr[]= s.toCharArray();
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
				return false;
				
		}
		return true;
	}

}
