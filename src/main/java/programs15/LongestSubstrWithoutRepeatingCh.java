package programs15;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstrWithoutRepeatingCh {
public static void main(String[] args) {
	String str = "abcde";
	int len=lengthOfLongestSubstr(str);
	System.out.println("length of longest sub str is" +len);
}

private static int lengthOfLongestSubstr(String str) {
	int i = 0,j=0;
	int max = 0;
	int n=str.length();
	Set<Character> set=new HashSet<>();
	while(i<n && j<n)
	{
		if(!set.contains(str.charAt(j)))
		{
			set.add(str.charAt(j));
			j++;
			 max=Math.max(max, j-i);
		}
		else {
			set.remove(str.charAt(i));
		i++;}
	}
	return max;
}
}
