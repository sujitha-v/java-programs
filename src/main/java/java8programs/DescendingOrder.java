package java8programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DescendingOrder {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(12,34,5,33,78,5);
	// to find no of elements in list
	int count=(int) list.stream().count();
	System.out.println(count);
	
	//find max ele in list
	int max=list.stream().max(Integer::compare).get();
	System.out.println(max);

	list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	list.stream().sorted().forEach(System.out::println);
	
	//first repeated ch in string
	String s="Java Hungry Blog Alive is Awesome";
	Character result= s.chars()
						.mapToObj(str->Character.toLowerCase(Character.valueOf((char)str)))
						.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
						.entrySet()
						.stream()
						.filter(entry->entry.getValue()==1L)
						.map(entry -> entry.getKey())
						.findFirst()
						.get();
	System.out.println(result);
	
}
}
