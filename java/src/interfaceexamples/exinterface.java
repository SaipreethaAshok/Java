package interfaceexamples;
interface info
{
	static final String language="Java";
	public void display();
}
public class exinterface implements info {
public static void main(String args[])
{
	exinterface s=new exinterface();
	s.display();
}
public void display()
{
	System.out.println(language+" is Obejct Oriented Programming");
}
}
