class A
{
	int ss=0;
	int mm=0;
	int hh=0;
	void abc()
	{
		try
		{
			for(int i=0;i<=10000;i++)
			{
			System.out.println(hh+":"+mm+":"+i);
			if(i==60)
			{
				mm++;
				i=0;
			}
			Thread.sleep(500);
		}
	}
	catch(InterruptedException e)
	{
	}
	}
}
class Demo25
{
	public static void main(String args[])
	{
		A a=new A();
		a.abc();
	}
}