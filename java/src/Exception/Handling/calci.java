package Exception.Handling;
import java.math.*;
import java.util.Scanner;
class calculator
{
public long power(int n,int p)throws Exception
{
	if(n==0 && p==0)
		throw new Exception("n and p should not be zero");
	
	else if(n<0 || p<0)
		
		throw new Exception("n and p should not be negative");
	
		else
	return (long)(Math.pow(n,p));
	}
}
public class calci {
	public final static calculator cal=new calculator();
	public final static Scanner in=new Scanner(System.in);
	public static void main(String args[])
	{
		while (in.hasNextInt())
		{
			int n=in.nextInt();
			int p=in.nextInt();
			try {
				System.out.println(cal.power(n,p));
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
