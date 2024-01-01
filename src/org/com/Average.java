package org.com;

public class Average {
	public static void main(String[] args) {
		int[] a=new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("sum of array=="+sum);
		int average=sum/a.length;
		System.out.println("average of the array:"+average);
		
	}

}
