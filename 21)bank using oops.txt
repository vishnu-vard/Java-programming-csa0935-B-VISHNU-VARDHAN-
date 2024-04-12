import java.util.*;
class Bank
{
 float getinterest;
 void SBIBank(float a)
{
 getinterest=a;
 System.out.println("sbi bank rate of interest:" +getinterest+ "%");
}
void ICICBank(float b)
{
 getinterest=b;
 System.out.println("icici bank rate of interest:" +getinterest +"%");
}
void AXISBank(float c)
{
 getinterest=c;
 System.out.println("axis bank rate of interest:" +getinterest+ "%");
}
public static void main(String[] args)
{
Bank object=new Bank();
object.SBIBank(8.4f);
object.ICICBank(7.3f);
object.AXISBank(9.7f);
}
}
