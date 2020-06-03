package com.collections.Hashmap;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hm = new HashMap<>(); // not in same order we enter
	    hm.put(10, "B");
		hm.put(15, "A");
		hm.put(18, "E");
		hm.put(14, "C");
      System.out.println(hm);
     // hm.remove(15);
      System.out.println(hm);
      hm.put(14,"Z");
      System.out.println(hm);
      hm.put(16,"A");
      System.out.println(hm);
     // hm.clear();
      System.out.println(hm);
      HashMap<Integer,String>hsri = new HashMap<>();
      System.out.println("hsri=="+hsri);
      hsri.putAll(hm);
      System.out.println("hsri == "+hsri);
      HashMap<Integer,String>mapClone= new HashMap<>();
      System.out.println("mapClone == "+mapClone);
      mapClone = (HashMap<Integer,String>)hsri.clone();
      System.out.println("mapClone == "+mapClone);
   // HashMap is an unordered list
    // HashMap by using hm.put you can add an key value pair  
      // key value pair.Duplication is not possible. if you add same key it will overrite existing value
      //
      
	}

}
