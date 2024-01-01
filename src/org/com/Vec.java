package org.com;


import java.util.Vector;

public class Vec {
	public static void main(String[] args) {
		Vector<Integer>li=new Vector<>();
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		System.out.println("list is:"+li);
		int len=li.size();
		System.out.println("length of the values:"+len);
	}

}
