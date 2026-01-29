//Nathan Jennings CIS406 Travel Time Converter//
package travelTimeConverter;

import java.util.Scanner;

public class TravelTimeConverter {

	public static void main(String[] args) {
		//OUt put welcome message
		System.out.println("Welcome to the Traveling Time Calculator.");

		//open scanner
		Scanner input = new Scanner(System.in);
		
		//get input miles
		System.out.print("Enter miles: ");
		double miles = input.nextDouble();
		
		//get input miles per hour
		System.out.print("Enter Miles Per Hour (MPH): ");
		double mph = input.nextDouble();
		
		//calculate hours 
		double hours = miles / mph;
		
		//calculate minutes
		double minutes = ((hours - (int) hours) * 60) + 0.5;
		
		System.out.println("");
		
		//label output
		System.out.println("Estimated Traveled Time: ");
		System.out.println("------------------------");
		
		//output time in hrs and minutes
		System.out.println("Hours: " + (int) hours);
		System.out.println("Minutes: " + (int) minutes);
		
	
		System.out.println("");
		
		//end of program message
		System.out.println("Now you know how long it took. Thanks.");
		input.close();

	}

}
