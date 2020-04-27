import java.util.*;
class sixteen
{
int a,b,c;
double d,e;
public void add(int a,int b)
{
System.out.println("this method shows addition of two integer numbers");
System.out.println("first number:"+a);
System.out.println("second number:"+b);
c=a+b;
System.out.println("sum is:"+c);
}
public void add(int a,double d)
{
System.out.println("this method shows addition of two double numbers");
System.out.println("first number:"+a);
System.out.println("second number:"+d);
e=a+d;
System.out.println("sum is:"+e);
}
}
class overload
{
public static void main(String args[])
{
sixteen s=new sixteen();
s.add(9,4);
s.add(7,5.2);
}
}
