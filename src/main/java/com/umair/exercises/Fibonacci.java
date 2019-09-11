package com.umair.exercises;

import java.util.Date;

public class Fibonacci {

	public static void main(String[] args) {
		//
		long timeStart=System.currentTimeMillis();
		//int result=getFibonacciRecursion(30);
		int result=getFibonacci(30);
		long timeEnd=System.currentTimeMillis();
		System.out.println(result+ ": Completed in "+ (timeEnd-timeStart)+" millisecs");
	}

	private static int getFibonacciRecursion(int i) {
		if(i<2) {
			return i;
		}
		else {
			return getFibonacciRecursion(i-1)+getFibonacciRecursion(i-2);
		}
		
	}

	private static int getFibonacci(int num) {
	int[] arr=new int[num+1];
	arr[0]=0;
	arr[1]=1;
	for(int i=2;i<=num;i++) {
		arr[i]=arr[i-1]+arr[i-2];
	}
	for(int k:arr) {
		System.out.print(k+" ");
		
	}
	System.out.println();
		return arr[num];
	}

}
