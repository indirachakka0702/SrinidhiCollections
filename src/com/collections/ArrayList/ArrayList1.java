package com.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args)
	{
		ArrayList<String>aList = new ArrayList<>();
		
		//List<String> aList = new ArrayList<>();
		// List<String> li = new List<String>(); // we can't declare like that due to it is interface
		aList.add("sri");
		aList.add("Nidhi");
		aList.add("Abhi");
		//System.out.println(aList);
		aList.add(null);
		aList.add("Vinod");
		aList.add(2,"kumar");  // adding element based on index
		aList.remove(0); // or aList.remove("sri");
		
		//System.out.println(aList);
		
		aList.set(2, "srinidhi");
		
		System.out.println(aList);
		System.out.println(aList.indexOf("srinidhi"));
		System.out.println(aList.size());
		System.out.println(aList.contains("srinidhi"));
		//System.out.println(aList);
		//aList.clear();
		aList.add("Anu");
		System.out.println(aList);
		Collections.sort(aList);
		System.out.println(aList);
		/*for(int i=0;i<aList.size();i++)
		{
			System.out.println(aList.get(i));
		}*/
		/*Iterator<String>It = aList.iterator();
		while(It.hasNext())
		{
			if(It.next().equals("srinidhi"))
				System.out.println("I Found");
			 System.out.println(It.next());
		}*/
	}
	/*
	 1. Add is used to add element to array. aList.add
	 2. aList.add(2,"kumar")
	 3. aList.remove to remove any value inside list 
	 4. By giving index we can also remove it- aList.remove
	 5. Set to update the element
	 */

}
