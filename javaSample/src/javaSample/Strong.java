package javaSample;
import java.util.*;
public class Strong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		int fact_n,lastdig;
		
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		int total=0;
		int temp_n=n;
		while(n !=0) {
			i=1;
			fact_n=1;
			lastdig=n%10;
			
			while(i <=lastdig) {
				fact_n=fact_n*i;
				i++;
				
			}
			total =total + fact_n;
			n=n/10;
			
		}
		if(total == temp_n)
			System.out.println(temp_n   +   "is a Strong Number\n");
		else
			System.out.println("temp_n is not a strong number");
		System.out.println();
	}

}
