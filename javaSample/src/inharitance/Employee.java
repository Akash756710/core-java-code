package inharitance;
import java.util.Scanner;
public class Employee {

	int Empid;
	String EmpName;
	String EmpAdress;
	String EmpCountry;
	
	Scanner sc=new Scanner(System.in);
	
	void readEmployeeDetails() {
		System.out.println("Enter the Employee details...");
		System.out.println("Enter the Employee Id..=");
		Empid=sc.nextInt();
		System.out.println("Enter the Employee Name..=");
		EmpName=sc.nextLine();
		System.out.println("Enter the Employee Adress..=");
		EmpAdress=sc.nextLine();
		System.out.println("Enter the Employee Country..=");
		EmpCountry=sc.nextLine();
	}
	void printEmployeeDetails() {
		System.out.println("Enter the Employee details..." +Empid);
		System.out.println("Enter the Employee Name..="+ EmpName);
		System.out.println("Enter the Employee Adress..="+ EmpAdress);
		System.out.println("Enter the Employee Country..=" + EmpCountry);
	}
	
}
