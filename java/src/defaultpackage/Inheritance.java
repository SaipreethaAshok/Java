package defaultpackage;
class Employer
{
	float salary=50000;
}
public class Inheritance extends Employer {
int bonus=10000;
public static void main(String args[])
{
	Inheritance programmer=new Inheritance();
	System.out.println("Progarmmer Salary is "+programmer.salary);
	System.out.println("Bonus of Programmer is "+programmer.bonus);
}
}
