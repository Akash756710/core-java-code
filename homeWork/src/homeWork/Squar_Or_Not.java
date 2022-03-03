package homeWork;

import java.util.Scanner;

public class Squar_Or_Not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length");
		int a=sc.nextInt();
		
		System.out.println("Enter the Breadth");
		int b=sc.nextInt();
		
		int c,d;
		
		if(a==b) {
			d=a*b;
			System.out.println(d+"It is Squar");
		}
		else {
			c=(a*b)/2;
			System.out.println(c+"It is rectangle");
		}

	}

	}


