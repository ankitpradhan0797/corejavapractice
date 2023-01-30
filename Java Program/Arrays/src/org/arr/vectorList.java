package org.arr;

import java.util.*;

public class vectorList {
	public static void main(String args[]){
		Vector<Integer> vect= new Vector<Integer>();

		vect.add(105);
		vect.add(205);
		vect.add(305);
		vect.add(405);
		vect.add(505);
		vect.add(605);
		vect.add(705);
		vect.add(805);

		System.out.println("Vector List: " + vect);
		System.out.println("Size: " + vect.size());
	}
}