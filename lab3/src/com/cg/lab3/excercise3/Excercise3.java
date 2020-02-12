package com.cg.lab3.excercise3;

import java.util.Arrays;

public class Excercise3 {
	int[] getSorted(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{   if(arr[i]>10) {
			int temp=arr[i];
			int n;
			int num=0;
			while(temp>0)
			{
				n=temp%10;
				num=(num*10)+n;
				temp/=10;
			}
			arr[i]=num;
			}
		}
		Arrays.sort(arr);
		return arr;
	}
	void displayArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
