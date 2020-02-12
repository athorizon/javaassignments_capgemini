package com.cg.lab7.excercise1;
import java.util.*;

public class Excercise1 {
	List<Integer> getValues(Map<String,Integer> maap)
	{ 
		Collection<Integer> values=maap.values();
		List<Integer> returnList=new ArrayList<Integer>(values);
		Collections.sort(returnList);
		return returnList;
	}

}
