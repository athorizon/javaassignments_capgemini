package com.cg.lab7.excercise4;
import java.util.*;
public class Excercise4 {
 HashMap<String,String> getStudents(HashMap<String,Integer> maap)
 {
	 HashMap<String,String> returnMap=new HashMap<String,String>();
	 Set<String> setKeys=maap.keySet();
	// System.out.println(setKeys);
	 Iterator<String> i=setKeys.iterator();
	 while(i.hasNext())
	 {   String str=i.next();
	     //System.out.println("loop");
		 if(maap.get(str)>=90)
		 {  // System.out.println("90");
			 returnMap.put(str,"Gold");
		 }
		 else if(maap.get(str)>=80 && maap.get(str)<90)
		 {
			 //System.out.println("80");
			 returnMap.put(str,"Silver");
		 }
		 else if(maap.get(str)>=70 && maap.get(str)<80)
		 {
			 //System.out.println("60");
			 returnMap.put(str,"Bronze");
		 }
	 }
	 return returnMap;
 }
}
