package algorithms;

public class Sort {
	
	public static void bubbleSort(int[] dataSet) {
		System.out.println("Original array: \n");
		printArray(dataSet);
		boolean swapped;
		do {
			    swapped = false;
				for (int i = 0; i < dataSet.length - 1; i++) {
					if (dataSet[i] > dataSet[i + 1]) {
						int temp = dataSet[i];
						dataSet[i] = dataSet[i + 1];
						dataSet[i + 1] = temp;
						printArray(dataSet);
						swapped = true;	
					}
				}
		} while	(swapped);
	}
 private static void printArray(int[] arr) {
	 //System.out.println("SWAP ");
	 for (int i : arr ) {
		 System.out.print(i + " ");
	 }
	 System.out.println();
 }
}
