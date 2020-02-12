package com.cg.lab7.excercise6;

import java.util.*;
import java.time.*;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,LocalDate> getMap=new HashMap<String,LocalDate>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{   System.out.println("enter Id of the Voter and his date of birth repectively:");
		    
			System.out.println("year: ");int year=sc.nextInt();
			System.out.println("month: ");int month=sc.nextInt();
			System.out.println("day: ");int day=sc.nextInt();
			LocalDate now = LocalDate.now();
			System.out.println("Id:");
			String str=sc.next();
			getMap.put(str, LocalDate.of(year,month,day));
		}
		List<String> getList=new Excercise6().votersList(getMap);
		System.out.println(getList);
		  
	}

}
