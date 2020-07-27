package datastructures;

public class Matrix {

	public static void main(String[] args) {
		String[][] matrix = { {"a","b","c"},
				                 {"e","f","g"},
				                {"h","i","j"} };
			  
				 for (String[] list : matrix) {
					 for (int i=list.length-1;i>=0;i--) {
						 System.out.print(list[i]);
			  }
			 }


	}

}
