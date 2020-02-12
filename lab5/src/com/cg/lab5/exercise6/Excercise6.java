package com.cg.lab5.exercise6;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Excercise6 {
	void getSalary()
	{
		int salary;
		Scanner sc=new Scanner(System.in);
		salary=sc.nextInt();
		try
		{   double b=17.555;
		    int a=(int)b;
			if(salary<3000)
			{
				throw new EmployeeException("the salary is below 3000");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}
}



