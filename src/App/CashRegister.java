package App;

import java.util.Random;
import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		Double price = rand.nextDouble(20);
		System.out.printf("Your total today is $%,.2f\n", price);
		System.out.println("Enter the amount of cash paid");
		Double cashPaid = sc.nextDouble();
		Double change = cashPaid - price;
		int hundreds = 0;
		int fifties = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickles = 0;
		int pennies = 0;

		cashPaid = Double.parseDouble(String.format("%,.2f", cashPaid));
		price = Double.parseDouble(String.format("%,.2f", price));

		while (cashPaid < price || cashPaid > (price + 100)) {
			System.out.println("Please enter a value less than $100 more than " + price);
			cashPaid = sc.nextDouble();
		}
		if ((cashPaid - price) > .001) {
			change = cashPaid - price;
			Double.parseDouble(String.format("%,.2f", change));
			System.out.printf("Your change is $%,.2f", change);
			
			hundreds = (int) (change / 100);
			change = change % 100;
			
			fifties = (int) (change / 50);
			change = change % 50;
			
			twenties = (int) (change / 20);
			change = change % 20;

			tens = (int) (change / 10);
			change = change % 10;

			fives = (int) (change / 5);
			change = change % 5;

			ones = (int) (change / 1);
			change = change % 1;

			quarters = (int) (change / .25);
			change = change % .25;

			dimes = (int) (change / .10);
			change = change % .10;

			nickles = (int) (change / .05);
			change = change % .05;

			pennies = (int) (change / .01);
			change = change % .01;
		} else {
			System.out.println("Perfect change? Thank you.");
		}
		if (hundreds > 0) {
			if (hundreds == 1) {
				System.out.println("\n1 hundred");
			} else {
				System.out.println("\n" + hundreds + " hundreds");
			}
		}
		if (fifties > 0) {
			if (fifties == 1) {
				System.out.println("\n1 fifty");
			} else {
				System.out.println("\n" + fifties + " twenties");
			}
		}
		if (twenties > 0) {
			if (twenties == 1) {
				System.out.println("\n1 twenty");
			} else {
				System.out.println("\n" + twenties + " twenties");
			}
		}
		if (tens > 0) {
			if (tens == 1) {
				System.out.println("\n1 ten");
			} else
				System.out.println("\n" + tens + " tens");
		}
		if (fives > 0) {
			if (fives == 1) {
				System.out.println("\n1 Five");
			} else
				System.out.println("\n" + fives + " fives");
		}
		if (ones > 0) {
			if (ones == 1) {
				System.out.println("\n1 Dollar");
			} else
				System.out.println("\n" + ones + " ones");
		}
		if (quarters > 0) {
			if (quarters == 1) {
				System.out.println("\n1 quarter");
			} else
				System.out.println("\n" + quarters + " quarters");
		}

		if (dimes > 0) {
			if (dimes == 1) {
				System.out.println("\n1 dime");
			} else
				System.out.println("\n" + dimes + " dimes");
		}
		if (nickles > 0) {
			if (nickles == 1) {
				System.out.println("\n1 nickle");
			} else
				System.out.println("\n" + nickles + " nickles");

		}
		if (pennies > 0) {
			if (pennies == 1) {
				System.out.println("\n1 penny");
			} else
				System.out.println("\n" + pennies + " pennies");
		}

		{
			sc.close();
		}

	}

}
//			if (cashPaid > price) {
//				System.out.println("");
//			}
//		else {
////			System.out.println(change);
////
////		}
//	private static void totalDue() {
//		
//		
//	}

//	private static void giveChange() {
//		cashPaid();
//
//	}
//In the cash register we will calculate the amount of change returned to a customer based on the purchase price and the amount tendered. We will also notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer. Change should be provided using the largest bill and coin denominations as possible. Denominations that are not used should not be displayed.
//
//Hint: Mod operator
//
//User Story #1
//The user is prompted asking for the price of the item.
//
//User Story #2
//The user is then prompted asking how much money was tendered by the customer.
//
//User Story #3
//Display an appropriate message if the customer provided too little money or the exact amount.
//
//User Story #4
//If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
//
//Grading
//This is a graded project. You are expected to have your project completed by the start of class on Monday morning.
//
//You will be given either a pass or fail based on whether your code works given all of the following test conditions:
//
//Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.