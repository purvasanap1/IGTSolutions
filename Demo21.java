class A
{
	private int id;
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
}
class Demo21
{
public static void main(String args[])
{
	A a=new A();
	a.setId(100);
	System.out.println(a.getId());
}
}