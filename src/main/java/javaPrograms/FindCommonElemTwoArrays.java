package javaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElemTwoArrays {
 public static void main(String[] args) {
	String[] str1= {"hi", "say","think"};
	String[] str2= {"think","hi","pretty"};
	Set<String> s1=new HashSet<>(Arrays.asList(str1));
	Set<String> s2=new HashSet<>(Arrays.asList(str2));

//	for(int i=0;i<str1.length;i++)
//	{
//		for(int j=0;j<str2.length;j++)
//		{
//			if(str1[i].equals(str2[j]))
//			{
//				s1.add(str1[i]);
//			}
//		}
//	}
//System.out.println("common elements are:" +s1);
	s1.retainAll(s2);
	System.out.println(s1);
}
}
