package org.com;

import java.util.ArrayList;

public class Length {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		System.out.println("list is:" + a);
		int len = a.size();
		System.out.println("length of the array:" + len);

	}

}
