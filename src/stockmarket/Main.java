package stockmarket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StockMarket obj = new StockMarket();

		// making choice for input and calling methord with object in indivisual case
		while (true) {
			System.out.println("1-Enter New Stock \n2-Display Stock Report \n3-Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				obj.addStocks();
				break;
			case 2:
				obj.stockReport();
				break;
			case 3:
				System.out.println("Good Bye");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Input");
				break;

			}
		}
	}
}
