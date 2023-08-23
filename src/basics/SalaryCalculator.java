package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//create a variable to define career
		//compute annual salary
		//rate*hoursPerWeek*weeksPerYear
		
		String career;
		double rate = 30.00;
		career = "software developer";
		
		System.out.println("My career is " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		System.out.println("My annual salary is $" + 
		rate*hoursPerWeek*weeksPerYear);
	}

}
