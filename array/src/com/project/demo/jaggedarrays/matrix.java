package com.project.demo.jaggedarrays;

public class matrix {
	public static void main(String[]args) {
		int number[][]=new int[3][];
		number[0]=new int[4];
		number[1]=new int[5];
		number[2]=new int[6];
		int count=10;
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
				number[i][j]=count;
				count+=10;
			}		
		
	}
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
				System.out.print(number[i][j]+"  ");

}
			System.out.println();
			}
		
		}}
		
