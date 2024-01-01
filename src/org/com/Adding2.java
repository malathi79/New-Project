package org.com;

import java.util.ArrayList;
import java.util.List;

public class Adding2 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(30);
		System.out.println(li);
		for (int i = 0; i < li.size(); i++) {
			if (li.get(i)==10) {
			li.set(i, 100);	
			}
		}
		System.out.println("after replacing value:");
		System.out.println(li);
		
}
}



