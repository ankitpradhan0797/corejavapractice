package org.arr;

import java.util.LinkedList;

public class linkedList {
	public static void main(String args[]){
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);

		System.out.println("LinkedList:" + list);
		System.out.println("Size: " + list.size());
	}
}