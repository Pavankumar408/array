package com.project.demo.array;

public class Stringarray {
public static void main(String[]args) {
	String name[]=new String[3];
	try{
		name[0]="pavan";
	name[1]="yethish";
	name[2]="dkkpocdsm mdposk";
	name[3]="karthi";
	for(String str:name) {
		System.out.println(str);}
	
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("wrong input");
	}
	
}
}
