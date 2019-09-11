package com.umair.exercises;

public class Capitalization {

	public static void main(String[] args) {
		String capitalized = capitalize("This is my life");
		System.out.println(capitalized);

	}

	private static String capitalize(String string) {
		String[] words=string.split(" ");
		String result="";
		for(String word:words) {
			result+=word.substring(0,1).toUpperCase()+word.substring(1, word.length())+" ";
		}
		return result;
		
		
	}
	
	private static String capitalize2(String string) {
		String result="";
		char[] charArray=string.toCharArray();
		result=Character.toString(charArray[0]).toUpperCase();
		for(int i=1;i<charArray.length;i++) {
			if(charArray[i-1]==' ') {
				result+=Character.toString(charArray[i]).toUpperCase();
			}else {
				result+=Character.toString(charArray[i]);
			}
		}
		return result;
		
		
	}

}
