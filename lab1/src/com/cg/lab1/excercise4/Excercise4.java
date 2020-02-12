package com.cg.lab1.excercise4;

public class Excercise4 {
	boolean checkNumber(int numberToCheck)
	 {
		 for(int currentNumber=2;currentNumber<=numberToCheck;currentNumber*=2)
		 {
			 if(currentNumber==numberToCheck)
				 return true;
		 }
		 return false;
	 }

}
