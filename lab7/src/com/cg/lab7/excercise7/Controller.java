package com.cg.lab7.excercise7;

import java.util.Random;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new Random().nextInt(n*3);//creating random numbers
			System.out.print(" "+arr[i]);
			
		}
		
        arr=new Excercise7().getSorted(arr);

        for(int i:arr)
        {  
        	System.out.print(" "+i);
        }
	}

}
