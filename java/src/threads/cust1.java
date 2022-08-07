package threads;

	public class cust1 {
		int amount=1000; //instance variable
		public synchronized void deposit(int amount)
		{
			this.amount+=amount; //iv amt=iv amt+lv amt 
			System.out.println("Deposit Completed");
			notify();
		}
		public synchronized void withdrawal(int amount)throws InterruptedException
		{
			if(this.amount<amount)
			{
				System.out.println("Insufficient Balance");
				wait();
			}
			this.amount-=amount; //iv amt=iv amt-lv amt 
			System.out.println("Withdrawal Completed");
		}
		}



