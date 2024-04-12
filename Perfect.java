import java.util.*;
class Perfect
{
public static void main(String arg[])
{
	int i,sum=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
		
		if(sum==n)
		{
			System.out.println("Given number is a perfect  number");
		}
		else
		{
			System.out.println("Given number is  not a perfect  number");
		}
}
}
			
		
	
	