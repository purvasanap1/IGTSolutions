interface I
{
	int a=10;
	void add();
	void sub();
}

interface J
{
	int b=20;
	void mul();
	void div();
}

interface K extends I,J
{

}

class Cal implements K
{

public void sub()
{
System.out.println(I.a - J.b);
}
public void add()
{
System.out.println(I.a + J.b);
}
public void mul()
{
System.out.println(I.a * J.b);
}
public void div()
{
System.out.println(I.a / J.b);
}
}

class Demo20
{
	public static void main(String args[])
	{
	System.out.println("================cal=============");
	Cal c= new Cal();
	c.add();
	c.sub();
	c.mul();
	c.div();
System.out.println("================I interface=============");
	I i=c; //this is how we use members of interface, by using reference variable of a class
	i.add();
	i.sub();
	
System.out.println("================J interface=============");
	J j=c;

	j.mul();
	j.div();
System.out.println("===============K interface=============");
	K k=c;
	k.add();
	k.sub();
	k.mul();
	k.div();
	}
}