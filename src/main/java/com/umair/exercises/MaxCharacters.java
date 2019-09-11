package com.umair.exercises;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaxCharacters {

	public static void main(String[] args) {
		String str="Helloo There.How are you?";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:str.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		System.out.println(map);
		Integer max=0;
		Character maxChar=' ';
		for(Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				maxChar=entry.getKey();
			}
		}
		System.out.println("Maximum Char is:"+maxChar+ " Max number is:"+max);
	}

}
