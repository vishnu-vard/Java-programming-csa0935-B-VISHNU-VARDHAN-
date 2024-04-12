import java.util.*;
class Reversestring
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
String str;
char ch;
String rev="";
System.out.println("enter string");
str=sc.nextLine();
int n=str.length();
int i;
for(i=n-1;i>=0;i--)
{
ch=str.charAt(i);
rev=rev+ch;
}
System.out.println("enter reverse string"+rev);
}
}
