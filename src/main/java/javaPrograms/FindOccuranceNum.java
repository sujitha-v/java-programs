package javaPrograms;

import java.util.Arrays;

public class FindOccuranceNum {
public static void main(String[] args) {
	int[] arr= {45,45,6,7,8,45};
	int n = 2;
	findOccurance(arr,n);
	
	System.out.println("less" +findKelement(arr,n));
}

private static int findKelement(int[] arr, int n) {
Arrays.sort(arr);
	return arr[n-1];	
}

private static void findOccurance(int[] arr, int n) {
int count=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==n)
	{
		count++;
	}
}
System.out.println("occurance of" +n+"is" +count);
}
}
