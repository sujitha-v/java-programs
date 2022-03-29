package javaPrograms;

public class Palindrome {
public static void main(String[] args) {
	String str="sujitha";
	palind(str);
	
//	if(output==true) 
//		System.out.println("The string" +str+ "is palindrome");
//	
//	else
//		System.out.println("The string" +str+ "is not palindrome");

}

private static void palind(String str) {
StringBuilder str1=new StringBuilder();
str1.reverse();
String revString=str1.toString();
if(str.equalsIgnoreCase(revString))
	System.out.println("The string" +str+ "is palindrome");
else
	System.out.println("The string" +str+ "is not palindrome");
}
}
