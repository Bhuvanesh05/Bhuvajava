class Fibo
{
public static void main(String args[])
{
int a=0;
int b=1;
int c=b,d=c+b+b;
System.out.println(a+" "+b+" "+b+" "+(b=b+b)+" "+(c=b+c)+" "+(c=b+c)+" "+(c=d+c) );
}}