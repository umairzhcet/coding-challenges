package com.umair.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Anagrams {

	public static void main(String[] args) {
		//boolean result=isAnagram("hellos","hellos");
		boolean result=isAnagram2("fairy tales","rail safety.");
		System.out.println(result);

	}

	private static boolean isAnagram2(String str1, String str2) {
		str1=str1.replaceAll("\\W+","").toLowerCase();
		str2=str2.replaceAll("\\W+","").toLowerCase();
		System.out.println(str1);
		System.out.println(str2);
		str1=sortString(str1);
		str2=sortString(str2);
		if(str1.equals(str2))return true;
		return false;
	}

	private static String sortString(String str1) {
		char[] charArray = str1.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
		
	
	}

	private static boolean isAnagram(String str1, String str2) {
		
		str1=str1.replaceAll("\\W+","").toLowerCase();
		str2=str2.replaceAll("\\W+","").toLowerCase();
		System.out.println(str1);
		System.out.println(str2);
		HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
		HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
		for(char c:str1.toCharArray()) {
			if(map1.containsKey(c)) {
				map1.put(c, map1.get(c)+1);
			}
			else {
				map1.put(c,1);
			}
		}
		
		for(char c:str2.toCharArray()) {
			if(map2.containsKey(c)) {
				map2.put(c, map2.get(c)+1);
			}
			else {
				map2.put(c,1);
			}
		}
		System.out.println("Map1:"+map1);
		System.out.println("Map2:"+map2);
		if(str1.length()!=str2.length()) return false;
		for(Entry<Character, Integer> entry:map1.entrySet()) {
			char s=entry.getKey();
			Integer val=entry.getValue();
			if(!map2.containsKey(s) ||  map2.get(s)!=val) {
				return false;
			}
		}
		
		return true;
	}

}
