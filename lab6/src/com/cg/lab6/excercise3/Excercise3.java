package com.cg.lab6.excercise3;

public class Excercise3 {
	String getImage(StringBuffer str)
	{   String strNew=str.toString();
		str.reverse();
		String str1New=str.toString();
		strNew=strNew+"|"+str1New;
		return strNew;
	}

}
