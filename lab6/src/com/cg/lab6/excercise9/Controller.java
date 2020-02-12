package com.cg.lab6.excercise9;

import java.time.LocalDate;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("year: ");int year=sc.nextInt();
		  System.out.println("month: ");int month=sc.nextInt();
		  System.out.println("day: ");int day=sc.nextInt();
		   new Excercise9().acceptDate(LocalDate.of(year,month,day));
	}

}
