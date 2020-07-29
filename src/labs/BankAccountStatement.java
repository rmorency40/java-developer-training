/*
 Read a credit card CSV statement
Creating a balance variable that calculates the running balance of the user’s account
If the field says CREDIT, then add the amount to the balance
If the field says DEBIT, then subtract the amount to the balance
If the final amount is greater than zero, charge a 10% fee and warn the user
If the final amount is zero, thank the user for their payments
If the final amount is less than zero, thank the user for their payment and display their overpayment.




Use this data for your test, or generate your own:

Sep02,CREDIT,CostCo,342.23
Sep09,CREDIT,ATT,93.42
Sep10,CREDIT,Applebees,56.20
Sep11,CREDIT,AppleStore,995.95
Sep12,DEBIT,ACHPayment,500
Sep19,CREDIT,Speedway,35.09
Sep20,CREDIT,McDonalds,12.55
Sep21,DEBIT,ACHPayment,600
Sep26,DEBIT,ACHPayment,250
Sep30,FEE,MasterCard,2.50

 */

package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BankAccountStatement {

	public static void main(String[] args) {

		List<String[]> transactions = new ArrayList<String[]>();
		String filename = "C:\\Users\\rmorency\\eclipse-workspace\\files\\credit_card_statement.csv";
		String dataRow;
		double balance = 0;
		
		
		
		try {
			// Open the file credit_card_statement
			BufferedReader br = new BufferedReader (new FileReader(filename));
			//Read the file credit_card_statement
			while ((dataRow = br.readLine()) != null) {
				//Parse every row in the file by coma
				
				String[] line = dataRow.split(",");
				
				// Add every line of the file to the collection
				
				transactions.add(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("DATE | TRANSACTION | VENDOR | BALANCE");
        for (String[] transaction : transactions) {
        	String date = transaction[0];
        	String type = transaction[1];
        	String vendor = transaction[2];
        	double amount = Double.parseDouble(transaction[3]);
        	System.out.print(date + " | " + type + " | " + vendor + " | $" + amount );
        	
        	if (type.equalsIgnoreCase("credit")) {
        		//System.out.println("Add to balance");
        		balance = balance + amount;
        	}
        	else if (type.equalsIgnoreCase("debit")) {
        		//System.out.println("Substract from balance");
        		balance = balance - amount;
        	}
        	else {
        		//System.out.println("Some other transaction");
        	}
        	System.out.println(" | $" +balance + " ");
        }
       //Check Balance
        
        if (balance > 0) {
        	System.out.println("You have a balance of: " +balance);
        	System.out.println("You are charged a 10% fee which is $" +balance * .10);
        	System.out.println("Your new balance is: $" + (balance + + - balance*.10));
        	
        }
        else if (balance < 0) {
        	System.out.println("Thanks for your payment");
        	System.out.println("You hav eover payment of " + balance);
        }
        else {
        	System.out.println("Thanks for your payment");
        }
	}

}
