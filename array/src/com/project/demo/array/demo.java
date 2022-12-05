package com.project.demo.array;

public class demo {
	public static void main(String[]args) {
		int number []=new int[5];
		try {
			number[0]=77;
			number[1]=88;
			number[2]=66;
			number[3]=34;
			number[4]=56;
			number[5]=34;
			for(int i=0;i<5;i++) {
		System.out.println(number[i]);
		}}
		catch(ArrayIndexOutOfBoundsException ae) {
			
			System.out.println("wrong input");
		}
	
	
	}
	
	}	


