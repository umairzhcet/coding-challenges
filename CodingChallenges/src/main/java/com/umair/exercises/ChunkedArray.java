package com.umair.exercises;

import java.util.ArrayList;

public class ChunkedArray {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8};
		chunk(arr,3);

	}

	private static ArrayList<ArrayList<Integer>> chunk(int[] arr, int i) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> chunked=new ArrayList<Integer>();
		for(Integer num:arr) {
			if(chunked.size()<i) {
				chunked.add(num);
			}
			else {
				list.add(chunked);
				chunked=new ArrayList<Integer>();
				chunked.add(num);
			}
		}
		list.add(chunked);
		System.out.println(list);
			return list;
	}

}
