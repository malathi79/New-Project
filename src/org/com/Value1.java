package org.com;

import java.util.ArrayList;
import java.util.List;

public class Value1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(10);
		li.remove(10);
    System.out.println("value removed:"+li);


}
}
