package lab2;

public class Student {
//	Create a Student Database with the following attributes:
//		 New Student constructor that takes name and SSN in the arguments
//		 Automatically create an email ID based on the name
//		 Set a private static ID
//		 Generate a user ID that is combination of Static ID, random 4-digit number between 1000 
//		and 9000, and last 4 of SSN
	
	public static void main(String[] args) {
		Student stu1 = new Student("John", "250338888"	);
		stu1.enroll("7384444", "Brooklyn", "NY");
		Student stu2 = new Student("James", "250999888"	);
		stu2.enroll("7384444", "Austin", "TX");
		Student stu3 = new Student("Jim", "250377788"	);
		stu3.enroll("7384444", "Charlotte", "NC");

	}

	private String name;
	private String SSN;
	private String email;
	private static int ID;
	private int studentID;
	private String phone;
	private String city;
	private String state;
	private double accountBalance;
	
public Student(String name, String SSN) {
	this.name = name;
	this.SSN = SSN;
	this.email = name + "@gmail.com";
	studentID =   ID + (int)Math.random()*90000 + Integer.parseInt((SSN.substring(4)));
	ID++;
}

// Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
// Use encapsulation to set variables (phone, city, state)
public void enroll(String phone, String city, String state) {
	this.phone = phone;
	this.city = city;
	this.state = state;
	System.out.println(name.toUpperCase() + " is now enrolled.");
	System.out.println("Student ID: " + studentID);
}
public void pay(Double tuitionAmount) {
	accountBalance =-tuitionAmount;
}

@Override
public String toString() {
	return "Student [name=" + name + ", SSN=" + SSN + ", email=" + email + ", phone=" + phone + ", city=" + city
			+ ", state=" + state + ", accountBalance=" + accountBalance + "]";
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

	
}
