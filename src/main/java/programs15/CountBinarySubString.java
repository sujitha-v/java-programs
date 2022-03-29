package programs15;

public class CountBinarySubString {
public static void main(String[] args) {
	String str="00110011";
	int count=CountBinarySubstrings(str);
	System.out.println(+count);
}

public static int CountBinarySubstrings(String s)
{
    int count = 0;
    int consecutiveCount = 1;
    int lastConsecutiveCount = 0;
    char[] str=s.toCharArray();

    for (int i = 1; i < str.length; i++)
    {
        if (str[i] != str[i-1])
        {
            lastConsecutiveCount = consecutiveCount;
            consecutiveCount = 1;
            count++;
        }
        else
        {
            consecutiveCount++;
            if (consecutiveCount <= lastConsecutiveCount) count++;
        }
    }

    return count;
}

}
