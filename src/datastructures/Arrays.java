package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String [] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h"};
		System.out.println("The old fashion way ");
		for (int i = 0; i < 8; i++) {
			System.out.print(alphabet[i] + " ");
		}
		System.out.println("\nUsing length  variable ...");
		int size = alphabet.length;
        for (int i = 0; i < size; i++) {
        	System.out.print(alphabet[i] + " ");
        }
        System.out.println("\n\nUsing the for each statement");
        
        for (String letter: alphabet) {
        	System.out.print(letter + " ");
        }
        System.out.println("\n\ndouble arrays");
        
        String[][] users = {
        		{"John","Dee", "jd@gmail.com","5107861055"},
        		{"ron","Maurice","rm@testemail.com","8908765656"},
        		{"Sarah","Morency","sm@gmail.com","9085678943"}
        		};
        //Get the size of array
        int numOfusers = users.length;
        int numOffields = users[0].length;
        System.out.println("Nunber of Users " +numOfusers);
        System.out.println("number of fields " + numOffields);
        
        //Traverse the double arary
        
        System.out.println("\n\nusing 2 for loop\n");
        
        for (int i = 0; i < numOfusers; i++) {
        	System.out.print("[ ");
        	for (int j = 0; j < numOffields; j++) {
        		System.out.print(users[i][j] + " ");
        	}
        	System.out.println(" ]");
        }
        
        System.out.println("\n\nusing 1 for loop but a bit complicated\n");
        
        for (int i = 0; i < numOfusers; i++) {
        	String firstname = users[i][0];
        	String lastname = users[i][1];
        	String email = users[i][2];
        	String phonenumber = users[i][3];
        	System.out.println(firstname + " " + lastname + " " + email + " " + phonenumber);
        	
        	//for (int j = 0; j < numOffields; j++ ) {
        		
        	//}
        }
        
        // Using for each to make it simple
        
        System.out.println("\n\nUsing for each loop");
        for (String[] user : users) {
        	System.out.print("[ ");
        	for (String field : user) {
        		System.out.print(field + " ");
        	}
        	//System.out.print(" ]" + "\n");
        	System.out.println(" ]");
        }
        }
	}


