package defaultpackage;
class A
{
	void msg()
	{
		System.out.println("Helloo...");
	}
}
class B 
{
	void msg()
	{
		System.out.println("Welcome...");
	}
}
/*public class multipleinheritance extends A,B{
	public static void main(String args[])
	{
		multipleinheritance m=new multipleinheritance();
		m.msg();//doesn't know which method to be invoked..
	} 
}*/ // gives compilation error
