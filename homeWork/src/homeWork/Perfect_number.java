package homeWork;

import java.util.Scanner;

public class Perfect_number {
	public static void main(String[] args) {
		long n,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		n=sc.nextInt();
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				sum=sum+1;
			}
			i++;
		}
         if(sum==n)
         {
        	 System.out.println(n+" is perfect number ");
         }
         else
        	 System.out.println(n +" is not perfect numer ");
        //strong number is a special number whose sum of the factorial of digits is equal
         //to the original number
	}
}
