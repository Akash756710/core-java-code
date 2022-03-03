package inharitance3;

public class Iteam_Main {
	public static void main(String[] args) {
		Iteam i=new Iteam();
		
		i.readItemDetails();
		i.printItemDetails();
		
		Mp3 m1=new Mp3();
		m1.readMp3Details();
		m1.printMp3Details();
		
		Dvd d1=new Dvd();
		d1.readDvdDetails();
		d1.printDvdDetails();
		
		Book b1=new Book();
		b1.readBookDetails();
		b1.printBookDetails();

	}

}
