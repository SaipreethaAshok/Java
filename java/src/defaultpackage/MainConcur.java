package defaultpackage;

public class MainConcur implements Runnable {
public void run()
{
	System.out.println("Thread is running..");
}
public static void main(String args[])
{
	MainConcur task=new MainConcur();
	Thread t1=new Thread(task);
	t1.start();
}
}
