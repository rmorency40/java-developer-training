package basics;

public class Strings {

	public static void main(String[] args) {
		String booktitle;
		booktitle = "The lord of the Rings";
		String wordchoice = "Rings";
		
		if ( booktitle.contains(wordchoice)) {
			System.out.println("The book contains the word: " +wordchoice);
			
		}	
       String browser = "chrome";
       if (browser.equalsIgnoreCase("chrome")) {
    	   System.out.println("The browser is chrome");
       }
       
       String firstname = "Rony";
       String lastname = "Morency";
       String SSN = "012-01-2020";
       //Print the  initial and the last 4 digits of the  social security number
       System.out.println(" ");
       System.out.print (firstname.substring(0,  1));
       System.out.print(lastname.substring(0,  1));
       System.out.println(SSN.substring(7));
       
       
       //Sample while loop 
       System.out.println("Testing while loop again **********************");
       boolean condition = true;
       
       while(condition) {
    	   System.out.println("while loop tests conditon first before entering ...");
    	   if (condition) {
    		   condition = false;
    	   }
         } 
    	   
       
	}

}
