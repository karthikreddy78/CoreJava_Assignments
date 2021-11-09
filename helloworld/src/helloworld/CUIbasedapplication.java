package helloworld;
import java.util.*;
public class CUIbasedapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String u1="Karthik";
		String p1="karthik";
		String username="",password="";
		int count=0;
		do
		{
			System.out.print("Enter your username:");
			username=sc.next();
			System.out.print("Enter your password:");
			password=sc.next();
			if(password.equals(p1)&& username.equals(u1))
			{
				System.out.println("Welcome "+username);
				return ;
			}
			else
			{
				System.out.println("Error!!! Try again");
				count++;
			}
			
		}while(count<3);
		System.out.println("Contact Admin");

	}

}
