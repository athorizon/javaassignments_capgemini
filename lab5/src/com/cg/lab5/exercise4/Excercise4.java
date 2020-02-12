package com.cg.lab5.exercise4;
import com.cg.eis.exception.*;
import java.util.*;

public class Excercise4 {
	void getName()
	{
	    String firstname,lastname;
		firstname=new Scanner(System.in).nextLine();
		lastname=new Scanner(System.in).nextLine();
		try
		{
			if(firstname.isEmpty()||lastname.isEmpty())
			throw new MyException("the first name or last name are either null or wrong");
			else
			System.out.println(firstname+" "+lastname);
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}

}
