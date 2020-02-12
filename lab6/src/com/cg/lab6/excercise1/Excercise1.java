package com.cg.lab6.excercise1;
import java.util.*;
public class Excercise1 {
	void getIntegers(StringTokenizer str)
	{   int sum=0;
		while(str.hasMoreTokens())
		{
			String strNum=str.nextToken();
			int num=Integer.parseInt(strNum);
			System.out.println(num);
			sum+=num;
		}
		System.out.println("The sum is :"+sum);
	}

}
