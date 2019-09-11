package com.umair.exercises;

public class Steps {

	public static void main(String[] args) {
		printSteps(10);
		System.out.println("2nd Method");
		printStepsRecursion(10,0,"");

	}

	private static void printStepsRecursion(int number, int currentRow, String stairs) {
		if(number==currentRow) {
			return;
		}
		
		if(number==stairs.length()) {
			System.out.println(stairs);
		    printStepsRecursion(number,currentRow+1,"");
		    return;
		}
	
		if(stairs.length()<=currentRow) {
				stairs+="#";
			}
			else {
				stairs+=" ";
			}
		
			printStepsRecursion(number,currentRow,stairs);
			return;
	}

	private static void printSteps(int num) {
		
		for(int i=1;i<=num;i++) {
			String result="";
			for(int j=1;j<=num;j++) {
				if(j<=i) {
					result+="#";
				}
				else {
					result+=" ";
				}
				
			}
			System.out.println(result);
		}
		
	}

}
