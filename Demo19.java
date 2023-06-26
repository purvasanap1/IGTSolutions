class Car
{
	final int speed=200;
	final void run()
	{
		System.out.println("hi run method");
	}
}
class Maruti extends Car
{
	//void run()
	//{
	//System.out.println("Hi run method with speed of 250");
	//}
}
class Demo19
{
	public static void main(String args[])
	{
		Car c = new Car();
		c.run();
		System.out.println("Speed:"+c.speed);
		Maruti m = new Maruti();
		m.run();
	}
} 