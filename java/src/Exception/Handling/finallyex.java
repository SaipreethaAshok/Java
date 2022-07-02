package Exception.Handling;

public class finallyex {
public static void main(String args[])
{
	int a,b,c;
	try {
		a=0;b=10;
		c=b/a;
	}
	catch(ArithmeticException e) {
		System.out.println("Divided by zero");
	}
	finally
	{
		System.out.println("Finally is always executed");
	}
}
}
