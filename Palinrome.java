package com.basics.program;

public class Palinrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=121,p=n;
		int r=0,d;
		for(;n>0;)
		{
			d=n%10; 
			r=10*r+d;
			n=n/10;
			
		}
		if(p==r)
		{
		System.out.println("palindrome");
		}
		else
			System.out.println("Not palinrome");
		}

}
