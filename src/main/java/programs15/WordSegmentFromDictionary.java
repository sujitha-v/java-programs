package programs15;

import java.util.HashSet;
import java.util.Set;

public class WordSegmentFromDictionary {
	private static Set<String> dictionary=new HashSet<>();

public static void main(String[] args) {
	//String[] tempDictionary= {"leet","code"};
	String[] tempDictionary={"cats","dog","sand","and","cat"};
for(String st:tempDictionary)
{
	dictionary.add(st);
}
System.out.println(wordBreak("catsandog"));
	
}

private static boolean wordBreak(String string) {
int n=string.length();
if(n==0)
	return true;
for(int i=1;i<=n;i++)
{
	if(dictionary.contains(string.substring(0,i))&& wordBreak(string.substring(i, n)) )
		return true;
}	
	return false;
}
}
