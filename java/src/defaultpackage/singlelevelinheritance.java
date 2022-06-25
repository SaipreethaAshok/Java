package defaultpackage;
class Animal{
	void Animals()
	{
		System.out.println("It belongs to animal");
	}
}
class pet extends Animal{
	void PetAnimals(String x)
	{
		System.out.println(x+" is a pet");
	}
}
public class singlelevelinheritance {
public static void main(String args[])
{
	pet dog=new pet();
	dog.PetAnimals("Dog");
	dog.Animals();
}
}
