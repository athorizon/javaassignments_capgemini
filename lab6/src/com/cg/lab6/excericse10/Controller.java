package com.cg.lab6.excericse10;
import java.util.*;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter the username");
        System.out.println("please note that the username must be 8 characters long and end with _job after your username");
        String name=new Scanner(System.in).nextLine();
        System.out.println(new Excercise10().detail(name));
	}

}
