package com.javaTest.mavenproject;

public class MethodOverridingEx {

	public void method(int a)
	{
		System.out.println("Integer is passed");
	}
	public void method(double a)
	{
		System.out.println("double is passed");
	}
	public static void main(String[] args) {
		MethodOverridingEx m= new MethodOverridingEx();
		
	}
	
	
}
