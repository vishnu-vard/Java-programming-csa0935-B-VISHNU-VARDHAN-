import java.util.*;
class Arith
{
 public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a and b values:");
 int a=sc.nextInt();
 int b=sc.nextInt();
 try
  {
    int x=(a+b)/(a-b);
    System.out.println("Output:"+x);
  }
   catch(Exception ex)
{
    System.out.println("Division by Zero error");
    System.out.println("Change the b value:");
   }
 finally
{
 System.out.println("Always Executed");
}
}
}
  