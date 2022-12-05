package com.project.demo.multi;

public class matrix {
	public static void main(String[]args) {
		int array[][]=new  int [3][3];
		int count=10;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				array[i][j]=count;
				count=count+10;
				
				
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.print(array[i][j]+"   ");
		
				
	}
			System.out.println();

}}}
