package defaultpackage;

public class callbyvalue {
	int data=50;
	int change(int data)
	{
		data=data+100;
		return data;
	}
	public static void main(String args[])
	{
		callbyvalue cv= new callbyvalue();
		System.out.println("Before Change "+cv.data);
		cv.data=cv.change(500);
		System.out.println("After Change "+cv.data);
	}
}
