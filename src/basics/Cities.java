package basics;

import java.net.NoRouteToHostException;

public class Cities {
	
	public static void main(String[] args) {
		//declare and define an array
		
		String[] cities = {"cleveland", "charleston",
				"new york", "philadelphia"};
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println("- ".repeat(30));
		
		
		//declare array without values
		String[] states = new String[5];
		states[0] = "North Carolina";
		states[1] = "South Carolina";
		states[2] = "Florida";
		states[3] = "Virginia";
		states[4] = "Pennsylvania";
		
		for(int i = 0;i<5;i++) {
			System.out.println(states[i]);
		}
		int i=0;
		do {
			
			System.out.println(states[i]);
			i++;
		}while(i<5);
		i=0;
		
		
		while(i<5) {
			System.out.println(states[i]);
			i++;
		}
	}

}
