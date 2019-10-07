package Excercise7_0;
import java.util.*;
public class Customer {
	
	String nbr;
	String name;
	//Account acc;
	public ArrayList <Account> acc= new ArrayList<Account>();

	Customer()
	{
		
	}
	Customer(String nbr,String name){
		this.nbr=nbr;
		this.name=name;
		//this.acc=acc;
		
	}
	public String getNbr() {
		return nbr;
	}
	public void setNbr(String nbr) {
		this.nbr = nbr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addAccount(Account a)
	{
		acc.add(a);
	    
	}
	

}
