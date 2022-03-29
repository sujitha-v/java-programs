package com.javaTest.mavenproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ReverseArrayList {
public static void main(String[] args) {
	List list=new ArrayList<>();
	list.add("suji");
	list.add("krishna");
	list.add("saanu");
	Iterator i= list.iterator();
	while(i.hasNext())
	{
		System.out.println("list values" +i.next());
	}
// Descending order of arraylist	
//Comparator cmp=Collections.reverseOrder();
//Collections.sort(list,cmp);
//Iterator i2= list.iterator();
//while(i2.hasNext())
//{
//	System.out.println("reverse sorted list" +i2.next());
//}
	
	Collections.reverse(list);
	Iterator i2= list.iterator();
	while(i2.hasNext())
	{
		System.out.println("reversed list" +i2.next());
	}
}
}
