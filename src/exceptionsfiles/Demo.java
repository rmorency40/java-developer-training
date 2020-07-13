package exceptionsfiles;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program starts  ...");
		doMath(5 , 0);
		System.out.println("Program continue...");
	}
	
	public static void doMath( int a, int b ) {
		answer(a , b);
	}
    public static double answer(int x , int y) {
    	// Cath error here 
    	return x/y;
    }
}
