package programs15;

import java.util.Stack;

public class BalancedBrackets {	    
		public static void main(String[] args) {
		String str="{[)}]"	;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='[' || str.charAt(i)=='(' || str.charAt(i)=='{')
			{
				st.push(str.charAt(i));
			}
			else if(!st.empty() && (str.charAt(i)==']' || str.charAt(i)==')' || str.charAt(i)=='}'))
			{
				st.pop();
			}
			else
				st.push(str.charAt(i));
		}
			
		if(st.empty())
			System.out.println("brackets are balanced");
		else
			System.out.println("brackets are not balanced");
		}

	}    


