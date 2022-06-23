package defaultpackage;
import java.util.Scanner; 
public class stringex {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	System.out.println(s1.length()+s2.length());
	if(s1.compareTo(s2)>0)
		System.out.println("Yes");
	else
		System.out.println("No");
	System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1)+" "+Character.toUpperCase(s2.charAt(0))+s2.substring(1));
}
}
