package com.cg.lab7.excercise6;
import java.time.*;
import java.util.*;
public class Excercise6 {
	List votersList(HashMap<String,LocalDate> maap)
	{
		List<String> returnList=new ArrayList<String>();
		Set entrySet=maap.keySet();
		Iterator<String> it=entrySet.iterator();
		while(it.hasNext())
		{
			String str=it.next();
			LocalDate checkDate=maap.get(str);
			 Period diff = Period.between(checkDate,LocalDate.now());
		     int a=diff.getYears();
		     if(a>=18)
		     {
		    	 returnList.add(str);
		     }
		}
		return returnList;
	}
	

}