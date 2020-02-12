package com.cg.lab3.excercise3;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Excercise3 ob=new Excercise3();
		int arr[]=new int[5];
		arr[0]=21;
		arr[1]=72;
		arr[2]=872;
		arr[3]=81;
		arr[4]=9;
		arr=ob.getSorted(arr);
		ob.displayArray(arr);
	}

}
