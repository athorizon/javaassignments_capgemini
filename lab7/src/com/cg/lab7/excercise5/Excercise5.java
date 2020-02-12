package com.cg.lab7.excercise5;
import java.util.*;
public class Excercise5 {
	int getSecondSmallest(int[] arr)
	{   ArrayList<Integer> sortArr=new ArrayList<Integer>();
		for(int i:arr)
		{
			sortArr.add(i);
		}
		Collections.sort(sortArr);
		return sortArr.get(1);
	}

}
