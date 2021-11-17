            //Print even and odd numbers and sum of those numbers
package com.basics.program;

public class Loop2
{
public static void main(String[] args)
{
	int s=0;
  for(int i=1;i<=10;i++)
  {
	  if(i%2==0)
	  {
		s=i+s;
		System.out.println(i);
  }
	  
	  //else if(i%2!=0)
	  //System.out.println(i);
  }
  System.out.println(s);
}
}
