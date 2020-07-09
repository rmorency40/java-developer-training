package oop;

public class CDAccount extends Bankaccount implements IRate {
	
	String interestRate;
	
	void compound() {
		System.out.println("compounding interest");
	}

}
