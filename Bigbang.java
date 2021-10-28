class Bigbang
{
public static void main(String args[])
{
int a=2;
if((a%3==0)&&(a%5==0))
{
System.out.println("Given number is bigbang");
}else if(a%3==0)
{
System.out.println("Given number is big");
}else if(a%5==0)
{
System.out.println("Given number is bang");
}else
System.out.println("Given number is not divisible by bigbang");
}
}