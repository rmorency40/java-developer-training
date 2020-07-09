package basics;

public class Weather {
	public static void main(String[] args) {
	 // This program will give suggestions of what to wear based on weather (Tempeture)
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant, wear shorts and t-shirt");
			
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler, Perhaps wear a long sleeve shirt and jean.");
			System.out.println("Wear a hat to keep the sun out of your eyes");
			
		}
		else if ((temperature > 50) ||  (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure your wear a warmer clothes.");
		}
		else {
			System.out.println("Loks like a cool day, wear a sweater.");
		}
		System.out.println("The program is ending.");
	}

}
