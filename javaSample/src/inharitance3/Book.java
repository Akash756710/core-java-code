package inharitance3;

public class Book extends Iteam {
	String bookName;
	int pages;
	String authorName;
	String genre;

	void readBookDetails() {
		System.out.println("enter Book Details");
		
		System.out.println("enter the Book name");
		bookName = sc.nextLine();
		System.out.println("enter the Author name");
		authorName = sc.nextLine();
		
		System.out.println("enter number of pages");
		pages = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the genre");
		genre = sc.nextLine();
		sc.nextLine();

	}

	void printBookDetails() {
		System.out.println("Enter the book name= "+bookName);
		System.out.println("Entered the Author name"+authorName);
		System.out.println(" Number of pages = " + pages);
		System.out.println(" Enter the genre = " + genre);

	}
}
