package com.javaTest.mavenproject;

import java.util.Arrays;
import java.util.List;

public class ArrayasList {
public static void main(String[] args) {
	//t[6] a= {23,4,54,12,11};
	String[] str= new String[4];
	str[0]="suji";
	str[1]="saanu";
	str[2]="krishna";
	List<String> list=Arrays.asList(str);
	String[] str1=list.toArray(new String[list.size()]);
	for(String s:str1)
	{
		System.out.println(s);
	}
	
	
}
}
