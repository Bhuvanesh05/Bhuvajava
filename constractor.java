
class constractor
{
constractor()
{
int x,y;
x=5;
y=6;
System.out.println("value x:"+x);
System.out.println("value y:"+y);
}
constractor(int a)
{
int i,j;
i=a;
j=i;
System.out.println("value i:"+i);
System.out.println("value j:"+j);
}
public static void main(String args[])
{
int a,b,n;
Scanner se=new Scanner(System.in);
a=se.nextInt();
b=se.nextInt();
constractor obj=new constractor();
constractor d=new constractor(a);

}
}