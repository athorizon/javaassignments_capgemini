package com.cg.lab6.excercise9;
import java.time.*;
import java.util.*;

public class Excercise9 {
	void acceptDate(LocalDate pdate)
	{
		
	     LocalDate now = LocalDate.now();

	     Period diff = Period.between(pdate,now );
	     int a=diff.getYears();
	     int b=diff.getMonths();
	     int c=diff.getDays();
	     System.out.println("Difference is "+a+" Years "+b+" Months "+c+" Days ");
	}
}
