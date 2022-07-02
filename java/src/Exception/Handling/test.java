package Exception.Handling;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			try {
				int data=100/i;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			System.out.println(i+"");
		}
 }
}
