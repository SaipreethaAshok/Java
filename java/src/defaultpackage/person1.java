package defaultpackage;
class Person
{
	Person()
	{
		System.out.println("Person called");
	}

	public void message() {
		// TODO Auto-generated method stub
		
	}
}
class Student extends Person
{
	Student()
	{
		super();
		System.out.println("Student called");
	}
}
public class person1 {
public static void main(String args[])
{
	Student s=new Student();
}
}
