import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Account {
	
	Scanner input =new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	Map<Double,String>ministmt=new HashMap<>();
	
	public int pinNumber;
	public int customerNumber;
	public double currentAccount;
	public double savingAccount;
	
	
	
	//set the customer number
	
	public int SetCustomerNumber(int customerNumber)
	{
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	//get the customer number
	
	public int getCustomerNumber() 
	{
		return customerNumber;
	}
	//set the pin number
	
	public int SetPinNumber(int pinNumber) 
	{
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	//get the pin number
	
	public int getPinNumber() 
	{
		return pinNumber;
	}
	public double getCurrentAccount()
	{
		return currentAccount;
	}

	public double getSavingAccount() 
	{
		return savingAccount;
	}
	//calculate checking account withdraw
	
//	public double calcCurrentWithdrawal(double amount)
//	{
//		
//		currentAccount = currentAccount - amount;
//		
//		return currentAccount;
//		
//}
//	//calculate saving balance account withdrawal
//	
//	public  double calcSavingWithdrawal(double amount) 
//	{
//		savingAccount = savingAccount - amount;
//		return savingAccount;
//	}
//    //calculate checking account deposit
//	
//	public double calcCurrentDeposit(double amount)
//	{
//		currentAccount = currentAccount + amount;
//		return currentAccount;
//	}
//	//calculate saving account deposit
//	public double calcSavingDeposit(double amount)
//	{
//		savingAccount = savingAccount + amount;
//		return savingAccount;
//	}
//	//customer checking account withdrawal input
//	public void getCurrentWithdrawalInput() 
//	{
//		System.out.println("Checking account balance :"+moneyFormat.format(currentAccount));
//		System.out.println("Amount you want to withdraw from checking balance:  ");
//		
//		double amount=input.nextDouble();
//		if(amount<=0) 
//		{
//			System.out.println("Amount cannot be negative");
//		}else if(currentAccount<=amount)
//		{
//			System.out.println("Insufcient balance");
//		}else
//		 {
//			ministmt.put(amount, "Amount Withdrawal");
//			calcCurrentWithdrawal(amount);
//			System.out.println("Withdrawal Successfull !!");
//			System.out.println("New checking account balance: "+moneyFormat.format(currentAccount));
//		} 
//			
//      }
//	
//	//customer saving account withdrawal input
//	public  void getSavingWithdrawalInput()
//	{
//		System.out.println("saving account balance :"+moneyFormat.format(currentAccount));
//		System.out.println("Amount you want to withdraw from saving Account :");
//		
//		double amount=input.nextDouble();
//		if(amount<=0)
//		{
//			System.out.println("Balance cannot be negative");
//		}else if(savingAccount<=amount)
//		{
//			System.out.println("Insuficient balance");
//		}else
//		{
//			ministmt.put(amount, "Amount Withdrawal");
//			calcSavingWithdrawal(amount);
//			System.out.println("Withdrawal Successfull !!");
//			System.out.println("New saving account balance :"+moneyFormat.format(savingAccount));
//		
//		}
//	}
//	//customer checking account deposit input
//		public void getCurrentDepositInput() 
//		{
//			System.out.println("Checking account balance :"+moneyFormat.format(currentAccount));
//			System.out.println("Amount you want to deposit from checking balance :");
//			
//			double amount=input.nextDouble();
//			
//			if(amount<=0)
//			{
//				System.out.println("Balance cannot be negative "+"\n");
//				
//			}else {
//				ministmt.put(amount, "Amount deposited");
//				calcCurrentDeposit(amount);
//				System.out.println("Deposited Successfull !!");
//				System.out.println("New checking account balance :"+moneyFormat.format(currentAccount));
//			}
//	
//		}
//		public void getCurrentStatment() 
//		{
//			for(Map.Entry<Double, String>m:ministmt.entrySet())
//			{
//				System.out.println(m.getKey()+" "+m.getValue());
//			}
//		}
//		//customer saving account deposit  input
//		public void getSavingDepositInput() 
//		{
//			System.out.println("saving account balance :"+moneyFormat.format(currentAccount));
//			System.out.println("Amount you want to deposit from saving Account :");
//			
//			double amount=input.nextDouble();
//			if(amount<=0)
//			{
//				System.out.println("Balance cannot be nagative");
//			}else
//			 {
//				ministmt.put(amount, "Amount deposited ");
//				calcSavingDeposit(amount);
//				System.out.println("Deposited Successfull !!");
//				System.out.println("New saving account balance: "+moneyFormat.format(savingAccount));
//			 }
//
//      }
//		public void getSavingStatement() 
//		{
//			for(Map.Entry<Double, String>m:ministmt.entrySet())
//			{
//				System.out.println(m.getKey()+" "+m.getValue());
//			}
//		}
//	
}
