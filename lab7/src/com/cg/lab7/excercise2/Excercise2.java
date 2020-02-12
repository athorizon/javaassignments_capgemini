package com.cg.lab7.excercise2;
import java.util.*;
public class Excercise2 {
	Map<Character,Integer> countCharacter(char[] charArray)
	{   Map<Character,Integer> map1=new HashMap<Character,Integer>();
		for(char i:charArray)
		{
			if(map1.containsKey(i))
			{
				map1.put(i,map1.get(i)+1);
			}
			else
				map1.put(i,1);
		}
		return (Map)map1;
	}
	Map<Character,Integer> countStringCharacter(String str)
	{   Map<Character,Integer> map1=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(map1.containsKey(str.charAt(i)))
			{
				map1.put(str.charAt(i),map1.get(str.charAt(i))+1);
			}
			else
				map1.put(str.charAt(0),1);
		}
		return (Map)map1;
	}

}
