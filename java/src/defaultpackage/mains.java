package defaultpackage;
import java.util.Scanner;
class animal
{
	void sound()
	{
		System.out.println("Animal");
	}
}
class cat extends animal
{
	void sound()
	{
		System.out.println("Meows");
	}
}
class lion extends animal
{
	void sound()
	{
		System.out.println("Roars");
	}
}
public class mains {
public static void main(String args[])
{
	animal a;
	a=new cat();
	a.sound();
	a=new lion();
	a.sound();
}
}
