package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat( ) {
		System.out.println(email);
	}
	void slep( ) {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		//instanciate an object 
		Person person1 = new Person();
		Person person2 = new Person();
		
		// define properties
		person1.name = "Joe";
		person1.email = "joe@gmail.com";
		person1.phone = "123456789";
		
		person2.name = "Sarah";
		person2.email = "sarah@gmail.com";
		person2.phone = " 435678901";
		
		//Abstraction
		
		person1.walk();
		person1.slep();
		person1.eat();
		
		System.out.println(" ");
		System.out.println("*********************");
		System.out.println(" ");
		
		person2.eat();
		person2.slep();
		person2.walk();
		//Person
		//attributes,variables, adjectives , descriptors
		//String name = "Joe";
		//String email = "joe2020@gmail.com";
		//String phone = "123456789";
		
		//Action, behaviour
		//System.out.println(name + " is walking");
		//System.out.println(name + " is eating");
		
		//What if we want to do this
		
		//attributes,variables, adjectives , descriptors
		//String name1 = "Sarah";
		//String email1 = "joe2020@gmail.com";
		//String phone1 = "12345645319";
		//System.out.println(" ");		
		//Action, behaviour
		//System.out.println(name1 + " is walking");
		//System.out.println(name1 + " is eating");
		
	}
	
	//Enhance the above by adding a function
	

}
