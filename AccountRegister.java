package Excercise7_0;
import java.util.*;


public class AccountRegister {
	
	Scanner input=new Scanner(System.in);
	private ArrayList<Account> accountList=new ArrayList<Account>();
     
	AccountRegister() {
		
	}
	
	public AccountRegister(Scanner input, ArrayList<Account> accountList,  Account account) {
		super();
		this.input = input;
		
		this.accountList = accountList;
		this.account = account;
	}




	public ArrayList<Account> getAccList() {
		return accountList;
	}




	public void setAccList(ArrayList<Account> accList) {
		this.accountList = accList;
	}


	
	Account account;


	
	
	
	public void add(Account account)
	
	{
	    accountList.add(account);	  
	}
	
	public Account find(String customerNumber) {
		
		  int i=0;
		  Customer customer; 
		  int size=getAccList().size();
		 
		  while(i<getAccList().size()) 
		  { 
			 account=accountList.get(i);
	
		  if(account.getNbr().equals(customerNumber))
		  { 
			  return account;
		  
		  } i++;
		  
		  }
		 
		return null;
	}
		
		
		
	
	
	void whoownsAccount(String customerNumber) {
		
		int i=0;
		boolean accountexist=false;
		 while(i<accountList.size())
		  {
			  account=accountList.get(i);
			  
			  if(account.getCustomer().getNbr().equals(customerNumber) )
			  {
				 
				  accountexist=true;
				  break;
			  }
			  i++;
		  }
		 if(accountexist==false)
		 {
			 System.out.println("Account does'nt exist");
		 }
		
		
	}
	
	void transfer(String customerNumber1,String customerNumber2)
	{
		
		int i=0;
		
		 Account account1,account2;
		 account1=find(customerNumber1);
		 account2=find(customerNumber2);
		 System.out.println("Enter the amount to be transferred from"+account1.getCustomer().getName());
		 double amount=input.nextDouble();
		 
		 double balance1=account1.getBalance();
		 double balance2=account2.getBalance();
		 
		 if(balance1!=0 && balance2!=0)
		 {
			 account1.withdraw(amount);
			 account1.setBalance(balance1-amount);
			 
			 account2.deposit(amount);
			 account2.setBalance(balance2+amount);
			 
			 
		 }
		 else
			 System.out.println(" no enough balance");  
		  
		  
		
		
	}
	
	
	

}
