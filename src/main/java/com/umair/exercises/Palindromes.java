package com.umair.exercises;

public class Palindromes {

	public static void main(String[] args) {
		String str="madam";
		if(reverseString(str).equals(str)) {
			System.out.println("Is a Palindrome");
		}
		else {
			System.out.println("Is not a Palindrome");
		}

	}
	
	private static String reverseString(String string) {
		String result="";
		for(char chr:string.toCharArray()) {
			result=chr+result;			
		}
		return result;
	}

}
