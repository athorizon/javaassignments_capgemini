package com.cg.lab5.exercise2;

public class Excercise2 {
	int a;
	Excercise2(int a)
	{
		this.a=a;
	}
	void nonRecursive()
	{
		System.out.println(0);
		int firstprevious=0,secondprevious=1;
		for(int i=0;i<=a-2;i++)
		{
			System.out.println(firstprevious+secondprevious);
			int temp=firstprevious;
			firstprevious+=secondprevious;
			secondprevious=temp;
		}
	}
	

}
