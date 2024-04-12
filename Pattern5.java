import java.util.*;

class Day2floydtriangle 
  {
    public static void main(String arg[]) 
     {
        int i, j, number = 1, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
           {
            for (j = 1; j <= i; j++) 
              {
                System.out.print(number + " ");
                number++;
               }
            System.out.println();
          }
    }
}
