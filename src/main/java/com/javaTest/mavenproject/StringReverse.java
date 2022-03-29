package com.javaTest.mavenproject;

public class StringReverse {
public static void main(String[] args) {
	String str="sujitha vemula interview";
//	String[] splitArray = str.split(" ");
	char[] charr=str.toCharArray();
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
	rev=rev+charr[i];
	}
	System.out.println("rev string:" +rev);
}
}
