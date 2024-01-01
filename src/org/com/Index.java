package org.com;

import java.util.ArrayList;
import java.util.List;

public class Index {
	public static void main(String[] args) {
		List<Integer>li= new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		System.out.println("first index of 10:"+li.indexOf(10));
	}

}
