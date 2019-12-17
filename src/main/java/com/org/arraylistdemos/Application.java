package com.org.arraylistdemos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class Application {

	
	public static void main(String[] args) {
		
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
		list.add(f5);
		
		
		/*----Check ArrayList Size----*/
		System.out.println("Size Of ArrayList is : " + list.size());
		
		/*----Iteration using Iterator---*/
		 Iterator it=list.iterator();
		 while(it.hasNext())
		 {
			 Family info=(Family)it.next();
			 //	 System.out.println("Family Details are:" +info);
			 if(info.getAddress().equals("Pune"))
			 {
				 System.out.println("Pune Residential Information: " + info);
			 }
			 else if(info.getAddress().equals("Nanded"))
			 {
				 System.out.println("Nanded Residential Information: " + info);
			 }
			 else if(info.getAddress().equals("Udgir"))
			 {
				 System.out.println("Udgir Residential Information: " + info);
			 }
			 else if(info.getAddress().equals("Solapur"))
			 {
				 System.out.println("Solapur Residential Information: " + info);
			 }
			 
             else
			 {
				 System.out.println("No Such Information Found");
			 }
		 }
		
		 /*----Iteration using for Loop---*/
		 
		 for(int i=1;i<list.size();i++)
		 {
			 
			// System.out.println("Family Details are:" +list.get(i));
			 if(((Family)list.get(i)).getAddress().equals("Solapur"))
			 {
				 System.out.println("Solapur Residential Information: " + list.get(i));
			 }
			 
			
		 }
		 
		 /*----Iteration using foreach Loop---*/
		 
		 for(Object object:list)
		 {
			 Family fm=(Family)object;
			// System.out.println("Family Details are:"+ object);
			 if(fm.getAddress().equals("Osmanabad"))
			 {
				 System.out.println("Osmanabad Residential Information: " + fm);
				
			 }
			 list.add(new Family("Demo","Demo","Demo"));
		 }
		 

		
	}

}
