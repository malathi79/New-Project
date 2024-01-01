package org.com;

import java.util.ArrayList;
import java.util.List;

public class Value {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.remove(2);
    System.out.println("value removed:"+li);

}
}
