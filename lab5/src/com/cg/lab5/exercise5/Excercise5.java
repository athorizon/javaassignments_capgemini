package com.cg.lab5.exercise5;

import java.util.Scanner;

import com.cg.eis.exception.*;

public class Excercise5 {
	void getAge()
	{
		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		try
		{
			if(age<=15)
			{
				throw new MyException("the age is below 15");
			}
		}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}
}


