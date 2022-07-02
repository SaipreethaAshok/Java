package Exception.Handling;
import java.util.Scanner;
import java.util.Scanner.*;

class mystring
{
	mystring(String s) throws InvalidStringException{
		int l=s.length();
		if(l%2==0)
		{
			System.out.println(s);
		}
		else
		{
			throw new InvalidStringException(s);
		}
	}
}
public class throwexceptionex extends InvalidStringException{

	public throwexceptionex(String a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		String a=sc.next();
		try {
			mystring m=new mystring(a);
		}
		catch(InvalidStringException e)
		{
			System.out.println(e);
		}
	}
}
