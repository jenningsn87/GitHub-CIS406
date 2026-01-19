//Nathan Jennings CIS406 Temperature Conversion//
package temperatureConversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Temperature Converter.");
		
		System.out.println("");
		
		System.out.print("Enter degrees in Fahrenheit: ");
		int degreeF = input.nextInt();
		
		int convertToC = ((degreeF - 32) * 5 / 9);
		
		System.out.println("Degrees in Celsius: " + convertToC);
		
		System.out.println("");		
	
		System.out.print("Enter degrees in Celsius: ");
		int degreeC = input.nextInt();
		
		int convertToF = (degreeC * 9 / 5) + 32;
		
		System.out.println("Degrees in Fahrenheit: " + convertToF);
		
		System.out.println("");
		
		System.out.print("Thanks for checking! See ya!");
		
		
		input.close();
	}

}
