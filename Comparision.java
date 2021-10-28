class Comparision
{
public static void main(String args[])
{
int x=10,y=2;
System.out.println(((x+y)>=(x-5))&&((x+7)==(x+y)));
System.out.println(((x+y)>=(x-5))||((x+y)>2));
x+=2;
y*=5;
y/=2;
System.out.println(x);
System.out.println(y);
System.out.println(x+y>x-5||x+y>2);
}}