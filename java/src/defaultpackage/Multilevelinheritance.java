package defaultpackage;
class Animals
{
	void eat()
	{
		System.out.println("Eating..");
	}
}
	class Dog extends Animals
	{
		void bark()
		{
			System.out.println("Barking..");
		}
	}
		class BabyDog extends Dog
		{
			void weep()
			{
			System.out.println("Weeping..");
		}
	}
public class Multilevelinheritance {
public static void main(String args[])
{
	BabyDog d=new BabyDog();
	d.weep();
	d.bark();
	d.eat();
}
}
