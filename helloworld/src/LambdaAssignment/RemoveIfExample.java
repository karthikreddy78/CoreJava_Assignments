package LambdaAssignment;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfExample {

	 static List<Employee> employeeList = new ArrayList<>();
	  public static void main(String[] args) {
	    employeeList.add(new Employee("Tom", 45, 7000.00));
	    employeeList.add(new Employee("Harry", 25, 10000.00));
	    employeeList.add(new Employee("Ethan", 65, 8000.00));
	    employeeList.add(new Employee("Nanc", 22, 12000.00));
	    employeeList.add(new Employee("Debora", 29, 9000.00));
	    employeeList.removeIf((Employee emp) -> emp.getName().length()%2!=0);
	    System.out.println("Employees below the age of 30");
	    employeeList.forEach(System.out::println);
	  }
}
