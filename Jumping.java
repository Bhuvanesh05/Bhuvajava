package com.basics.program;

public class Jumping {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			if(i==3)
			{
			    //break; //break is the keyword exit from the current loop and exicute the out loop 
				continue; //skip the condition and again start from beginning iteration of loop  
				//return; // exit from the method
			}
			System.out.println("Hi");
			}
		System.out.println("END");
		}
}

	


