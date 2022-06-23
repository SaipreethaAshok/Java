package defaultpackage;
import java.util.Scanner;
public class displayleft {
public static void print_digits(int n)
{
	if(n<=9)
	{
		System.out.println(n);
		return;
	}
	print_digits(n/10);
	System.out.println(n%10);
	}
public static void main (String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	print_digits(n);
}
}
