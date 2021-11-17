package com.basics.program;

public class Decimalbinary {

	public static void main(String[] args)
	{
		int a=25,t=0,s=0,b=0,x=0;
		
		while(a>0)
		{
		t=a%2;
		a=a/2;
		//System.out.println(t);
		x=x*10+t;
		}
		while(x>0)
		{
		s=x%10;
		b=b*10+s;
		x=x/10;
		}
System.out.println(b);
	}

}
