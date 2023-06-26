import java.util.*;
class Demo22
{
	public static void main(String args[])
	{
	m1();
	}

	static void m1()
	{
		m2();
		System.out.println("m1 method");
	}

	static void m2()
	{
		m3();
		System.out.println("m2 method");
	}
	static void m3()
	{
		System.out.println("m3 method");
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter A value");
			int a=sc.nextInt();
			System.out.println("enter B value");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("result is"+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("We cant divide by zero");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter number only");
		}
	}


}