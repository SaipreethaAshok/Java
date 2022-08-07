package threads;

public class demo1 extends Thread {
public void run()
{
	for(int i=0;i<5;i++)
	{
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		/*{
			System.out.println(e);
		}*/
		
	}
		System.out.println("Hi...");
}
}
}
