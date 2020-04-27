import java.util.*;
class eleven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,i;
System.out.println("enter the number of elements you want in the array");
a=sc.nextInt();
System.out.println("enter the elements");
int arr[]=new int[a];
for(i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("the elements in the array are:-");
for(i=0;i<a;i++)
{
System.out.println(arr[i]);
}
}
}
