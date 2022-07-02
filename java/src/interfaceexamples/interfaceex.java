package interfaceexamples;
interface item
{
	static final int code=1001;
	static final String name="Computer";
}
class purchase implements item
{
	void display()
	{
		System.out.println("Item code="+code);
		System.out.println("Item Name="+name);
	}
}
public class interfaceex {
public static void main(String args[])
{
	purchase p=new purchase();
	p.display();
}
}
