/**
 * 
 */
package com.cg.lab1.excercise1;

/**
 * @author kunal
 *to calculate the sum of first n natural numbers divisble by 3 or 5;
 */
public class Excercise1 {
	int calculateSum(int numberToCheck)
	{
		int currentNumber=1,sumOfDigits=0;
		while(currentNumber<=numberToCheck)
		{
			if(currentNumber%3==0||currentNumber%5==0)
			{
				sumOfDigits+=currentNumber;
			}
			currentNumber=currentNumber+1;
		}
		return sumOfDigits;
	}

}
