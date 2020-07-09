package labs;

public class BankAccountApp {
	
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("123540987",  1000);
		BankAccount acc2 = new BankAccount("453540987", 2000);
		BankAccount acc3 = new BankAccount("593540987", 2500);
		
		acc1.setName("Jim Luis");
		System.out.println(acc1.getName());
		acc1.makeDeposit(5000);
		acc1.payBill(1500);
		acc1.accrue();
		System.out.println(acc1.toString());
	
	}

}

class BankAccount implements IInterest {
	
	//Properties of Bank Account
	
	private static int ID = 1000;  // Internal ID , the ID should be unique
	private String accountNumber; // ID + random 2 digits number  + first 2 digits of the SSN
	private static final String routingNumber = "000450098";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructors
	
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
		
		
	}
	
	private void setAccountNumber() {
		
		//Generate the 2 digits number
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your account number " +accountNumber);
		
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
    
	public void payBill(double amount) {
		System.out.println("Paying Bill $ " + amount);
		balance = balance - amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making Deposit $ " +amount);
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Your Balance is: $ " +balance);
	}

	@Override
	public void accrue() {
		balance = balance  * (1 + (rate/100));
		showBalance();
		
	}
	//Override
	
	public String toString() {
		return "{ Name: " +name+ "}\n{ Account Number: " +accountNumber + "}\n" + "{ Routing Number: " +routingNumber+ "}\n" + "{ Balance:$ " +balance+ "}";
	}
	
}