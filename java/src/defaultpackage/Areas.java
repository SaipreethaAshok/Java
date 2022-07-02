package defaultpackage;
import java.util.Scanner;
class area
{
	void findarea(int a)
	{
		System.out.println("Area of square is :"+(a*a));
	}
	void findarea(int l,int b)
	{
		System.out.println("Area of rectangle is :"+(l*b));
	}
	void findarea(float b,int h)
	{
		System.out.println("Area of triangle is :"+(0.5*b*h));
	}
	void findarea(int b,float h)
	{
		float area=b*h;
		System.out.println("Area of parallelogram is :"+area);
	}
}
public class Areas {
	public static void main(String args[])
	{
		area a=new area();
		a.findarea(5);
		a.findarea(6,9);
		a.findarea(8f,2);
		a.findarea(15,12f);
	}
}
