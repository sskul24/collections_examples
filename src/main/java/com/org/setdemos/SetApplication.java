package com.org.setdemos;

import java.util.HashSet;
import java.util.Set;

public class SetApplication {

	public static void main(String[] args)
	{
		Family f1=new Family("Sneha", "Kulkarni", "Nanded");
		Family f2=new Family("Sneha", "Kulkarni", "Nanded");
		Family f3=new Family("Sneha", "Joshi", "Pune");
		Family f4=new Family("Ashish", "Joshi", "Pune");
		Family f5=new Family("Ashish", "Joshi", "Pune");

		Set<Family> set=new HashSet<Family>();
		set.add(f1);
		set.add(f2);
		set.add(f3);
		set.add(f4);
		set.add(f5);
		System.out.println(set.size());
		
		System.out.println(set);
		UseMe useMe=new UseMe();
		useMe.getNandedResidentialDetails(set);
		useMe.getPuneResidentialDetails(set);
		
		set.remove(f5);
		useMe.getNandedResidentialDetails(set);
		useMe.getPuneResidentialDetails(set);
			
	}
}
