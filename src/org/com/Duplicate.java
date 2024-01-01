package org.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Duplicate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=s.nextInt();
		List<Integer> li= new ArrayList<>();
		Set<Integer> si= new TreeSet<>();
		System.out.println("enter the elements into array:");
		for (int i = 0; i < size; i++) {
			li.add(s.nextInt());
		}
		System.out.println("array entered is:");
		System.out.println(li);
		si.addAll(li);
		System.out.println("array after duplicates removed:");
		System.out.println(si);
	}

}
