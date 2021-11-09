package genericAssignment;

import java.util.HashSet;
import java.util.Scanner;


public class HashSetEmployee {
	public static void main(String[] args) {
		HashSet<Employee> h = new HashSet<Employee>();
		Scanner sc=new Scanner(System.in);
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
			
			h.add(e[i]);
			
		}
		
		System.out.println(h);
	}
}
