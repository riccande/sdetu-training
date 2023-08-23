package ObjectOrientedProgramming;

public class Person {
	
	public static void main(String[] argStrings) {

	Person joe = new Person();
	joe.walking("Joe");
	joe.sleeping("joe");
	joe.eating("joe");
	joe.eating("joe", "steak");
	
	System.out.println("_".repeat(20));
	
	Person sarah = new Person();
	sarah.walking("sarah");
	sarah.sleeping("sarah");
	sarah.eating("sarah");

	}
	//instance attributes, variables, adjectives, descriptors
	String name;
	String email;
	String phone;
	
	//static belongs to the class not the instance
	//final means it cannot be changed
	static final int arms = 2;
	
	//constructors:  unique methods
	//1. used to define, setup, or initialize properties for an
	//object
	//2. constructors are IMPLICITLY called upon instantiation
	//3. The same name as the class itself
	//4. Constructors have no return type.
	
	
	public Person() {
		System.out.println("new account created");
		System.out.println("_".repeat(30));
		
	}
	
	//action, activity, behavior
	public void walking(String name) {
	System.out.println(name + " is walking.");
	
	}
	
	//action, activity, behavior
	public void eating(String name) {
	System.out.println(name + " is eating.");
	
	}
	
	//action, activity, behavior
	public void sleeping(String name) {
	System.out.println(name + " is sleeping.");
	
	}
	
	//overloading: method with same name but different arguments
	//can overload and constructors(constructors are required methods)
	public void eating(String name, String food) {
		System.out.println(name + " is eating " + food + ".");
	}

}
