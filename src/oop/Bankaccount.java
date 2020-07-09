package oop;

public class Bankaccount implements IRate {
	
	String accountnumber;
	
	//static  is belong to the class and not the object instance
	// final constant (often static final )
	private static final String routingnumber = "989007";
	
	//Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance ;
	
	
	//Constructor definition
	//1-  They are used to define /setup / initialize properties ob an object
	//1-  Constructors are IMPLICITELY called upon instanciation of objects
	// 3- They are the same name as the class
	//4-  they don't have return type
	
	Bankaccount() {
		System.out.println(" ");
		System.out.println("NEW ACCCOUNT IS CREATED!");
	}
	
	//Overloading is the fact to call constructor with different argument / parameter
	
	Bankaccount(String accountType ) {
		System.out.println(" ");
		System.out.println("NEW ACCOUNT: " +accountType);
	}
	
	// The same constructor with 2 parameters now
	
	Bankaccount(String accountType, double initDeposit) {
		
		// initDeposit, accountType  and msg are local variables
		System.out.println(" ");
		System.out.println("NEW ACCOUNT: " +accountType);
		System.out.println("INITIAL DEPOSIT OF: " +initDeposit);
		
		String msg = null;
		if (initDeposit < 1000) {
			msg = "ERROR ! Minimum deposit must at leat $ 1.000";
		} else {
			msg = "Thank you for your initial deposit of $ "+initDeposit;
		}
		
		System.out.println(msg);
		balance = initDeposit;
	}
	
	//Getters /Setters
	// Allow the user to define the name
	
	public  void setName(String name) {
		this.name = "Mr " + name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	// Interface method
	
	public void setRate() {
		
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	
	public void deposit(double amount) {
		
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdrawal(double amount) {
		
		balance =  balance - amount;
		showActivity("WITHDRAW");
		
	}
	
	// This method is private so it can be called from within the class
	private void showActivity(String activity ) {
		
		System.out.println("YOUR RECENT ACTIVITY IS : " + activity);
		System.out.println("YOUR NEW BALANCE IS : $ " + balance);
	}
	void checkBalance() {
		System.out.println("Your balance is " + balance);
		
	}
	
	void getStatus( ) {
		
	}

	// overrride toString method
	
	public String toString() {
		return " {NAME " +name + ",ACCOUNT NUMBER " +accountnumber + ",ROUTNING NUMBER " +routingnumber  + " , " + "Balance: $ " + balance +" } " ;
	}
}
