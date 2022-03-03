package inharitance3;

public class Mp3 extends Iteam {

	float duration;
	String artistName;

	void readMp3Details() {
		System.out.println("enter the Mp3 song");

		System.out.println("enter the name of the Artist");
		artistName = sc.nextLine();

		System.out.println("enter the duration of the song");
		duration = sc.nextFloat();

	}

	void printMp3Details() {
		System.out.println("Entered detail of the Item is ");
		System.out.println(" Duration of the Song in minutes = " + duration);

	}
}
