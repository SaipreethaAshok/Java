package threads;
class Mythread extends Thread
{
	public void run()
	{
		System.out.println("Throwing in"+"MyThread");
		throw new RuntimeException();
	}
}
public class threadexceptionex {
public static void main(String args[])
{
	Mythread t=new Mythread();
	t.start();
	try
	{
		Thread.sleep(1000);
	}
	catch(Exception e)
	{
		String x = null;
		System.out.println("Caught it"+x);
	}
	System.out.println("Exiting main");
}
}
