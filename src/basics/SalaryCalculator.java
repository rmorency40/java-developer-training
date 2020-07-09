package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//Let's create a variable to define our career
		
		// Salary a variable
		String career;
		System.out.println("Program starting ...");
		
		//Define the variable
		career = "Web developper";
		System.out.println("My career :" + career);
		
		//Conpute our salary
		
		//Declare anf define
		int hourPerweek = 40;
		int weekperyear = 50;
		double rate = 65.50;
		
		double salary = (hourPerweek * weekperyear * rate);
		System.out.println("My salary as a " + career + " at the rate of " + rate + " per hour is: " + salary + " per year");
		// rate * hoursPerweeks * numberOfeek
	}

}
