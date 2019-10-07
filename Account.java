package Excercise7_0;

public class Account {
	String nbr;
	double balance;
	Customer customer;
	Account()
	{
		
	}
	
	
	  Account(String nbr,double balance,Customer customer){ 
		  this.nbr=nbr; 
		  this.balance=balance; 
		  this.customer=customer;
		  }
	 
	public String getNbr() {
		return nbr;
	}
	public void setNbr(String nbr) {
		this.nbr = nbr;
	}
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void deposit(double amount)
	{
		double balance=getBalance()+amount;
		System.out.println("amount deposited in the account and current balance is"+balance);
	}
	public void withdraw(double amount) 
	{
		double balance=getBalance()-amount;
		System.out.println("amount withdraw from the account and the current balance is"+balance);
		
	}

}
