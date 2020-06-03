package com.collections.LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class entry {

	public static void main(String[] args)
	{
		LinkedList<Student> liStudent = new LinkedList<>();
		liStudent.add(new Student("Srinidhi",14));
		liStudent.add(new Student("Sri",5));
		// student class has custom datatypes means Name and ID
		// to this we adding/setting the values using LinkedList and method
		Iterator<Student>It = liStudent.iterator();
		while(It.hasNext())
		{
			Student temp = It.next();
			 System.out.println("I Found ID ::"+temp.iId+"\t Name ::"+ temp.sName);
		}
		Collections.sort(liStudent);
		Iterator<Student>It1 = liStudent.iterator();
		while(It1.hasNext())
		{
			Student temp = It1.next();
			 System.out.println("I Found ID ::"+temp.iId+"\t Name ::"+ temp.sName);
		}
		// re-usable method
		
	}

}
