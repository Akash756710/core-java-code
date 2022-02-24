package object;
import java.util.Scanner;
import java.util.Date;
public class Example {
	int Studentid;
	String StudentName;
	Date dob;
         Scanner sc=new Scanner(System.in);
         
         void readStudentDetails() throws {
        	 System.out.println("Enter the Student data");
        	 System.out.println("enter the Student id..");
        	 Studentid=sc.nextInt();
        	 System.out.println("Enter the student name");
        	 sc.nextLine();
        	 StudentName =sc.nextLine();
        	 System.out.println("Enter the student name");
        	 
         }
}
