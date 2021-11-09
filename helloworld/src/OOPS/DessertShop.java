package OOPS;

import java.util.Scanner;

public class DessertShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s;
		do
		{
		System.out.print("Enter your role:");
		s = sc.next();
		if(s.equalsIgnoreCase("owner"))
		{
			Owner o=new Owner();
			o.addItems();
			System.out.println("Owner completed");
		}
		else if(s.equalsIgnoreCase("customer"))
		{
			Customer c=new Customer();
			c.orderItems();
		}
		else
		{
			System.out.println("Wrong choice..Try again");
		}

		}while(!s.equalsIgnoreCase("Stop"));
	}

}
