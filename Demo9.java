import java.util.Scanner;

 

class clerk{
    String name;
    int id;
    int age;
    final String desig="Clerk";
    float salary;

 

    clerk()
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Details of clerk ");
        System.out.print("Enter your name: ");
        name = sc.next();

        System.out.print("Enter your id: ");
        id = sc.nextInt();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
 
        //System.out.print("Enter your Designation: ");
        //desig = sc.next(); 

        System.out.print("Enter your salary: ");
        salary = sc.nextFloat();
    }

    void display(){
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Age: " +age);
        System.out.println("Designation: " +desig);
        System.out.println("Salary: " +salary);
    }
}

class dev{
    String name;
    int id;
    int age;
    String desig;
    float salary;

 

    dev()
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Details of dev ");
        System.out.print("Enter your name: ");
        name = sc.next();

        System.out.print("Enter your id: ");
        id = sc.nextInt();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
 
        System.out.print("Enter your Designation: ");
        desig = sc.next(); 

        System.out.print("Enter your salary: ");
        salary = sc.nextFloat();
    }

    void display(){
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Age: " +age);
        System.out.println("Designation: " +desig);
        System.out.println("Salary: " +salary);
    }
}
 class manager{
    String name;
    int id;
    int age;
    String desig;
    float salary;

 

    manager()
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Details of manager ");
        System.out.print("Enter your name: ");
        name = sc.next();

        System.out.print("Enter your id: ");
        id = sc.nextInt();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
 
        System.out.print("Enter your Designation: ");
        desig = sc.next(); 

        System.out.print("Enter your salary: ");
        salary = sc.nextFloat();
    }

    void display(){
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Age: " +age);
        System.out.println("Designation: " +desig);
        System.out.println("Salary: " +salary);
    }
}
class Demo9
{
	public static void main(String args[])
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println(" Choose /n1.Clerk /n2.Dev /n3.Manager");
		int num = sc.nextInt();
		
		if(num==1)
		{
			clerk c= new clerk();
			c.display();
		}
		else if(num==2)
		{
			dev d= new dev();
			d.display();
		}
		else
		{
			manager m= new manager();
			m.display();
		}
	}
}