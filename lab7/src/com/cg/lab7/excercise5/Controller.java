package com.cg.lab7.excercise5;
import java.util.*;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new Random().nextInt(n*3);//creating random numbers
			System.out.print(" "+arr[i]+" ");
			
		}System.out.println();
		System.out.println(new Excercise5().getSecondSmallest(arr));
        
	}

}
