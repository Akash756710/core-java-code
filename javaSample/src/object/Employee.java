package object;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {
  Scanner sc=new Scanner(System.in);
  int EmpId;
  float EmpSalary;
  String EmpName,EmpEmail,EmpMobileNo;
  Date EmpDOB,EmpDOJ;
  
  void readEmpDetails() throws ParseException  {
	  System.out.println("enter the emp data");
	  System.out.println("enter the empid");
	  EmpId=sc.nextInt();
	  System.out.println("enter the empName");
	  sc.nextLine();
	  EmpName=sc.nextLine();
	  System.out.println("enter the empMobile");
	  EmpMobileNo=sc.nextLine();
	  
	  System.out.println("enter the emp salary");
	  EmpSalary =sc.nextFloat();
	  System.out.println("enter the emp email");
	  sc.nextLine();
	  EmpEmail=sc.nextLine();
	  System.out.println("enter the emp DOB 'dd/mm/yyyy");
	 String DOB =sc.nextLine();
	 System.out.println("Enter the emp doj 'dd/mm/yyyy");
	 String DOJ=sc.nextLine();
	 SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	 EmpDOB =sdf.parse(DOB);
	 EmpDOJ =sdf.parse(DOJ);
	 if(EmpMobileNo.matches("\\d{10}")) {
			System.out.println("Mobile Number is valid");
		}
		if(checkMobileNumber(EmpMobileNo)) {
			System.out.println("Mobile Number is valid");
		}else {
			System.out.println("Entered Mobile number is not valid ....");
			System.out.println("Do you want Enter Mobile number which is  valid (y/n)....");
			char ch = sc.next().charAt(0);
			if(ch== 'y') {
				System.out.println("Enter mobile number in specified format (ex:- 07892333222 / 917892333222)");
				sc.nextLine();
				EmpMobileNo =  sc.nextLine();
			}else {
				System.out.println("Thank you for providing your details.....");
			}
		}

		System.out.println("Enter the Student Email......");
		EmpEmail =  sc.nextLine();
		if(validate(EmpEmail)) {
			System.out.println("Thank you for providing correct email.....");
		}else {
			System.out.println("Enter email in specified format (ex:- swapna@gmail.com)");
			sc.nextLine();
			EmpEmail =  sc.nextLine();
		}
	 
	  
  }
  @SuppressWarnings("deprecation")
	void displayStudentDetails(){
		System.out.println("Entered the Student data ...............");
		System.out.println("Student id = " +EmpId );
		System.out.println("Student name = " + EmpName);
		System.out.println("Emp MobileNo="+EmpMobileNo);
		System.out.println("Emp Salary ="+EmpSalary);
		System.out.println("Emp Email ="+EmpEmail);
		System.out.println("Student dob = " + EmpDOB.getDate()+"/"+EmpDOB.getMonth()+"/"+EmpDOB.getYear());
		System.out.println("Student dob = " + EmpDOJ.getDate()+"/"+EmpDOJ.getMonth()+"/"+EmpDOJ.getYear());
}
  boolean checkMobileNumber(String mobNo) {
		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher match = ptrn.matcher(mobNo);
		return (match.find() && match.group().equals(mobNo));
}
  public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		public static boolean validate(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		        return matcher.find();}
		}
