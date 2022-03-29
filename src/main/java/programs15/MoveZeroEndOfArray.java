package programs15;

public class MoveZeroEndOfArray {
public static void main(String[] args) {
	int[] arr= {2,3,0,4,21,0,5,0};
	int n=arr.length;
	pushZerosToEnd(arr,n);
	for (int i = 0; i < n; i++) {
		System.out.println("new arr is" +arr[i]);
	}
	
}

private static void pushZerosToEnd(int[] arr, int n) {
int count=0;
for (int i = 0; i < n; i++) {
	if(arr[i]!=0)
	{
		arr[count++]=arr[i];
	}
}
		while(count<n)
		{
			arr[count++]=0;
		}
}
}
