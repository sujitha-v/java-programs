package programs15;

public class ContigouesSubarrLargestSum {
public static void main(String[] args) {
	int[] arr= {2,3,1,-4,5,-3,1};
	int n=arr.length;
	int max_sum=findMaxSumSubArr(arr,n);
	System.out.println("max sum:" +" " +max_sum);
}

private static int findMaxSumSubArr(int[] arr, int n) {
	int current_max=arr[0];
	int max_so_far=arr[0];
	for (int i = 1; i < n; i++) {
		current_max=Math.max(arr[i],current_max+arr[i]);
		max_so_far=Math.max(max_so_far, current_max);
	}
	
	return max_so_far;
}
}
