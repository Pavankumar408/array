package com.project.demo.array2;


import java.util.Arrays;

public class numbers {
	public static void main(String[]args) {
		int numbers[]=new int[3];
		try {
			numbers[0]=25;
		numbers[1]=30;
		numbers[2]=40;
		numbers[3]=50;
			for(int i=0;i<5;i++) {
			System.out.println(numbers[i]);
		}}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("wrong input");
			
		}
		
		
		
		
		
	}

}
