package com.cg.lab3.excercise2;

import java.util.Arrays;

public class Excercise2 {
	String sortString(String str)
	{
		String up="";
		String lo="";
		int i=0;
		while(i<str.length())
		{
			if(Character.isUpperCase(str.charAt(i)))
				up+=str.charAt(i);
			else
				lo+=str.charAt(i);
			i++;
				
		}
		char c[]=up.toCharArray();
		Arrays.sort(c);
		str="";
		str+=new String(c);
		char ch[]=lo.toCharArray();
		Arrays.sort(ch);
		str+=new String(ch);
		return str;
	}

}
