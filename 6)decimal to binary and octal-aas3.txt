import java.util.*;
class Decimal
{
public static void main(String[] args)
{
int dec;
Scanner sc=new Scanner(System.in);
System.out.println("enter the  decimal number");
dec=sc.nextInt();
String Binary=Integer.toBinaryString(dec);
String Octal=Integer.toOctalString(dec);
System.out.println(Binary);
System.out.println(Octal);
}
}
