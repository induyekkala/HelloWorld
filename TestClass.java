package Excercise7_0;

import java.util.Scanner;


class TestClass
{
public static void main(String args[]) {  
	 
	Scanner input=new Scanner(System.in);
	AccountRegister accountRegister=new AccountRegister();
	String customerNbr,customerName,accountNbr;
	Account account=new Account();
	double amount;
	for(int i=0;i<2;i++)
	{
	
	System.out.println("Enter Customer NBR: ");
        customerNbr = input.next();
        System.out.println("Enter Customer Name ");
        customerName = input.next();
        System.out.println("Enter Customer account NBR ");
        accountNbr = input.next();
        System.out.println("Enter Customer amount balance ");
        amount = input.nextDouble();
        Customer customer =new Customer(customerNbr,customerName);
   
        account=new Account(accountNbr,amount,customer);
        accountRegister.add(account);
        System.out.println("Accounts added");
     
	}
	
	
	 char p=' ';
		  
		  do {
			  System.out.println("----MENU-----");
				System.out.println(" 1.Find Account"+"\n"+"2.Transfer");
				System.out.println("Enter your choice ");
				
				 int ch=input.nextInt();
				
				switch(ch)
				{
				
				case 1:
			         	System.out.println("Enter Customer account Number ");
				    String customerNumber = input.next();
				   account= accountRegister.find(customerNumber);
				   System.out.println(account);
				   if(account!=null)
					   System.out.println("accound is exist");
					   
						break;
				case 2:
					System.out.println("Enter Customer account Number from which it is to be transfered");
				    String accountNumber1 = input.next();
				    System.out.println("Enter Customer account Number from which it is to be credited");
				    String accountNumber2 = input.next();
					accountRegister.transfer(accountNumber1,accountNumber2);
				break;
						
			
				default:System.out.println("wrong choice");
				break;
				
				}
			System.out.println("\nwould want to continue or not press Y to continue else N to exit");
			 
			p=input.next().charAt(0);	
			 
			System.out.println("\n");
				
			}while(p!='n');
	
	
}
	    
	    
	}