package threads;

public class mainb1 {
public static void main(String args[]) throws InterruptedException
{
	counter c=new counter();
	Runnable t=()->
	{
		c.count(1000);
	};
	Runnable t1=()->
	{
		c.count(1000);
	};
	Thread thread=new Thread(t);
	Thread thread1=new Thread(t1);
	thread.start();
	thread1.start();
	thread.join();
	thread.join();
	System.out.println(c.count);
}
}
