import java.util.*;
class Palindrome
{
public static void main(String arg[])
{
int rev=0,rem,n,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
n=sc.nextInt();
temp=n;
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(temp==rev){
System.out.println("palindrome");
}
else{
System.out.println(" not palindrome");
}
}
}
