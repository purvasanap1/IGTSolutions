import java.util.Scanner;
class A
{
        int a,b,c;
	A()
	{
		Scanner sc = new Scanner(System.in);

       		System.out.print("Enter a: ");
     		a = sc.nextInt();

    		System.out.print("Enter b: ");
     		b = sc.nextInt();
		System.out.print("Enter c: ");
     		c = sc.nextInt();
		
	}
	void max()
	{

		if(a>b && a>c)
		{		
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{		
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}		
	
	}
}
class Demo6
{
	public static void main(String args[])
	{
		A a = new A(); //Create only one constructor, methods can be 		called 	multiple times
		a.max();
		
	}
}

