package com.cg.lab7.excercise2;
import java.util.*;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;int n=new Scanner(System.in).nextInt();
		char[]charArray=new char[n];
		while(i<n)
		{
			charArray[i]=new Scanner(System.in).next().charAt(0);
			i++;
		}
		Excercise2 object=new Excercise2();
		Map<Character,Integer> takeMap=object.countCharacter(charArray);
		System.out.println(takeMap);
		
		/*System.out.println("enter String to count characters");
		String str=new Scanner(System.in).nextLine();
		takeMap=object.countStringCharacter(str);
		System.out.println(takeMap);*/
	}

}
