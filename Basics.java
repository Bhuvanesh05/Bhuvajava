package com.basics.program;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=8921,b,c,total;
		b=a%10;
		a=a/10;
		c=a%10;
		a=a/10;
		total=a%10;
		a=a/10;
		total=a+total+b+c;
		System.out.print(total);
		
}
}