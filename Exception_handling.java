import java.util.*;
class Exception_handling
{
public static void main(String arg[])
{
int a,b,c,i,sum=0;
int arr[]=new int[10];
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
try
{
c=(a+b)/(a-b);
System.out.println("Division is "+c);

}
catch(ArithmeticException e)
{
System.out.println("Division by zero ");
System.out.println("change the value of b");
}
try
{
for(i=0;i<=15;i++)
{
 arr[i]=sc.nextInt();
}
for(i=0;i<=15;i++)
{
sum=sum+arr[i];
}

}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ARRAY OUT OF BOUNDS");
}
catch (InputMismatchException e)
{
System.out.println("Errror! enter correct size");
}
finally
{
System.out.println("ALWAYS EXECUTED");
}
}
}