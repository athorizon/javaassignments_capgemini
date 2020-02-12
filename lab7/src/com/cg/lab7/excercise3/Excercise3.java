package com.cg.lab7.excercise3;

import java.util.*;

public class Excercise3 {
	Map<Integer,Integer> getSquares(int[] intArray)
	{   Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
		for(int i:intArray)
		{
				map1.put(i,i*i);
		}
		return (Map)map1;
	}

}
