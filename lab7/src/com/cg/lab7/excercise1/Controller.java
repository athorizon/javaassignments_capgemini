package com.cg.lab7.excercise1;

import java.util.*;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
	    int n=new Scanner(System.in).nextInt();
	    Map<String,Integer> maap=new HashMap<String,Integer>();
		while(i<n)
		{
			System.out.println("enter key(string) and value associated value(integer)");
			
			String key=new Scanner(System.in).nextLine();int value=new Scanner(System.in).nextInt();
			maap.put(key, value);
			i++;
		}
		Excercise1 object=new Excercise1();
		List<Integer> takeList=object.getValues(maap);
		System.out.println(takeList);

	}

}
