package defaultpackage;
import java.util.Scanner;
public class array {
public static void main(String args[])
{
	int i,num;
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
	int array[]=new int[num];
	for(i=0;i<num;i++)
	{
		array[i]=s.nextInt();
	}
	for(i=0;i<num;i++)
	{
		System.out.println(array[i]);
	}
}
}
