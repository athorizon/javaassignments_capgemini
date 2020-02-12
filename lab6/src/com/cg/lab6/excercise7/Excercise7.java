package com.cg.lab6.excercise7;
import java.util.*;
import java.io.*;
public class Excercise7 {
     void fileDeatils()
     {
    	 Scanner sc=new Scanner(System.in);
    		String s=sc.nextLine();
    		File f1=new File(s);
    		System.out.println("This file is:"+(f1.exists()?"Exists":"Does not exists"));
    		System.out.println("File Name is "+f1.getName());
    		System.out.println("Is readable "+f1.canRead());
    		System.out.println("Is writable "+f1.canWrite());
    		int lastIndex=s.lastIndexOf(".");
    		System.out.println("Type of file "+s.substring(lastIndex+1));
    		System.out.println("Path is "+f1.getAbsolutePath());
    		System.out.println("File length is "+f1.length()+" in Bytes");
     }
}

