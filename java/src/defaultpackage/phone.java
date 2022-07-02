package defaultpackage;
class mobile
{
	void calling()
	{
		System.out.println("Calling");
	}
}
public class phone extends mobile{
		void calling()
		{
			System.out.println("Calling by Samsung");		
	    }
	void camera()
	{
		System.out.println("Photos and videos");
	}
public static void main(String args[])
{
	mobile m=new phone();
	phone P=(phone)m;
	P.calling();
	P.camera();
}
}
