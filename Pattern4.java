import java.util.*;
class Pattern4
{
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in); 
      int n,i,j;
      System.out.println("Enter the number of rows:");
      n=sc.nextInt();
      for(i=n;i>=1;i--)
       {
         for(j=1;j<=i;j++)
          {
            System.out.print("*");
          }
         System.out.println();
   }
}
}