package com.umair.exercises;

public class IntegerReversal {

	public static void main(String[] args) {
		Integer number=reverseMethod(-140);
		System.out.println(number);

	}

	private static Integer reverseMethod(int i) {
		Integer reversed=0;
		while(i!=0) {
			reversed=reversed*10+i%10;
			i=i/10;
		}
		return reversed;
	}

}
