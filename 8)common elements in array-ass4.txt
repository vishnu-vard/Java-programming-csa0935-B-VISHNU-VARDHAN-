import java.util.*;
class Samee
{
public static void main(String[] args)
{
int arr1[]=new int[4];
int arr2[]=new int[5];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the array1 elements");
for(i=0;i<4;i++)
{
arr1[i]=sc.nextInt();
}
System.out.println("enter the array2 elements");
for(i=0;i<5;i++)
{
arr2[i]=sc.nextInt();
}
System.out.println("common elements");
for(i=0;i<4;i++)
{
for(j=0;j<5;j++)
{
 if(arr1[i]==arr2[j])
 System.out.print(arr1[i] + " ");
}
}
}
}
