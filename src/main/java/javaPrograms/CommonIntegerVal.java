package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class CommonIntegerVal {
public static void main(String[] args) {
	int[] a= {34,6,63,2};
	int[] b= {6,63,44,22};
	commonArr(a,b);
}

private static void commonArr(int[] a, int[] b) {

	Set<Integer> s=new HashSet<>();
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<b.length;j++)
	{
		if(a[i]==b[j])
		{
			s.add(a[i]);
		}
	}
}
System.out.println("common intergers" +s);
}
}
