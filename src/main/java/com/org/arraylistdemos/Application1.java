package com.org.arraylistdemos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Application1 {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family f1=new Family("Sneha","kulkarni","Nanded");	
		Family f2=new Family("Swapnil","kulkarni","Nanded");	
		Family f3=new Family("Ashish","Joshi","Udgir");	
		Family f4=new Family("Ashwini","Choudhari","Osmanabad");	
		Family f5=new Family("Archana","kulkarni","Solapur");	
		
		List<Family> list=new ArrayList<Family>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		
	/* to create unmodifible list,set,map use this
	 * 
	 * final List<String> daylist=new ArrayList<>();
		daylist.add("Sunday");daylist.add("Monday"); daylist.add("Tuesday");  daylist.add("Wensday");
		List<String> final_list =Collections.unmodifiable(daylist);
		
		final_list.add("Thrusday");
		System.out.println("Week Day list: "+final_list);*/
		
		List<String> daylist=new ArrayList<String>();
		daylist.add("Sunday");daylist.add("Monday"); daylist.add("Tuesday");  daylist.add("Wensday");
		Set<String> setlist = new HashSet<String>(daylist);
		System.out.println(setlist);
		for(String str:setlist){
			System.out.println(str);
		}
		
		
		UseMe useMe=new UseMe();
		useMe.getNandedResidentialDetails(list);
		useMe.getUdgirResidentialDetails(list);
		useMe.getOsmanabadResidentialDetails(list);
		useMe.getSolapurResidentialDetails(list);
	}

}
