class Biggest
{
public static void main(String args[])
{
int a=5,b=3,c=2,d=5;
if((a>b)&&(a>c)&&(a>d))
{
System.out.println("a is biggest value");
}else if((b>c)&&(b>d))
{
System.out.println("b is biggest value");
}else if(c>d)
{
System.out.println("c is biggest value");
}else
System.out.println("d is biggest value");
}
}