package threads;

public class customer {
int amount=1000; //instance variable
public void deposit(int amount)
{
	this.amount+=amount; //iv amt=iv amt+lv amt 
	System.out.println("Deposit Completed");
}
public void withdrawal(int amount)
{
	this.amount-=amount; //iv amt=iv amt-lv amt 
	System.out.println("Withdrawal Completed");
}
}
