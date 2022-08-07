package threads;

public class main {
public static void main(String args[]) throws InterruptedException
{
	Thread thread=new demo();
	Thread thread1=new demo1();
	thread.start();
	thread1.start();
	thread.join();
	thread1.join();
	System.out.println("Hello World...!");
}
}
