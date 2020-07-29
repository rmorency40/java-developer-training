package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountStatement {

	public static void main(String[] args) {
		
		List<String[]> statement_data = new ArrayList<String[]>();
		String filename = "C:\\Users\\rmorency\\eclipse-workspace\\files\\credit_card_statement.csv";
		String dataRow;
		String accountBalance;
		
		
		
		try {
			// Open the file credit_card_statement
			BufferedReader br = new BufferedReader (new FileReader(filename));
			//Read the file credit_card_statement
			while ((dataRow = br.readLine()) != null) {
				//Parse every row in the file by coma
				
				String[] line = dataRow.split(",");
				
				// Add every line of the file to the collection
				
				statement_data.add(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
          for (String[] statement : statement_data) {
        	  System.out.print("[ ");
        	  for (String field : statement ) {
        		  System.out.print(field + " ");
        	  }
        	  System.out.println(" ]");
          }
	}

}
