package javaPrograms;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	
public static void main(String[] args) {
	int[] arr1= {-7, 12, 17, 29, 41, 56, 79};
	int[] arr2= {-9, -3, 0, 5, 19};        
	int[] mergedArray=mergeArray(arr1,arr2);
	System.out.println("arr1"+Arrays.toString(arr1));
	System.out.println("arr2" +Arrays.toString(arr2));
	System.out.println("merged array" +Arrays.toString(mergedArray));

}

private static int[] mergeArray(int[] arr1, int[] arr2) {

	int[] mergedArray=new int[arr1.length +arr2.length];
	int i=0,j=0,k=0;
	while(i<arr1.length && j<arr2.length)
	{
		if(arr1[i]<arr2[j])
		{
			mergedArray[k]=arr1[i];
			i++;
			k++;
		}
		else {
			mergedArray[k]=arr2[j];
			j++;
			k++;
		}
			
	}
	while(i<arr1.length)
	{
		mergedArray[k]=arr1[i];
		i++;
		k++;
	}
	while(j<arr2.length)
	{
		mergedArray[k]=arr2[j];
		j++;
		k++;
	}
	return mergedArray;

}
}
