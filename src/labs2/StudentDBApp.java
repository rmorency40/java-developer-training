package labs2;

public class StudentDBApp {

	public static void main(String[] args) {
		
		Student student1 = new Student(100);
		
		student1.setStudentFirstName("Jose");
		student1.setStudentLastName("Luis");
		System.out.print("Student Name is: "+student1.getStudentFirstName() + " " + student1.getStudentLastName());
		

	}

}

 class  Student {
	
	//Properties of Student
	
	private static int studentID = 100 ;
	private String studentFirstName;
	private String studentLastName;
	private String SSN;
	private String emailID; //  email ID based on the name
	private String userID;    // user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
	private double balance;

// Constructur Student
	
	public Student(int studentID) {
		studentID = studentID + 101;
		System.out.println("Student ID: " +studentID);
		enroll();
		
	}
	
	private void enroll() {
		//Automatically create email ID based on the name
		String school_domain = "@universitygn.com";
		 emailID = (studentFirstName.substring(0, 1) + "."+studentLastName + school_domain); 
		System.out.println(emailID);
		
		
	}
	
	
    public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public void pay(double amount) {
    	System.out.println("Student payment amout: $ " +amount);
    	balance = balance - amount;
    }
	
    public void checkBalance() {
    	System.out.println("Your Balance is: $ " +balance);
    }
	
	
}
