package datastructures;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
	
	public static void main (String[] args) {
		// This method will read data from a CSV file
		
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Users\\rmorency\\eclipse-workspace\\files\\account.csv";
		String dataRow;
		
	
			// 1 . Open the file
		  try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			// 2 . Read the data as long as it's not empty
			while ( (dataRow = br.readLine()) != null ) {
				
				//Parse the data by coma
				String[] line = dataRow.split(",");
				// Add data to collection
				data.add(line);
			}
			//close the file
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		  
		 for (String[] account : data ) {
			 System.out.print("[ ");
			 for (String field : account) {
				 System.out.print(field + " ");
			 }
			 System.out.println(" ]");
		 }
		  //2 . Read the file as long as we have data in
		  
		  
		
	}

}
