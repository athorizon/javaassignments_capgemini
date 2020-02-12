package com.cg.lab6.excericse10;

public class Excercise10 {

	boolean detail(String name)
	{
		String s1="job";
		int lastIndex=name.lastIndexOf('_');
		if(name.substring(lastIndex+1).equals(s1) && lastIndex>=8)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
