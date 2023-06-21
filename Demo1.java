import java.util.Scanner;
class Demo1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your name");
		String name = sc.next();

		System.out.println("Enter your ID");
		int id = sc.nextInt();
		
		System.out.println("Enter your Age");
		int Age= sc.nextInt();

		System.out.println("Enter your Salary");
		int Salary = sc.nextInt();

		
		System.out.println("Enter your Designation");
		String Designation= sc.next();

		System.out.println("Name is:"+name);
		System.out.println("ID is:"+id);
		System.out.println("Age is:"+Age);
		System.out.println("Salary is:"+Salary);
		System.out.println("Designation is:"+Designation);
	}
} 