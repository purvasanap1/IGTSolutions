class A
{
	A()
	{
		System.out.println("A class");
	}
	void abc()
	{

		System.out.println("abc method");
	}
}
class Demo5
{
	public static void main(String args[])
	{
		A a = new A(); //Create only one constructor, methods can be 		called 	multiple times
		a.abc();
		a.abc();
	}
}

