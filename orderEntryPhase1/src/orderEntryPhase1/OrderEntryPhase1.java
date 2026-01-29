//Nathan Jennings CIS406 Order Entry Phase 1//
package orderEntryPhase1;

import java.util.Scanner;
import java.util.InputMismatchException;


public class OrderEntryPhase1 {
	//Instance variables
	private String itemNumber;
	private String itemDescription;
	private double itemPrice;
	private int quantity;
	private double tax;
	private double netAmount;
	private double discount;
	
	private void getData() {
		//Open scanner to listen for user input
				Scanner input = new Scanner(System.in);
				
				//Get Items for order line
				//Enter item number - alphanumerical
				System.out.print("Enter Item Number: ");
				itemNumber = input.nextLine();
				
				
				//Enter item description - alphanumerical
				System.out.print("Enter Item Description: ");
				itemDescription = input.nextLine();
				
				
				//Enter item price - decimal
				try {
					System.out.print("Enter Item Price (per unit): $");
					itemPrice = input.nextDouble();
				}
				catch (InputMismatchException e) {
					System.out.println("Data entered does not match currency type. Program Ending.");
				}
				catch (Exception e) {
					System.out.println("Error Occurred. Contact System Administration.");
				}
				

				//Enter quantity ordered - int
				try {
					System.out.print("Enter Quantity Ordered: ");
					quantity = input.nextInt();
				}
				catch (InputMismatchException e) {
					System.out.println("Data entered does not match currency type. Program Ending.");
				}
				catch (Exception e) {
					System.out.println("Error Occurred. Contact System Administration.");
				}

				
				//Enter dollar amount of total tax - decimal
				try {
					System.out.print("Enter Total Tax: $");
					tax = input.nextDouble();
				}
				catch (InputMismatchException e) {
					System.out.println("Data entered does not match currency type. Program Ending.");
				}
				catch (Exception e) {
					System.out.println("Error Occurred. Contact System Administration.");
				}
			
				
				//Enter dollar amount of total discount for the item - decimal
				try {
					System.out.print("Enter Total Discount: $");
					discount = input.nextDouble();
				}
				catch (InputMismatchException e) {
					System.out.println("Data entered does not match currency type. Program Ending.");
				}
				catch (Exception e) {
					System.out.println("Error Occurred. Contact System Administration.");
				}
				
				
				//Enter net amount for the item - decimal
				try {
					System.out.print("Enter Total Cost: $");
					netAmount = input.nextDouble();
				}
				catch (InputMismatchException e) {
					System.out.println("Data entered does not match currency type. Program Ending.");
				}
				catch (Exception e) {
					System.out.println("Error Occurred. Contact System Administration.");
				}
				
				input.close();
				
	}
	
	public String toString() {
		return("\nOrder Details:\n" + 
				"\nItem Number \tItem Description \tItem Price \tQuantity \tTotal Tax \tDiscount \tNet Cost\n" +
				"  " + itemNumber + "\t\t   " + itemDescription + "\t" + "\t  $" + itemPrice + "\t" + "\t  " + quantity + "\t\t  $" + tax + "\t\t  $" + discount + "\t\t$" + netAmount );
	}

	public static void main(String[] args) {
		
		//Create new order
		OrderEntryPhase1 myOrder = new OrderEntryPhase1();
		
		//Get data for order
		myOrder.getData();
		
		//Display the output
		System.out.print(myOrder.toString());
		

	}

}
