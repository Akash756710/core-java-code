package inharitance3;

public class Dvd extends Iteam{
	float duration;
	String actorName;
	String certification;

	void readDvdDetails() {
		System.out.println("DVD details");
		
		System.out.println("enter the Certificate name");// Central board of film certification(CBFC)
		certification = sc.nextLine();
		
		System.out.println("enter the name of the Actor");
		actorName = sc.nextLine();

		System.out.println("enter the duration in hrs");
		duration = sc.nextFloat();

	}

	void printDvdDetails() {
		System.out.println("Certificate name= ");//CBFC
		System.out.println("Entered detail of the Item is = ");
		System.out.println(" Duration = " + duration);

	}
}
