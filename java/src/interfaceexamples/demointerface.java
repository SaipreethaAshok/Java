package interfaceexamples;
interface Area
{
	final static float pi=3.14f;
	float compute(float x,float y);
}
class Rectangle implements Area
{
	public float compute(float x,float y)
	{
		return(x*y);
	}
}
class Circle implements Area
{
	public float compute(float x,float y)
	{
		return(pi*x*y);
	}
}
public class demointerface {
public static void main(String args[])
{
	float x,y;
	Rectangle r=new Rectangle();
	Circle c=new Circle();
	Area a;
	a=r;
	x=a.compute(10, 20);
	System.out.println("Area of the Rectangle is "+x);
	a=c;
	y=a.compute(10,2);
	System.out.println("Area of Circle is "+y);
}
}
