package defaultpackage;
class super1
{
	void m1()
	{
		System.out.println("Super m1");
	}
	final void m2()
	{
		System.out.println("Super m2");
	}
}
public class supers extends super1{
	void m1()
	{
		System.out.println("sub m1");
	}
public static void main(String args[])
{
	/*supers s=new supers();
	s.m1();
	s.m2();*/
	super1 s1=new super1();
	s1.m1();
	s1.m2();
}
}
