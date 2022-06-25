package defaultpackage;
class Car
{
	public void Car()
	{
		System.out.println("Class Car");
	}
	public void vechicleType()
	{
		System.out.println("Vechicle Type: Car");
	}
}
class Maruthi extends Car
{
	public Maruthi()
	{
		System.out.println("Class Maruthi");
	}
	public void brand()
	{
		System.out.println("Brand: Maruthi");
	}
	public void speed()
	{
		System.out.println("Max: 90kmph");
	}
}
class Maruthi800 extends Maruthi
{
	public Maruthi800()
	{
		System.out.println("Maruthi model: 800");
	}
	public void speed()
	{
		System.out.println("Max: 80kmph");
	}
}
public class multilevelin{
	public static void main(String args[])
	{
		Maruthi800 m8=new Maruthi800();
		//m8.Car();
		m8.vechicleType();
		m8.brand();
		m8.speed();
		Maruthi m=new Maruthi();
		m.Car();
		m.brand();
		m.speed();
		
	}
}

