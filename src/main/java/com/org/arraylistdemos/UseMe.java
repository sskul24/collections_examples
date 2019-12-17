package com.org.arraylistdemos;
import java.util.Iterator;
import java.util.List;


public class UseMe {

	public void getNandedResidentialDetails(List<Family> families)
	{
		Iterator<Family>itr=families.iterator();
		while(itr.hasNext())
		{
			if((itr.next().getAddress()).equalsIgnoreCase("Nanded"))
					{
						System.out.println("Nanded Residentials: " + itr.next());
					}			
		}
		
	}
	
	public void getUdgirResidentialDetails(List<Family> families)
	{
		Iterator<Family>itr=families.iterator();
		while(itr.hasNext())
		{
			Family fm = itr.next();
			if((fm.getAddress()).equalsIgnoreCase("Udgir"))
					{
						System.out.println("Udgir Residentials: " + fm);
					}			
		}
		
	}
	
	public  void getSolapurResidentialDetails(List<Family> families)
	{
		Iterator<Family>itr=families.iterator();
		while(itr.hasNext())
		{
			Family fm = itr.next();
			if((fm.getAddress()).equalsIgnoreCase("Solapur"))
			{
				System.out.println("Solapur Residentials: " + fm);
			}			
		}
		
	}
	public  void getOsmanabadResidentialDetails(List<Family> families)
	{
		Iterator<Family>itr=families.iterator();
		while(itr.hasNext())
		{
			Family fm = itr.next();
			if((fm.getAddress()).equalsIgnoreCase("Osmanabad"))
			{
				System.out.println("Osmanabad Residentials: " + fm);
			}			
		}
		
	}
}
