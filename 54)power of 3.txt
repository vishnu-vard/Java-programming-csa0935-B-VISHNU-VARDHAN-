import java.util.*;
class Powerof3
{
public static void main(String arg[])
{
int n;
double cube=0;
Scanner sc=new Scanner(System.in);
System.out.println("entre nnumbers n:");
n=sc.nextInt();
for(int i=0;i<=n;i++)
{
cube=Math.pow(i,3);
if(cube==n)
{
System.out.println("true:"+i);
}
}
}
}
