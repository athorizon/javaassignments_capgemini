package com.cg.lab5.exercise3;

import java.util.Scanner;

public class Excercise3 {
	public void prime()
	{
	int i,m=0,flag=0;  
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	  m=n/2;      
	   for(int j=2;j<=n;j++) 
	   {
	   for(i=2;i<=m;i++)
	   {      
	    if(i%j==0)
	    {  
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  
	   { System.out.println(i); 
	     flag=0;
	   } 
	   }
	  } 
}
