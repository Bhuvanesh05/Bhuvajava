package com.basics.program;

public class amstrong
{

	public static void main(String[] args) {
		int n=370;
		int r=0,d,s=n;
		while(n>0)
		{
			d=n%10; 
			r=r+d*d*d;
			n=n/10;
		
		}
		if(r==s)
		{
		System.out.println("Amstrong");
		}
		else
			System.out.println("Not Amstrong");
		
	}

}
