package com.collections.LinkedList;

public class Student implements Comparable<Student>
{
   public String sName;   // this is custom datatype
   public int iId;
   
   public Student(String name, int id)
   {
	   this.sName = name;
	   this.iId = id;
			   
   }

@Override
public int compareTo(Student obj) 
{
	
	return this.iId - obj.iId;
}
}
