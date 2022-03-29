package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemDuplicatArray {
public static void main(String[] args) {
	removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
    
    removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
     
    removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
     
    removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
}

private static void removeDuplicates(int[] arrDuplicate) {

	Set<Integer> set=new HashSet<>();
	for(int i=0; i<arrDuplicate.length;i++)
	{
System.out.println("duplicates"+arrDuplicate[i]);
	}
	for(int i=0; i<arrDuplicate.length;i++)
	{
		set.add(arrDuplicate[i]);
	}

	Object[] arrWithoutDuplicates = set.toArray();
	
	for(int i=0;i<arrWithoutDuplicates.length;i++)
	{
	
	System.out.println("removed duplicates" +arrWithoutDuplicates[i]);
}
}
}
