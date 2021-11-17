package com.basics.program;


public class Loopbigbang 
{
	public static void main(String args[])
	{
	
	for(int i=1;i<=20;i++)
	  {
		if((i%5!=0)&&(i%3!=0))
		{
			System.out.println(i);
			
		}
		else if((i%5==0)&&(i%3==0))
	       {
			  System.out.println("Bigbang");
	       }
	
		else if(i%3==0)
		  {
		   System.out.println("big");
		  }
		else    if(i%5==0)
		   
	   {		   System.out.println("bang");
	  }
	 
		/*switch(i)
		{
		case 1:
		case 2:
		case 4:
		case 7:
		case 8:
		case 11:
		case 13:
		case 14:
		case 16:
		case 17:
		case 19:
			System.out.println(i);
			break;
		case 3:
		case 6:
		case 9:
		case 12:
		case 18:
			System.out.println("big");
			break;
		case 5:
		case 10:
		case 20:
			System.out.println("bang");
			break;
		case 15:
			System.out.println("bigbang");
			break;
		
		}*/
}
}
}