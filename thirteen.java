import java.util.*;
class thirteen
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int a,i;
System.out.println("enter the number of elements you want in your array");
a=sc.nextInt();
System.out.println("enter the elements:-");
int arr[]=new int[a];
for(i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<a;++i)
{
int k=arr[i];
int j=i-1;
while(j>=0 && arr[j]>k)
{
arr[j+1]= arr[j];
j=j-1;
}
arr[j+1]=k;
}
System.out.println("the sorted array is as folows:");
for(i=0;i<a;i++)
{
System.out.println(arr[i]);
}
}
}
