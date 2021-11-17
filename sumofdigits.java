package com.basics.program;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8732,s=0,n;
		while(a>0)
		{
		n=a%10;
		s=n+s;
		a=a/10;
		}
		System.out.println(s);

	}

}
