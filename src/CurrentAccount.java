import java.util.Map;

public class CurrentAccount extends Account {
	
		//total account balance
		public void getCurrentAccountBalance() {
			System.out.println("Current account balance :"+moneyFormat.format(currentAccount));
		}
	
		//calculate checking account withdraw
		public double calcCurrentWithdrawal(double amount)
		{
			
			currentAccount = currentAccount - amount;
			
			return currentAccount;
		}
		//calculate checking account deposit
		
		public double calcCurrentDeposit(double amount)
		{
			currentAccount = currentAccount + amount;
			return currentAccount;
		}
		//customer checking account withdrawal input
		public void getCurrentWithdrawalInput() 
		{
			System.out.println("Checking account balance :"+moneyFormat.format(currentAccount));
			System.out.println("Amount you want to withdraw from checking balance:  ");
			
			double amount=input.nextDouble();
			if(amount<=0) 
			{
				System.out.println("Amount cannot be negative");
			}else if(currentAccount<=amount)
			{
				System.out.println("Insufcient balance");
			}else
			 {
				ministmt.put(amount, "Amount Withdrawal");
				calcCurrentWithdrawal(amount);
				System.out.println("Withdrawal Successfull !!");
				System.out.println("New checking account balance: "+moneyFormat.format(currentAccount));
			} 
				
	      }
		//customer checking account deposit input
		public void getCurrentDepositInput() 
		{
			System.out.println("Checking account balance :"+moneyFormat.format(currentAccount));
			System.out.println("Amount you want to deposit from checking balance :");
					
			double amount=input.nextDouble();
					
			  if(amount<=0)
				{
					System.out.println("Balance cannot be negative "+"\n");
						
				}else 
				{
					ministmt.put(amount, "Amount deposited");
					calcCurrentDeposit(amount);
					System.out.println("Deposited Successfull !!");
					System.out.println("New checking account balance :"+moneyFormat.format(currentAccount));
				}
			
		}
		public void getCurrentStatment() 
		{
			for(Map.Entry<Double, String>m:ministmt.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}

}
