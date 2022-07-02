package defaultpackage;
class Data
{
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class privateclass {
public static void main(String args[])
{
	Data d=new Data();
	d.setName("Hello..");
	System.out.println(d.getName());
}
}
