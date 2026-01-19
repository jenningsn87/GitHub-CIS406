//Nathan Jennings CIS406 Student Registration//
package studentRegistration;

import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		
//Open the Scanner object to receive user input.
Scanner input = new Scanner(System.in);

//Student Registration Form
System.out.println("----Student Registration Form----");

System.out.println("");

//request Last name		
System.out.print("Enter a students last name: ");
String lastName = input.nextLine();


//Request First Name
System.out.print("Enter a students first name: ");
String firstName = input.nextLine();


//Request Birth Year
System.out.print("Enter a students year of birth: ");
String birthYear = input.next();

//Concant the first and last name for full Name
System.out.println();
var fullName = firstName + " " + lastName;

System.out.println("Welcome " + fullName + "!");
System.out.println("Congratulations! Registration is complete!");
System.out.println();

//create a password that is made up of the students firstName + * + birthYear
String password = firstName + "*" + birthYear;
System.out.println("Your temporary password is " + password);


//close Scanner object
input.close();
	}

}
