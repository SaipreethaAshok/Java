package abstractexamples;
abstract class A
{
	abstract void display();
}
class B extends A
{
	void display()
	{
		System.out.println("Computer Science");
	}
}
public class abstractex {
public static void main(String args[])
{
	B b=new B();
	b.display();
}
}
