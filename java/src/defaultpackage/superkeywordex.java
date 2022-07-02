package defaultpackage;
class Persons
{
	void message()
	{
		System.out.println("This is person class..");
	}
}
class Students extends Person
{
	public void message()
	{
		System.out.println("This is student class..");
	}
	void display()
	{
		message();
		super.message();
	}
}
 class superkeywordex {
		public static void main(String args[])
		{
			Students s=new Students();
			s.display();
		}
	}
