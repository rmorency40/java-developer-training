package oop;

public class BankaccountApp {

	public static void main(String[] args) {
		// Create a new bank account and instanciate objects
		
		Bankaccount acc1 = new Bankaccount();
		
		// acc1.name = "Joe";
		// with encapsulation : public API method
		
		System.out.println(" This is how we do encapsulation");
		acc1.setName("Joe Eli");
		System.out.println(acc1.getName());
		
		System.out.println("Print the SSN after encapsulation");
		acc1.setSsn("550-450-2910");
		System.out.println("SSN is: " +acc1.getSsn());
		System.out.println("calling Interface methods  ... ");
		
		acc1.accountnumber = " 010306";
		
		//Calling on method implement in the Interface
		
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.balance = 10.000;
		
		// Polymorphism through overwritting 
		
		System.out.println(acc1.toString());
		
		System.out.println(" " );
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(15000);
		acc1.withdrawal(2000);
		
	
		
		//Polymorphism through overloading 
		
		Bankaccount acc2 = new Bankaccount("CHECKING ACCOUNT");
		acc2.accountnumber = "090806";
		
		Bankaccount acc3 = new Bankaccount("SAVING ACCOUNT" , 5000.00);
		acc3.accountnumber = "080704";
		
		acc3.checkBalance();
		//System.out.println(acc1.routingnumber);
		//System.out.println(acc2.routingnumber);
		//System.out.println(acc3.routingnumber);
		
		//Demo for Inheritance
		
		 /*CDAccount cd1 = new CDAccount();
		cd1.balance = 3000.0;
		cd1.name = "Juan";
		cd1.accountnumber = "090706";
		cd1.interestRate = "3.25";
		cd1.accountType = "CD Account";
		System.out.println("========== This is for DC account demo");
		System.out.println(cd1.toString());
		cd1.compound(); */
		
		// FOr motivation purpose
		
		System.out.println(" ");
		String name = " Rony ";
		String lastname =  "MORENCY";
		System.out.println(name + lastname + " is a senior Java developer!");

	}

}
