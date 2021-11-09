package OOPS;

public class Employee {

     String name;
     int salary;
     int id;
     Employee()
     {
          name = null;
          salary = 0;
          id=0;
     }
     Employee (String name, int salary,int id)
     {
          this.name = name;
          this.salary = salary;
          this.id=id;
     }
     int getSalary()
     {
          return salary;
     }
}