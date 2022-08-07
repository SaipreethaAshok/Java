package StreamAPI;

import java.util.Scanner;
public class WithoutStreamAPI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]=new String[5];
		System.out.println("Given the input String are");
		for(int i=0;i<5;i++)
		s[i]=sc.next();
			System.out.println("Desired Output");
			for(int i=0;i<5;i++)
				if(i==0)
					System.out.print(s[i]);
				else
					System.out.print(","+s[i]);

	}
}
