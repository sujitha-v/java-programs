package javaPrograms;

public class FindSecondLargest {
public static void main(String[] args) {
	int[] arr= {32,45,24,25,6};
	int secondLargest= findSecLar(arr);
	System.out.println("secondLargest" +secondLargest);

}

private static int findSecLar(int[] arr) {
int firstLargest,secondLargest; 
firstLargest=secondLargest=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]>firstLargest)
	{
		secondLargest=firstLargest;
		firstLargest=arr[i];
	}
	else if(arr[i]>secondLargest && arr[i] != firstLargest)
	{
		secondLargest=arr[i];
	}
}
return secondLargest;
}
}
