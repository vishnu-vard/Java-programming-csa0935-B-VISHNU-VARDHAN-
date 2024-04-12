import java.util.*;
class Student
{
String name;
int regno;
int total;
double average;
int m1,m2,m3,m4,m5;
void get(String student_name,int number,int a,int b,int c,int d,int e)
{
name=student_name;
regno=number;
m1=a;
m2=b;
m3=c;
m4=d;
m5=e;
}
void calculate()
{
 total=(m1+m2+m3+m4+m5);
 average=total/5;
}
void display()
{
System.out.println("mark1:"+m1);
System.out.println("mark2:"+m2);
System.out.println("mark3:"+m3);
System.out.println("mark4:"+m4);
System.out.println("mark5:"+m5);
System.out.println("average of above marks:"+average);
}
public static void main(String[] args)
{
Student obj=new Student();
obj.get("swathi",192111059,90,80,100,60,99);
obj.calculate();
obj.display();
}
}
