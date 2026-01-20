//Nathan Jennings CIS406 Temperature Conversion//
//testing saves///
package temperatureConversion;


import java.util.Scanner;
import java.util.InputMismatchException;

public class TemperatureConversion {
	
	private static int degreeF;
	private static int convertToC = ((degreeF - 32) * 5 / 9);
	private static int degreeC;
	private static int convertToF = (degreeC * 9 / 5) + 32;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Temperature Converter.");
		
		System.out.println("");
		
		
		System.out.print("Enter degrees in Fahrenheit: ");
		try {
		degreeF = input.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Data entered does not match input request. Program Ending.");
		}
		catch (Exception e) {
			System.out.println("Error Occurred. Contact System Administration.");
		}
		
		
		
		System.out.println("Degrees in Celsius: " + convertToC);
		
		System.out.println("");		
	
		System.out.print("Enter degrees in Celsius: ");
		try {
			degreeC = input.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Data entered does not match input request. Program Ending.");
			}
			catch (Exception e) {
				System.out.println("Error Occurred. Contact System Administration.");
			}
		
		
		
		
		System.out.println("Degrees in Fahrenheit: " + convertToF);
		
		System.out.println("");
		
		System.out.print("Thanks for checking! See ya!");
		
		
		input.close();
	}

}
