package programs15;

import java.util.HashSet;
import java.util.Set;

public class LengthLongestConsecutiveSeq {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,6,22,7,55};
	int result=findLongestConsecSeq(arr);
	System.out.println("the result is" +result);
}

private static int findLongestConsecSeq(int[] arr) {
	 int ans=0;
	Set<Integer> set=new HashSet<>();
	for (int i = 0; i < arr.length; i++) {
		set.add(arr[i]);
	}
	for (int i = 0; i < arr.length; i++) {
		if(!set.contains(arr[i]-1))
		{
			int initial_num=arr[i];
			while(set.contains(initial_num))
			{
				initial_num++;
			}
			if(ans<initial_num-arr[i])
			{
				ans=initial_num-arr[i];
			}
				 
		}
	}
	
	return ans;
}
}
