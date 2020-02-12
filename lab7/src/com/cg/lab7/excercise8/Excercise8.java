package com.cg.lab7.excercise8;
import java.util.*;
public class Excercise8 {
	int[] modifyArray(int[] arr)
	{
		HashSet<Integer> getSet=new HashSet<Integer>();
		for(int i:arr)
		{
			getSet.add(i);
		}
		int[] returnArr=new int[getSet.size()];
		Iterator<Integer> i=getSet.iterator();
		int j=0;
		while(i.hasNext())
		{
			int value=i.next();
			returnArr[j]=value;
			j++;
		}
		return returnArr;
	}

}
