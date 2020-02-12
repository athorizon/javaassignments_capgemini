package com.cg.lab6.excercise2;
import java.util.*;
import java.io.*;
public class Excercise2 
{
	void readWriteFile()throws FileNotFoundException,IOException
	{
		 int j=1;
	     char ch;
	     Scanner scr=new Scanner(System.in);
	     System.out.println("enter file name");
	     String str=scr.next();
	     FileInputStream f=new FileInputStream(str);
	     System.out.println("\nContents of the file are");
	     int n=f.available();
	     System.out.print(j+": ");
	     for(int i=0;i<n;i++)
	     {
	                 ch=(char)f.read();
	                 System.out.print(ch);
	                 if(ch=='\n')
	                 {
	                             System.out.print(++j+": ");
	                            
	                 }
	                            
	     }
	}
}

