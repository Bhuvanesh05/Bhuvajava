package com.basics.program;

public class Reversenumber {

	public static void main(String[] args) {
		int n=1781;
		int r=0,d;
		
		while(n>0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		System.out.println(r);

	}

}
