class Type
{
public static void main(String args[])
{
char letter='a';
int upper=letter-32;
char l=(char)upper;
if(letter>='A'&&letter<='Z')
{
System.out.println("Given letter is Uppercase" +letter);
}
else if(l>='A'&&l<='Z')
{
System.out.println("Uppercase for given letter is" +l);
}else if((letter>=32&&letter<=47)||(letter>=58&&letter<=64)||(letter>=91&&letter<=96)||(letter>=123&&letter<=126))
{
System.out.println("Given letter is not alphabet");
}else if(letter>=48&&letter<=57)
{
System.out.println("Given letter is number");
}
}
}