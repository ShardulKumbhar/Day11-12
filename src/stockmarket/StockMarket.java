package stockmarket;

import java.util.ArrayList;
import java.util.Scanner;

public class StockMarket {

	ArrayList<String> stockName = new ArrayList<String>(); // individual ArraylistList to store n number of data
	ArrayList<Integer> numberOfShares = new ArrayList<Integer>();
	ArrayList<Integer> sharePrice = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int balance;

	public void addStocks() {

		System.out.print("Enter the stock name: "); // taking user input
		stockName.add(sc.next());

		System.out.print("Enter number of shares : ");
		numberOfShares.add(sc.nextInt());

		System.out.print("Enter price of each share: ");
		sharePrice.add(sc.nextInt());

	}

	public void stockReport() {

		/*
		 * here we are calculating value of stock price
		 */

		int sum = 0;
		System.out.println("***************STOCK REPORT****************");
		for (int i = 0; i < stockName.size(); i++) {
			int total = (numberOfShares.get(i) * sharePrice.get(i));

			System.out.println("Stock name= " + stockName.get(i) + "\nValue of each share= " + sharePrice.get(i)
					+ "\nTotal value of share= " + total);

		}
	}
}
