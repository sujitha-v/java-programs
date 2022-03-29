package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeUnsortedListUsingHashSet {
public static void main(String[] args) {
	List<Integer> l1=Arrays.asList(1,2,3,8,5);
	List<Integer> l2=Arrays.asList(3,7,1,32);
Set<Integer> s=new HashSet<>(l1);
s.addAll(l2);
ArrayList<Integer> finalList=new ArrayList<>(s);
Collections.sort(finalList);
System.out.println(finalList);
	
}
}
