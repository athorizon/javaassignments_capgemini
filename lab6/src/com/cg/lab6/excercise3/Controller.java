package com.cg.lab6.excercise3;
import java.util.*;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(("enter string "));
        String str=new Scanner(System.in).nextLine();
        System.out.println(new Excercise3().getImage(new StringBuffer(str)));
	}

}
