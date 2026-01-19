//Nathan Jennings CIS406 Vacation Diary 1//
package vacationdiary1;


import java.util.Scanner;

public class VacationDiary1 {

	public static void main(String[] args) {

//Open the Scanner object to receive user input.
Scanner input = new Scanner(System.in);
		
		
//name of program
System.out.println("Vacation Diary");



//Enter date vacation started.
System.out.print("Enter date of vacation started (mm/dd/yyyy): ");
String date = input.nextLine();

//Enter the city visited.
System.out.print("Enter city visited: ");
String city = input.nextLine();

//Enter the country visited.
System.out.print("Enter country visited: ");
String country = input.nextLine();

//Enter the number of days.
System.out.print("How many days were you there? ");
int days = input.nextInt();

//Enter the mode of travel (car, airplane, ship, train, bus) to reach 
//the destination.
System.out.print("How did you get there? Choose 1: (Car, Airplane, Ship, Train, BUs): ");
String travelMode = input.next();


System.out.println("");
System.out.println("");
System.out.println("Details of your trip: ");
System.out.println("");
System.out.println("Date: " + date);
System.out.println("City: " + city);
System.out.println("Country: " + country);
System.out.println("Number of days: " + days);
System.out.println("Traveled by: " + travelMode);
System.out.println("");
System.out.println("WooHoo, Hope you had an amazing time!!!");



input.close();

	}

}
