package com.project.demo.multi;

public class jagged {
	public static void main(String[]args) {
		int number[][]=new int[3][];
		number[0]=new int [4];
		number[1]=new int[6];
		number[2]=new int[8];
		int count=10;
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
				number[i][j]=count;
				count+=count;
				
			}
		}
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
				System.out.print(number[i][j]+"   ");
				
		
	}
			System.out.println();

}
}}