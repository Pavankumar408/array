package com.project.demo.jaggedarrays;

public class numbers {
	public static void main(String[]args) {
		int jarray[][]=new int[3][];
		jarray[0]=new int[3];
		jarray[1]=new int [5];
		jarray[2]=new int[6];
		int count=10;
	for(int i=0;i<jarray.length;i++) {
			for(int j=0;j<jarray[i].length;j++) {
				jarray[i][j]=count;
				count=count+10;
				
			}
	}
	for(int i=0;i<jarray.length;i++) {
		for(int j=0;j<jarray[i].length;j++) {
			System.out.print(jarray[i][j]+"  ");
		}
		System.out.println();

}}}
