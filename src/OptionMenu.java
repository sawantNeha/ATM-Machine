
 
	import java.text.DecimalFormat;                                                                             
	import java.util.HashMap;                                                                                   
	                                                                                                            
	import java.util.Scanner;                                                                                   
	                                                                                                            
	                                                                                                            
	public class OptionMenu extends Account  {                                                                 
		Scanner input =new Scanner(System.in);   
//		Account account = new Account();
		SavingAccount savingAcc = new SavingAccount();
		CurrentAccount currentAcc = new CurrentAccount();
		DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");                                           
		                                                                                                        
		HashMap<Integer,Integer>data=new HashMap<Integer,Integer>();                                            
		                                                                                                        
		//validate login information customer number and pin number                                             
		                                                                                                        
		public void getLogin() {                                                                                
			int x=1;                                                                                            
			do {                                                                                                
				try {                                                                                           
				data.put(818096626, 4800);                                                                      
				data.put(90966184, 9799);                                                                       
				System.out.println("Welcome to the ATM Mashine");                                               
				System.out.println("Enter your Customer number:");                                              
				SetCustomerNumber(input.nextInt());                                                             
				System.out.println("Enter your pin number: ");                                                  
				SetPinNumber(input.nextInt());                                                                  
				                                                                                                
			}catch(Exception e) {                                                                               
				System.out.println("Invalid Character Enter only number");                                      
				x=2;                                                                                            
			}                                                                                                   
				//for(Entry<Integer, Integer>entry=(Entry<Integer, Integer>) data.entrySet()) {                 
					//if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()) {             
					//	getAccountType();                                                                       
					//}                                                                                         
				int cn=getCustomerNumber();                                                                     
				int pn=getPinNumber();                                                                          
				if(data.containsKey(cn) && data.get(cn)==pn) {                                                  
					getAccountType();  
					
				}       
				System.out.println("\n"+"Wrong Costomer Number");
				                                               
		  }while(x==1);   
		}                                                                                                   
        
		int selection;                                                                                      
		                                                                                                    
		//display account type                                                                                                                                                                              
		public void getAccountType() {  
                                                                    
			System.out.println("Select the Account you want to access");                                    
			System.out.println("Type 1: Checking Account");                                                 
			System.out.println("Type 2: Saving Account");                                                   
			System.out.println("Type 3:Exit");                                                              
			System.out.println("Choice: ");                                                                 
			selection=input.nextInt();                                                                      
			                                                                                                
			switch(selection) {                                                                             
			case 1:                                                                                         
				getChecking();                                                                              
				break;                                                                                                                                                                                
			case 2:                                                                                         
				getSaving();                                                                                
				break;                                                                                      
			case 3:                                                                                         
				System.out.println("Collect your card"+"\n"+"Thank for using this ATM");                                       
			default:                                                                                        
				System.out.println("Invalid choice:"+"\n");                                                 
				getAccountType();                                                                           
			}                                                                                               
		                                                                                                    
		}                                                                                                   
		
		
		//display checking account menu                                                                                                                                                                         
		public void getChecking() {                                                                         
				System.out.println("Checking Account");                                                     
				System.out.println("Type 1: View Balance ");                                                
				System.out.println("Type 2: Deposit funds");                                                
				System.out.println("Type 3: Withdraw Funds"); 
				System.out.println("Type 4: MiniStatement");
				System.out.println("Type 5: Exit");                                                          
				System.out.println("Choice: "+"\n");                                                        
				selection=input.nextInt();                                                                  
				                                                                                            
				switch(selection) {                                                                         
				case 1:                                                                                     
					currentAcc.getCurrentAccountBalance();
					getChecking();                                                                                                                                                   
					break;                                                                                  
				case 2:                                                                                     
					currentAcc.getCurrentDepositInput();                                                           
					getChecking();                                                                                                                                               
					break;                                                                                  
				case 3:   
					currentAcc.getCurrentWithdrawalInput();                                                             
					getChecking();                                                                                                                                              
					break;
				case 4:
					currentAcc.getCurrentStatment();
					getChecking(); 
					break;
				case 5:                                                                                     
					System.out.println("Collect your card "+"\n"+ "Thank for using this ATM !!\n");
					getAccountType();
					break;                                                                                  
				default:                                                                                    
					System.out.println("Invalid choice:"+"\n");                                             
					getChecking();                                                                                                                                                   
				}                                                                                           
			}                                                                                               
		                                                                                                    
		                                                                                                    
		//display saving account menu                                                                       
		public void getSaving() {                                                                           
			System.out.println("Saving Account");    
			System.out.println("Type 1: View Balance ");                                                                   
			System.out.println("Type 2: Deposit funds");                                                                  
			System.out.println("Type 3: Withdraw funds");
			System.out.println("Type 4: MiniStatement");
			System.out.println("Type 5: Exit");                                                                             
			System.out.println("Choice: "+"\n");                                                                           
			selection=input.nextInt();                                                                                     
			                                                                                                               
			switch(selection) {                                                                                            
			case 1:                                                                                                        
				savingAcc.getSavingAccountBalance();                
				getSaving();                                                                                               
				break;                                                                                               
			case 2:                                                                                                        
				savingAcc.getSavingDepositInput();                                                                                
				getSaving();                                                                                               
				break;                                                                                                     
			case 3:           
				savingAcc.getSavingWithdrawalInput();	                                                                                  
				getSaving();                                                                                               
				break; 
			case 4:
				savingAcc.getSavingStatement();
				getSaving();
				break;
			case 5:                                                                                                        
				System.out.println("Collect your card"+"\n"+"Thank for using this ATM !!\n");    
				getAccountType();
				break;                                                                                                     
			default:                                                                                                       
				System.out.println("Invalid choice:"+"\n");                                                                
				getSaving();                                                                                                  
		}                                                                                                                  
	  }

		
}
