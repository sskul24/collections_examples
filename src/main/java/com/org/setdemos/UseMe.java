package com.org.setdemos;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class UseMe {

	public void getNandedResidentialDetails(Set<Family> set)
	{
		Iterator<Family>itr=set.iterator();
		while(itr.hasNext())
		{   Family fm=itr.next();
			if(fm.getAddress().equals("Nanded"))
			{
				System.out.println("Nanded Residential Details: "+ fm);
			}
			
		}
		
	}
	
	public void getPuneResidentialDetails(Set<Family> set)
	{
		Iterator<Family> itr=set.iterator();
		while(itr.hasNext())
		{
			Family fm=itr.next();
			if(fm.getAddress().contains("Pune"))
			{
				System.out.println("Pune Residential Details: "+ fm);
			}
		}
	}
}
