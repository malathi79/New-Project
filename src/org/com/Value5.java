package org.com;

import java.util.ArrayList;
import java.util.List;

public class Value5 {
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
		li.add(8, 80);
	System.out.println("after adding 80:"+li);

}
}
