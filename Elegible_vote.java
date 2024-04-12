import java.util.*;
class Elegible_vote
{
public static void main(String arg[])
{
int age;
Scanner sc=  new Scanner(System.in);
System.out.println("ENTER THE age");
age=sc.nextInt();
if(age>=18)
{
System.out.println("CONGRATULATIONS YOU ARE ELEGIBLE FOR VOTE");
}
else
{
	int temp=18-age;
System.out.println("YOU ARE  ALLOWED TO  VOTE AFTER "+temp+ " YEARS");
}
}
}
