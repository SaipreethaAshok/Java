package Exception.Handling;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		try
		{
			System.out.println(num/0);
		}
catch(ArithmeticException e)
		{
	System.out.println("Division not allowed");
		}
	}
}
