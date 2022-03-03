package inharitance3;

import java.util.Scanner;

public class Iteam {
	String name;
	String description;
	double price;
	Scanner sc = new Scanner(System.in);

	void readItemDetails() {
		System.out.println("enter the item");

		System.out.println("enter the name of the item");
		name = sc.nextLine();

		System.out.println("enter the description of the item");
		description = sc.nextLine();

		System.out.println("enter the price of the item");
		price = sc.nextDouble();

	}

	void printItemDetails() {
		System.out.println("Entered detail of the Item is ");
		System.out.println(" name of the item = " + name);
		System.out.println(" description of the item =" + description);
		System.out.println("price of the item = " + price);

	}
}
