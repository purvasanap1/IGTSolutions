//Inheritance
class Parent
{
int site=5;
int money=50000;
String car="BMW";
}
class Child extends Parent
{
int money=10000;
void use()
{
System.out.println("Site"+site);
System.out.println("Money"+money);
System.out.println("Car"+car);
System.out.println("Money"+super.money);
System.out.println("total money"+(money+super.money));
}
}
class Demo8
{
public static void main(String args[])
{
Child c= new Child();
c.use();
}
}