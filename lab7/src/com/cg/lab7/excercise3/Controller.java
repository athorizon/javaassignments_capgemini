package com.cg.lab7.excercise3;

import java.util.Map;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;int n=new Scanner(System.in).nextInt();
		int[] intArray=new int[n];
		while(i<n)
		{
			intArray[i]=new Scanner(System.in).nextInt();
			i++;
		}
		Excercise3 object=new Excercise3();
		Map<Integer,Integer> takeMap=object.getSquares(intArray);
		System.out.println(takeMap);
	}

}
