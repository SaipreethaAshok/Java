package defaultpackage;
class aquaanimal
{
	String name;
	void nature()
	{
		System.out.println("Animals");
	}
}
class Fish extends aquaanimal
{
	String color;
	void nature()
	{
		System.out.println("Aquatic Animal");
	}
}
public class upcastingex {
public static void main(String args[])
{
	aquaanimal a=new Fish();
	a.name="GoldFish";
	Fish f=new Fish();
	f.name="Whale";
	f.color="Blue";
	System.out.println("Name: "+a.name);
	a.nature();
	System.out.println("Name: "+f.name);
	System.out.println("Color: "+f.color);
	f.nature();
}
}
