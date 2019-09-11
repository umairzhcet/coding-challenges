package com.umair.exercises;

public class Pyramids {

	public static void main(String[] args) {
		//pyramids(10);
		pyramidsRecursion(10,0,"");
	}

	private static void pyramidsRecursion(int num,int currentRow,String level) {
		int middle=(int) Math.floor((2*num-1)/2);
		if(num==currentRow) {
			return ;
		}
		if(level.length()==2*num-1) {
			System.out.println(level);
		    pyramidsRecursion(num,currentRow+1,"");
		    return;
		}
		if(level.length()>=middle-currentRow && level.length()<=middle+currentRow) {
			level+="#";
		}
		else {
			level+=" ";
		}
		pyramidsRecursion(num,currentRow,level);
		return ;
	}

	private static void pyramids(int num) {
		int middle=(int) Math.floor((2*num-1)/2);
		for(int i=0;i<num;i++) {
			String result="";
			for(int j=0;j<2*num-1;j++) {
				if((j>=middle-i && j<=middle+i)) {
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
