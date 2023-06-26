class A
{
	static int x=10;
	static void abc()
	{
		System.out.println("Hi abc method");
	}
}
class Demo18
{	
	public static void main(String args[])
	{
	A.abc();
	System.out.println("X:"+A.x);
	}
}