package org.com;

import java.util.ArrayList;
import java.util.List;

public class Adding1 {
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
		li.add(10);
		li.set(7, 90);
		System.out.println("after replacing:"+li);

}
}
