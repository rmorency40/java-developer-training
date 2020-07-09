package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("The program is starting ...");
		System.out.println(" ");
		printName();
		int numA = 10;
		int numB =  20;
		int product = multiplyNumbers(numA, numB);
		addNumbers(numA, numB);
		//System.out.println("The product  of  numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
		System.out.println("The product  of  numbers " + numA + " and " + numB + " is " + product );
	}
	static  void printName() {
		System.out.println("My name is Rony");
	}
	
	static void addNumbers(int numberA, int numberB) {
		//This function add 2 numbers
		
		int sum =  numberA + numberB;
		System.out.println("The sum of numbers : " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product + 100, product);
		return product;		
				
		
	}
	
   
}
