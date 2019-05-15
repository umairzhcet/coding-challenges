package com.umair.exercises;

import java.util.Arrays;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] arr=spiral(6);

        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));

	}

	private static int[][] spiral(int n) {
		int startRow=0;
		int startColumn=0;
		int endRow=n-1;
		int endColumn=n-1;
		int result[][]=new int[n][n];
		int counter=1;
		while(endRow>=startRow && startColumn<=endColumn) {
			for(int i=startColumn;i<=endColumn;i++) {
				result[startRow][i]=counter++;
			}
			startRow++;
			for(int j=startRow;j<=endRow;j++) {
				result[j][endColumn]=counter++;
			}
			endColumn--;
			
			for(int i=endColumn;i>=startColumn;i--) {
				result[endRow][i]=counter++;
			}
			endRow--;
			for(int j=endRow;j>=startRow;j--) {
				result[j][startColumn]=counter++;
			}
			startColumn++;
		}
		return result;
	}

}
