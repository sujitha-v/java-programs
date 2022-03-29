package javaPrograms;

import java.util.Arrays;

public class SecondBiggestUsingJava8 {
public static void main(String[] args) {
	Integer[] a= {4,5,76,32,22};
	//4 5 22 32 76
	Arrays.stream(a).sorted().limit(a.length-1).skip(a.length-2).forEach(System.out::println);
}
}
