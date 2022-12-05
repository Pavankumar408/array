package com.project.jagged;

public class matrix {
	public static void main(String[]args) {
		int numbers[][]=new int[3][];
		numbers[0]=new int[3];
		numbers[1]=new int[4];
		numbers[2]=new int[5];
		int count=10;
	for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
           numbers[i][j]=count;
           count+=10;
          }}
	for(int i=0;i<numbers.length;i++) {
		for(int j=0;j<numbers[i].length;j++) {
			System.out.print(numbers[i][j]+"   ");
			
		}
		System.out.println();
	}
	
	
	}}