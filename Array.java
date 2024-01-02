package org.sample;

import java.util.Scanner;

public class Array{
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter 10 values:");
	int[] a = new int[10];
	for (int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	
	}
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum+=a[i];
	}
	System.out.println("Sum of the array:"+sum);
	System.out.println("Hi iam developer");
	System.out.println("I Have Worked In Development Branch");

}
}
