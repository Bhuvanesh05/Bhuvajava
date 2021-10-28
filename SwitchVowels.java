class SwitchVowels
{
public static void main(String args[])
{
char v='a';

switch(v)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println("Given char is vowels");
break;
 default :
   System.out.println("invalid");
break;
}
}
}