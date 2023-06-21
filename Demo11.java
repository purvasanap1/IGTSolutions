class A
{
	A()
	{
		System.out.println("Hi class A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Hi class B");
	}
}
class Demo11
{
	public static void main(String args[])
	{
	B b= new B();
	}
}