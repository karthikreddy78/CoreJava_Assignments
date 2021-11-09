package CollectionsAssignment;
import java.util.*;
public class TreeSetEmployeeAssignment {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c;
		Scanner sc =new Scanner(System.in);
		
		Employee e[];
		
		System.out.println("Enter the number of employee objects");
		int p=sc.nextInt();
		e =new Employee[p];
		for(int i=0;i<p;i++)
		{
			System.out.println("Entr the details of Employee "+(i+1));
			e[i] =new Employee();
			System.out.println("Enter id");
			int p1=sc.nextInt();
			e[i].setId(p1);
			System.out.println("Enter name");
			String n =sc.next();
			e[i].setName(n);
			System.out.println("Enter dept");
			String d=sc.next();
			e[i].setDept(d);
			System.out.println("Enter sal");
			long p4=sc.nextLong();
			e[i].setSal(p4);
			
		}
		do
		{
			System.out.println("Enter a) ID	b)Name	c)Dept	d)Sal	e)Exit");
			c=sc.next();
			if(c.equals("a"))
			{
				 TreeSet<Employee> empIdList = new TreeSet<Employee>(new EmployeeIDComparator());
				 for(int i=0;i<p;i++)
				 {
					 empIdList.add(e[i]);
				 }
				 System.out.println("the employee list ordered with id is:\n"+empIdList);
			}
			else if(c.equals("b"))
			{
				 TreeSet<Employee> empNameList = new TreeSet<Employee>(new EmployeeNameComparator());
				 for(int i=0;i<p;i++)
				 {
					 empNameList.add(e[i]);
				 }

				 
				 System.out.println("the employee list ordered with id is:\n"+empNameList);
		
			}
			else if(c.equals("c"))
			{
				 TreeSet<Employee> empDeptList = new TreeSet<Employee>(new EmployeeDeptComparator());
				 for(int i=0;i<p;i++)
				 {
					 empDeptList.add(e[i]);
				 }

				 
				 System.out.println("the employee list ordered with id is:\n"+empDeptList);
		
			}
			else if(c.equals("d"))
			{
				 TreeSet<Employee> empSalList = new TreeSet<Employee>(new EmployeeSalComparator());
				 for(int i=0;i<p;i++)
				 {
					 empSalList.add(e[i]);
				 }

				 
				 System.out.println("the employee list ordered with id is:\n"+empSalList);
		
			}
			else if(c.equals("e"))
			{
				System.out.println("Exit");
			}
			else
			{
				System.out.println("Provide correct option");
			}
			
			
		}while(!c.equals("e"));
	}

}
