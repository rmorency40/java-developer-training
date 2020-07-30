package algorithms;

public class Demo {

	public static void main(String[] args) {
		
		int[] numbers = {10, 25, 433, 26, 73, 132, 5};
		int[] sortedNumbers = {5, 9, 12, 18, 21, 26, 29, 35, 39, 43, 49, 51, 58, 59, 61, 72, 88, 91, 94};
		
		//Unsorted list of numbers
		
		//int[] listOfNumbers = {10, 5, 9, 30, 65, 90, 56, 87, 0, 23, 18, 59, 34, 75, 56, 13, 18, 99, 45, 38, 29, 33};
		
		
		// Call the linearSearch function that seraches for a specific number
		int  pos = algorithms.Search.linearSearch(numbers, 73);
		System.out.println("Found at position " + pos );
		
		// Call the bnarySearch function
		System.out.println("\n");
		int index = algorithms.Search.binarySearch(sortedNumbers, 61, 0, sortedNumbers.length - 1);
		System.out.println("Found at position " + index);
	}
	

}
