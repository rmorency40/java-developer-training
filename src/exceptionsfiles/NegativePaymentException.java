package exceptionsfiles;

public class NegativePaymentException extends Exception {
	// Defien class variable
	double payment;

	  // 1 - Constructor that would throw the exception
	// 2 - Assign value of local variable to class variable
	public NegativePaymentException(double payment) {
		this.payment =  payment;
		
	}
	// Override the toString method to include the specific exception message
	public String toString() {
		return "Error: can't take  negative payment " + payment;
	}
}
