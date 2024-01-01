package org.com;

import java.util.ArrayList;
import java.util.List;

public class Adding {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		li.set(li.indexOf(300),350);
		System.out.println("after replacing:"+li);
		

}
}
