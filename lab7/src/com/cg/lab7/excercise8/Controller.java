package com.cg.lab7.excercise8;
import java.util.*;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=new Scanner(System.in).nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=new Scanner(System.in).nextInt();
        }
        arr=new Excercise8().modifyArray(arr);
        for(int i:arr)
        {
        	System.out.println(i);
        }
	}

}
