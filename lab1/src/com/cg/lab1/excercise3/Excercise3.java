package com.cg.lab1.excercise3;

import java.util.ArrayList;

public class Excercise3 {
	boolean checkNumber(int n)
	{   //to check wheater a number is in increasing order or not
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int m;
		while(n>0)
		{
		m=n%10;
		arr.add(m);
		n=n/10;
		}
		int sz;
		sz=arr.size();
		for(int i=1;i<sz;i++)
		{
		  if(arr.get(i-1)<arr.get(i))
		  return false;
		}
		return true;
	}
}
