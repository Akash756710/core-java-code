package strings;
import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String message;
		System.out.println("Enter the String = ");
		message=sc.nextLine();
		String[] words=message.split(" ");
		System.out.println("String divided into word");
		System.out.println();
		for(String w:words)
		{
			System.out.println(w);
		}
		int count =1;
		for (int i = 0; i < message. length() - 1; i++) {
			if ((message. charAt(i) == ' ') && message. charAt(i + 1) != ' ') {
			count++; }
			} System. out. println("Number of words in a string : " + count);
			
	}

}
