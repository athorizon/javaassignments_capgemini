package com.cg.lab1.excercise2;

public class Excercise2 {
	int calculateDifference(int numberToCheck)
	{   //finding difference between sum of squares and the square of sum of all numbers
		int currentNumber=1;
		int sumOfSquares=0,sumOfNumbers=0;
		while(currentNumber<=numberToCheck)
		{
			sumOfSquares+=currentNumber*currentNumber;
			sumOfNumbers+=currentNumber;
			currentNumber+=1;
		}
		return sumOfSquares-(sumOfNumbers*sumOfNumbers);
	}

}
