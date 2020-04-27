import java.util.Scanner;
public class CGPA
{
    public static void main(String[] args) 
{      
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the name");
	String name=sc.nextLine();
	System.out.println("Enter the age");
	int age=sc.nextInt();
	System.out.println("Enter the mobile no");
	long phone=sc.nextLong();
	System.out.println("Enter the gender");
	char gender=sc.next().charAt(0);
	System.out.println("Enter the CGPA");
	double cgpa=sc.nextDouble();
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("gender"+gender);

	System.out.println("mobile number:"+phone);
System.out.println("CGPA:"+cgpa);
	}
}