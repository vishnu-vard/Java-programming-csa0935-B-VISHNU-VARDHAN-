import java.util.*;
class Pattern
{
public static void main(String[] args)
{
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
for(i=n-1;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}
