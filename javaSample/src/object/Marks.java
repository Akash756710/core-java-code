package object;
import java.util.Scanner;
public class Marks {
	Scanner sc=new Scanner(System.in);
	
	int StudentRoll;
	int Science,Math,English;
	public void Student() {
		System.out.println("Enter the StudentRoll =");
		StudentRoll =sc.nextInt();
		
		System.out.println("Enter the Science marks =");
		Science =sc.nextInt();
		
		System.out.println("Enter the Math marks =");
		Math=sc.nextInt();
		
		
		System.out.println("Enter the English marks =");
		English=sc.nextInt();
		
		float average_marks=(Science+Math+English)/3;
		System.out.println(average_marks);
		
				
		
		

	}
}
