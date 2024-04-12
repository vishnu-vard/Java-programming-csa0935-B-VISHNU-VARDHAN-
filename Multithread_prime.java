import java.util.*;          
class athread implements Runnable
{
	public void run()
	{
		int n,flag=0,i;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=2;i<=n/2;i++)
{
if(n%i==0)
{
System.out.println(n+" is a not prime");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println(n +" is a prime");
}
}
}
class Multithread_prime
{
	public static void main(String arg[])
	{
		athread a = new athread();
		Thread t1=new Thread(a);
		t1.start();		
	}
}