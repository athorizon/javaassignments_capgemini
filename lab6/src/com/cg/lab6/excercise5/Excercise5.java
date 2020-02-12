package com.cg.lab6.excercise5;

public class Excercise5 {
	int modifyNumber(int num)
	{
		String str=Integer.toString(num);
		String rtnString="";
				int i=0;
				
		while(i<str.length()-1)
		{
			char first=str.charAt(i);
			char second=str.charAt(i+1);
			int sum=Character.getNumericValue(first)-Character.getNumericValue(second);
			sum=Math.abs(sum);
			rtnString+=""+sum;
			i++;
		}
		rtnString+=str.charAt(i);
		return Integer.parseInt(rtnString);
		
	}

}
