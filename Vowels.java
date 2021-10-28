class Vowels
{
public static void main(String args[])
{
char value='E';
if(value=='a'||value=='e'||value=='i'||value=='o'||value=='u'||value=='A'||value=='E'||value=='I'||value=='O'||value=='U')
{
System.out.println("Given value is vowel");
}else if(value>=48&&value<=57)
{
System.out.println("Given value is a number");
}else if((value>=33&&value<=47)||(value>=58&&value<=64)||(value>=92&&value<=96)||(value>=123&&value<=126))
{
System.out.println("Given value is Special character");
}else
System.out.println("Given value is consonants");
}}