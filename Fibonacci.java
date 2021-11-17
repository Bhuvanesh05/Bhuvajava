package com.basics.program;

public class Fibonacci
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=0,b=1,c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
			
		}
		
	}

}
