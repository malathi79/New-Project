package org.com;

import java.util.ArrayList;
import java.util.List;

public class Value2 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		System.out.println(li);
		li.remove(li.lastIndexOf(10));
    System.out.println("last index of 10:"+li);


}
}
