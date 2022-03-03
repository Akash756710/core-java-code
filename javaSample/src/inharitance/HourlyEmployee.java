package inharitance;

public class HourlyEmployee extends Employee {
	
	float salaryperhour;
	float totalsalaryperweek;
	float noOfHourWorked;
	float noOfHoursWorked;
	void readSalaryPerHour() {
		System.out.println("Enter the salary per hour");
		salaryperhour = sc.nextFloat();
	}
	
	void readnoOfHoursWorked() {
		System.out.println("Enter the noOfHoursWorked");
		float noOfHoursWorked = sc.nextFloat();
	}
	
	void calculateSalary() {	
		
		totalsalaryperweek =  salaryperhour * noOfHoursWorked;
		System.out.println("Total Salary For a Week = " + totalsalaryperweek);
	}
}
