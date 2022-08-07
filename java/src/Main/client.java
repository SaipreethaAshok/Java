package Main;
import BankFramework.BankFactory;
import Bank_Application.MMBankFactory;
import Bank_Application.MMCurrentAcc;
import Bank_Application.MMSavingAcc;
import BankFramework.CurrentAcc;
import BankFramework.SavingAcc;

public class client {
	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(1001,"Preetha",8000);
		sa.withdraw(1000);
		CurrentAcc ca=new MMCurrentAcc(1002,"Nick",5000);
		ca.withdraw(1000);
	}

}
