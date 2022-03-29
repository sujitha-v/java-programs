package javaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
public static void main(String[] args) {
	int[] inputArray= {34,53,2,34,46,75};
	//findDuplicates(inputArray);
	
//}
//private static int[] findDuplicates(int[] inputArray) {
//Set<Integer> set=new HashSet<>();
//for(int i:inputArray)
//{
//	if(!set.add(i))
//	{
//		System.out.println("duplicates are" +i);
//	}
//}
//	return null;
//}
	Set<Integer> set=new HashSet<>();
	Set<Object> duplicateElements= Arrays.stream(inputArray)
									.filter(i-> !set.add(i))
									.boxed()
									.collect(Collectors.toSet());
	
	System.out.println("duplicates are" +duplicateElements);
}
}

