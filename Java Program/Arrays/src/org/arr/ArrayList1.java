package org.arr;

import java.util.ArrayList;

public class ArrayList1  {
	public static void main(String[] args) {
		
	   ArrayList <Integer> a1 = new ArrayList<Integer>();
	   a1.add(10);
   	   a1.add(20);
   	   a1.add(30);
	   a1.add(90);
	   a1.add(10);
	   a1.add(10);
	   a1.add(40);
	   a1.add(50);
	
	   for (Integer a2 : a1) {
		   System.out.println(a2);	
	   }
	  int size = a1.size();
	  System.out.println("Size of arraylist= " +size);
    }
}