/**
		
		Create a Student Database with the following attributes:
			- New Student constructor that takes name and SSN in the arguments
			- Automatically create an email ID based on the name
			- Set a private static ID
			- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
			- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
			- Use encapsulation to set variables (phone, city, state
					
					**/


package tutorial;

public class lab2 {

	public static void main(String[] args) {
		//Create a student
		
		Student student1 = new Student("Janelle", "103-89-4567");
		Student student2 = new Student("Jesula", "234-89-4569");
		Student student3 = new Student("Rony", "908-89-4500");
		
		student1.enroll("Math501");
		student1.enroll("English101");
		student1.enroll("Algebra102");
		
		student1.showCourses();
		student1.checkBalance();
		student1.payTuition(600);
		System.out.println(student1.toString());
		

	}

}

class Student {
	
	private static int ID = 1000;
	private String userID;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costCourse = 800;
	private int balance = 0;
	
	//Constructor
	
	public Student(String name, String ssn) {
		ID++;
		this.name = name;
		this.ssn = ssn;
        setUserID();
		setEmail();
		
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private void setEmail() {
		email = name.toLowerCase() + "." +ID+ "@studentuniversity.com";
		System.out.println("Your email : " + email);
		
	}
	
	private String getEmail() {
		return email;
		
	}
	
	
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int  randomNum = (int) (Math.random() * (max -min));
		randomNum = randomNum  + min;
	   userID = ID +""+ randomNum+"" + ssn.substring(7);
	   System.out.println("Your userID: "+ userID);
		
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		balance = balance + costCourse;
		
		
	}
	
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment of : $ "+amount);
		checkBalance();
		
	}
	public void checkBalance() {
		System.out.println("Your balance: $ " +balance);
		
	}
	
	public String  toString() {
		return "{Name: " +name+ "}\n{Courses: "+courses+ "}\n{Balance: $ "+balance+" }";
		
	}
	
	public void showCourses() {
		System.out.println(courses);
		
	}
}