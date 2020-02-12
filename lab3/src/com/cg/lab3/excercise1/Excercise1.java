package com.cg.lab3.excercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise1 {
	int arr[]=new int[5];
	void getValues() 
	{
      Scanner sc= new Scanner(System.in);
      for(int i=0;i<arr.length;i++)
      {
    	arr[i]=sc.nextInt();
      }
    }
	int getSecondSmallest()
	{
      Arrays.sort(arr);
      return arr[1];
    }

}
