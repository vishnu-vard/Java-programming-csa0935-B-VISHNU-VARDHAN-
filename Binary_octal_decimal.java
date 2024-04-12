import java.util.*;
class Binary_octal_decimal 
{
    public static void main(String arg[]) 
	{
        int Bn,dc=0,oc=0,rem,i=1,j=1,rem1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        Bn = sc.nextInt();
        while(Bn != 0) 
		{
            rem=Bn%10;
            dc=dc+(rem*i);
            Bn=Bn/10;
            i=i*2;
        }
        int temp=dc;
        while (temp != 0) 
		{
            rem1=temp%8;
            oc=oc+(rem1*j);
            temp=temp/8;
            j=j*10;
        }
        System.out.println("DECIMAL NUMBER IS " + dc);
        System.out.println("OCTAL NUMBER is " + oc);
    }
}
