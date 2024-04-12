import java.util.*;          
class athread implements Runnable
{
	public void run()
	{
int n1=0,n2=1,n3,N,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE LIMIT");
		N=sc.nextInt();
		System.out.println("fibonicci series are ");
		System.out.println(" "+n1);
		System.out.println(" "+n2);
		for(i=2;i<N;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
		}
	}
}
	class bthread implements Runnable
{
	public void run()
	{
int n,i;
		System.out.println("Reverse order is ");
		for(i=10;i>=1;i--)
		{
			System.out.println(+i);
	    }
	}
}
class Multithread_fib_rev
{
	public static void main(String arg[])
	{
		athread a = new athread();
		Thread t1=new Thread(a);
		bthread b = new bthread();
		Thread t2=new Thread(b);
		t1.start();
		t2.start();		
	}
}