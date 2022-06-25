package defaultpackage;
import java.util.Scanner;
public class toggle {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		char ch;
		String s1=s.nextLine();
		StringBuffer sb=new StringBuffer(s1);
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				ch=(char)(s1.charAt(i)-32);
			}
			else if (s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				ch=(char)(s1.charAt(i)+32);
			}
			else
			{
				ch=s1.charAt(i);
			}
			sb.setCharAt(i, ch);
		}
		System.out.println(sb);
	}
}
