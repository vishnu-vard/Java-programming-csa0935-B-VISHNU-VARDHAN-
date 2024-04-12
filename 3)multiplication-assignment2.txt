import java.util.*;
class Multiplication
{
public static void main(String arg[])
{
int m,n,i,mul=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter m number:");
m=sc.nextInt();
System.out.println("enter n number:");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
mul=i*m;
System.out.println(i+"*"+m+"="+mul);
}
}
}
