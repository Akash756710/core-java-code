package javaSample;
import java.util.*;
public class PalindromeExample2 {

	public static void main(String[] args) {
		String Original,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String /number to check if it is palindrome");
        
		Original =sc.nextLine();
		
		int length=Original.length();
		
		for(int i=length-1; i>=0;i--)
			reverse =reverse + Original.charAt(i);
		
		if(Original.equals(reverse))
			System.out.println("Entered String /number is a palindrome");
		else
			System.out.println("entered string/number is not palindrome");
	}

}
