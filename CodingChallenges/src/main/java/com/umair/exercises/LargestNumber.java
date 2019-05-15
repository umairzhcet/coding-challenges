package com.umair.exercises;

public class LargestNumber {

	public static void main(String[] args) {
		String[] input= {"9","38","40","3"};
       String result=largestNumber(input);
       System.out.println(Integer.parseInt(result));
	}

	private static String largestNumber(String[] input) {
		String result="";
		for(int i=0;i<input.length-1;i++) {
			if(Integer.parseInt(input[i]+input[i+1])<Integer.parseInt(input[i+1]+input[i])) {
				String temp=input[i];
				input[i]=input[i+1];
				input[i+1]=temp;
			}
		}
		for(String s:input)
		result+=s;
		return result;
	}

}
