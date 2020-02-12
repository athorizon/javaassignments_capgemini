package com.cg.lab7.excercise7;
import java.util.*;
public class Excercise7 {
	int[] getSorted(int[] arr)
	{   int i=0;
		while(i<arr.length)
		{   
			StringBuilder str=new StringBuilder(Integer.toString(arr[i]));
			str.reverse();
			arr[i]=Integer.valueOf(str.toString());
			i++;
		}
		Arrays.sort(arr);
		return arr;
	}

}
