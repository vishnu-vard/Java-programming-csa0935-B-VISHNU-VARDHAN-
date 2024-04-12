import java.util.*;
class Division
{
public static void main(String arg[])
{
float n1,n2,Q,R;
Scanner sc=  new Scanner(System.in);
System.out.println("ENTER THE VALUE OF n1");
n1=sc.nextFloat();
System.out.println("ENTER THE VALUE OF n2");
n2=sc.nextFloat();
Q=n1/n2;
R=n1%n2;
System.out.println("QUOTIENT OF THE GIVEN NUMBER IS "+Q);
System.out.println("REMAINDER OF THE GIVEN NUMBER IS "+R);
}
}
