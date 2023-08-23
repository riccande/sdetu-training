package basics;

import java.util.concurrent.LinkedBlockingDeque;

public class Lab1BasicsOfProgramming {

	public static void main(String[] args) {

		int n = 0;
		System.out.println(sum(4));
		
		System.out.println("_".repeat(10));
		
		System.out.println(factorial(6));		
		
		System.out.println("_".repeat(10));
		
		double[] cost = {9,5,9,2,2,3,4,5,6};
		
		System.out.println(avg(cost));	
		
		System.out.println("_".repeat(10));
		
		System.out.println(min(cost));	
		
		System.out.println("_".repeat(10));
		
		System.out.println(max(cost));	
	}
//	Write a function that takes a value n returns the sum of numbers 1 to n

	
	public static int sum(int n) {
		int sum = 0;
		for(int i = 0; i<=n; i++) {
			sum+=i;
		}
		return sum;
		
	}
	
//	Write a function that computes the factorial value
//	Definition: n! = n*(n-1)! , where 0! = 1
//	1! = 1
//	2! = 2 * 1! = 2 * 1
//	3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
//	4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
//	Hint: use the recursive method that was used to calculate Fibonnaci 
//	number
	
	
	public static int factorial(int n) {
		int factorial = n;
		for(int i=n; i>2; i--) {
			factorial = factorial*(i-1);
			
			}
			return factorial;
	}
	
//	Write 3 functions that take an array as a parameter and return 
//	the minimum, average, and maximum values of that array.
//	Hint: this should be static functions with a return type of the 
//	same data type as the array declaration.
	

	
	public static double avg(double[] cost) {
		int i = 0;
		double sum = 0;
		while(i<=cost.length-1) {
			
			sum+=cost[i];
			i++;
		}
		return sum/cost.length;
	}
	
	public static double min(double[] cost) {
		int i=0;
		double min = Double.MAX_VALUE;
		while(i<cost.length) {
			if(cost[i]< min) {
				min = cost[i];
			}
			i++;
		}
		return min;
	}
	
	public static double max(double[] cost) {
		int i=0;
		double max = Double.MIN_VALUE;
		while(i<cost.length) {
			if(cost[i]> max) {
				max = cost[i];
			}
			i++;
		}
		return max;
	}
	
	
	

}
