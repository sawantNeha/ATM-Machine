import java.util.Map;

public class SavingAccount extends Account{
	
	
		//total account balance
		public void getSavingAccountBalance() {
			System.out.println("saving account balance :"+moneyFormat.format(savingAccount));
		}
	
		//calculate saving balance account withdrawal
		public  double calcSavingWithdrawal(double amount) 
		{
			savingAccount = savingAccount - amount;
			return savingAccount;
		}
		
		//calculate saving account deposit
		public double calcSavingDeposit(double amount)
		{
			savingAccount = savingAccount + amount;
			return savingAccount;
		}
		
		//customer saving account withdrawal input
		public  void getSavingWithdrawalInput()
		{
			System.out.println("saving account balance :"+moneyFormat.format(savingAccount));
			System.out.println("Amount you want to withdraw from saving Account :");
			
			double amount=input.nextDouble();
			if(amount<=0)
			{
				System.out.println("Balance cannot be negative");
			}else if(savingAccount<=amount)
			{
				System.out.println("Insuficient balance");
			}else
			{
				ministmt.put(amount, "Amount Withdrawal");
				calcSavingWithdrawal(amount);
				System.out.println("Withdrawal Successfull !!");
				System.out.println("New saving account balance :"+moneyFormat.format(savingAccount));
			
			}
		}
		public void getSavingDepositInput() 
		{
			System.out.println("saving account balance :"+moneyFormat.format(savingAccount));
			System.out.println("Amount you want to deposit from saving Account :");
			
			double amount=input.nextDouble();
			if(amount<=0)
			{
				System.out.println("Balance cannot be nagative");
			}else
			 {
				ministmt.put(amount, "Amount deposited ");
				calcSavingDeposit(amount);
				System.out.println("Deposited Successfull !!");
				System.out.println("New saving account balance: "+moneyFormat.format(savingAccount));
			 }

       }
		public void getSavingStatement() 
		{
			for(Map.Entry<Double, String>m:ministmt.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}

}
