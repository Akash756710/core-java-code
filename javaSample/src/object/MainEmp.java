package object;

import java.text.ParseException;

public class MainEmp {

	public static void main(String[] args) throws ParseException {
		/*
		 * Employee em=new Employee(); 
		 * em.readEmpDetails(); 
		 * em.displayStudentDetails();
		 */
		
         Employee[] listOfEmp  =new Employee[2];
         Employee employee;
         
         for(int i=0;i<listOfEmp.length;i++)
         {
        	 employee =new Employee();
        	 employee.readEmpDetails();
        	 listOfEmp[i] =employee;
         }
         for(int i=0;i<listOfEmp.length;i++)
         {
        	 System.out.println(listOfEmp);
        	 listOfEmp[i].displayStudentDetails();
         }
	}

}
