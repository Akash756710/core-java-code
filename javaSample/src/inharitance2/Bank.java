package inharitance2;
import java.util.Scanner;
public class Bank {
	float P;
	float I;
	float T ;
	float Si;
	float Amount;
Scanner sc=new Scanner(System.in);
	void readEmployeeDetails() {
		
		
		
		System.out.println("Enter the principal  =");
		P=sc.nextFloat();
		System.out.println("Enter the intrest");
		I=sc.nextFloat();
		System.out.println("Enter the time  =");
		T=sc.nextFloat();
		float Si=(P*I*T)/100;
		System.out.println("Enter the si ="+Si);
		Amount =Si +P;
		System.out.println("Amount");
		
	}
	void printEmployeeDetails() {
		System.out.println(" the principal  =" + P);
		System.out.println(" the intrest" +I);
		System.out.println(" the time  =" +T);
		System.out.println(" the si ="+Si);
		System.out.println("this is amount ="+Amount);
	}

}
