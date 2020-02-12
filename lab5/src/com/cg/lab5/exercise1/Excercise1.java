package com.cg.lab5.exercise1;
import java.util.*;
public class Excercise1 {
	void choiceRedLight() {
	System.out.println("1: Red");
	System.out.println("2: Yellow");
	System.out.println("3: Green");
	int input=new Scanner(System.in).nextInt();
	switch(input)
	{
	case 1: System.out.println("STOP");
	        break;
	case 2: System.out.println("WAIT");
	        break;
	case 3: System.out.println("GO");
	        break;
	default: System.out.println("Wrong Input");
	}
}
}
