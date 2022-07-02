package defaultpackage;

public class wrapperex {
public static void main(String args[])
{
	/*int a=20;
	Integer i=Integer.valueOf(a);
	Integer j=a;*/
	Integer a=new Integer(5);
	int i=a.intValue();
	int j=a;
	System.out.println(a+""+i+""+j);
}
}
