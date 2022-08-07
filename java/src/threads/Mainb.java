package threads;

public class Mainb {

	public static void main(String[] args) throws InterruptedException {
		customer c=new customer();
		Runnable t=()->
		{
			c.withdrawal(500);
		};
		Runnable t1=()->
		{
			c.deposit(1500);
		};
		/*new Thread(t).start();
		new Thread(t1).start();
		System.out.println(c.amount);*/
		Thread thread=new Thread(t);
		Thread thread2=new Thread(t1);
		thread.start();
		thread2.start();
		thread.join();
		thread2.join();
		System.out.println(c.amount);
	}

}
