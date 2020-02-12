package com.cg.lab7.excercise4;
import java.util.*;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String,Integer> getMap=new HashMap<String,Integer>();
        int n=new Scanner(System.in).nextInt();
        int i=0;
        while(i<n)
        {
        	System.out.println("enter the name of the student and his or her marks");
        	String name=new Scanner(System.in).nextLine();
        	int marks=new Scanner(System.in).nextInt();
        	getMap.put(name, marks);
        	i++;
        }
        //System.out.println(getMap);
        HashMap<String,String> takeMap=new Excercise4().getStudents(getMap);
        System.out.println(takeMap);
	}

}
