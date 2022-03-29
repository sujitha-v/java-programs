package javaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemDuplicatUsingJava8Distinct {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(23,33,3,33,22);
	list.stream().filter(n->n%2==0).forEach(System.out::println);
//	List<Integer> evenList=list.stream().filter(n->n%2==0).collect(Collectors.toList());
//	System.out.println("even num are" +evenList);
	List<Integer> filteredList= list.stream().distinct().collect(Collectors.toList());
System.out.println("removed duplicate elme is" +filteredList);
}
}
