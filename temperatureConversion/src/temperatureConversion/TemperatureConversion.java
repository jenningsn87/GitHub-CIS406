//Nathan Jennings CIS406 Temperature Conversion//
//testing saves///
package temperatureConversion;


import java.util.Scanner;
import java.util.InputMismatchException;

public class TemperatureConversion {
	
static double degreeF;
static double degreeC;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Temperature Converter.");
		
		System.out.println("");
		
		
		//request fahrenheit input
		System.out.print("Enter degrees in Fahrenheit: ");
		//try catch for errors
		try {
		degreeF = input.nextInt();
		
		}
		catch (InputMismatchException e) {
			System.out.println("Data entered does not match input request. Program Ending.");
		}
		catch (Exception e) {
			System.out.println("Error Occurred. Contact System Administration.");
		}
		//convert to celsius and print out
		double convertToC = (degreeF - 32) * 5.0/9;		
		System.out.println("Degrees in Celsius: " + convertToC);
		
		
		System.out.println("");		
	
		
		//request celsius input
		System.out.print("Enter degrees in Celsius: ");
		//try catch for errors
		try {
			degreeC = input.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Data entered does not match input request. Program Ending.");
			}
			catch (Exception e) {
				System.out.println("Error Occurred. Contact System Administration.");
			}
		
		//convert to fahrenheit and print out
		double convertToF = (degreeC * 9.0/5) + 32;		
		System.out.println("Degrees in Fahrenheit: " + convertToF);
		
		System.out.println("");
		
		System.out.print("\n Thanks for checking! See ya!");
		
		//close scanner
		input.close();
	}

}
