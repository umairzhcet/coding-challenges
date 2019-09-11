package com.umair.exercises;

public class ReverseString {

	public static void main(String[] args) {
		String result=reverseString("Hello Umair");
		System.out.println(result);

	}

	private static String reverseString(String string) {
		String result="";
		for(char chr:string.toCharArray()) {
			result=chr+result;			
		}
		return result;
	}

}
