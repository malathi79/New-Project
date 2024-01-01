package org.com;

import java.util.ArrayList;
import java.util.List;

public class Loop1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		System.out.println("list is:"+li);
		for (Integer e : li) {
			System.out.println(e);
		}
		

}
}
