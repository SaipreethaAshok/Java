package defaultpackage;
import java.util.*;
public class oddoreven {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number:");
	int number=s.nextInt();
	if((number & 1)==0)
			{
		System.out.println("Given number is even");
			}
		else
		{
		System.out.println("Given number is odd");
			}
}
}
