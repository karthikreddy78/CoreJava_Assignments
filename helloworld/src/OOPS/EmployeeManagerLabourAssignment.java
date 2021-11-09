package OOPS;

public class EmployeeManagerLabourAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee m1 = new Manager("Karthik",50000,1,500,1500,6000);
         System.out.println("Salary of Manager= "+m1.getSalary());
         Employee l =new Labour("Karthik2",10000,2,40,40,30);
         System.out.println("Salary of Labour= "+l.getSalary());
	}

}
