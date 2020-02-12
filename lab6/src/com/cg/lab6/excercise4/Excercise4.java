package com.cg.lab6.excercise4;

public class Excercise4 {
	String alterString(String str)
	{   String  rtnString="";
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			char ch=str.charAt(i);
			if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'&&ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
			{  int j=ch+1;
			ch=(char)j;
				rtnString+=Character.toString(ch);
			}
			else
				rtnString+=ch;
		}
		return rtnString;
	}
}
