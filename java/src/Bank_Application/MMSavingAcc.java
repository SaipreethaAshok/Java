package Bank_Application;
import BankFramework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	public MMSavingAcc(int accNo, String accname, int accBal) {
		super(accNo,accname,accBal);
	}
	public void withdraw(float accBal)
	{
		System.out.println("You have total savings amount "+accBal);
	}
	public String toString()
	{
		return "MMSavingAcc [isIsSalary()="+isIsSalary() + 
				",toString()="+super.toString()+",getAccno()="+getAccNo()+",getAccname()="+getAccname()+",getAccBal()="+getAccBal()+"]";
	}

}
