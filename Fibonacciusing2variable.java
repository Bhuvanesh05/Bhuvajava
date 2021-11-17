package com.basics.program;

public class Fibonacciusing2variable {

	public static void main(String args[])
	{
	int a=0,b=1;
	System.out.println(a);
	System.out.println(b);
	for(int i=1;i<=10;i++)
	{
		b=a+b;
		System.out.println(b);
		a=b-a;
	

}
}
}