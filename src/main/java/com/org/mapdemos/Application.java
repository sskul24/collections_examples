package com.org.mapdemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Application {
public static void main(String[] args)
{
	//Creating Objects of Family
	Family f1=new Family("Ashish", "Joshi");
	Family f2=new Family("sneha","Kulkarni");
	
	
	// Creating Map of Family
	 Map<Integer,Family> map=new HashMap<Integer,Family>();

	//Adding objects in Map
	map.put(1, f1);
	map.put(2, f2);
	
	//Returns set view of Map
	Set<Entry<Integer, Family>> set=map.entrySet();
	System.out.println(set);
	
	//Iterate the set
	
	Iterator itr=set.iterator();
	while(itr.hasNext())
	{
		Map.Entry entry=(Map.Entry)itr.next();
		
		//Get Keys and Values
		System.out.println("key:" +entry.getKey() + "," + "Value:" +entry.getValue());
	}
	
	//Returns Set of Keys contained in Map
	Set<Integer> s=map.keySet();
    System.out.println(s);
	
	//Returns Collection view of Values contained in Map
	Collection<Family> c=map.values();
	System.out.println(c);
	
	//Returns True if given Key contains in Map else False
	boolean b=map.containsKey(2);
	boolean b1=map.containsKey(3);	
	System.out.println(b);
	System.out.println(b1);
	
	//Returns True if given Value contains in Map else False
	boolean b2=map.containsValue(f2);
	System.out.println(b2);
	
	//Returns the Value of given Key if Key Present
	System.out.println(map.get(2)); 
	
	//remove entry of key 2
	map.remove(2);
	
	//Returns null the Value of given Key if it is not present
	System.out.println(map.get(2)); 

	//To remove all entries
	map.clear();
	
	//Print map
	System.out.println(map);
	
	
	
		
	}
	
}

    
	

	




