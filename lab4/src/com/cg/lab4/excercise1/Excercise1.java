package com.cg.lab4.excercise1;

public class Excercise1 {
	int sumofCubeofNumber(int n)
	{
		String str=Integer.toString(n);
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			int num=Character.getNumericValue(str.charAt(i));
			sum+=(num*num*num);
		}
		return sum;
	}

}
