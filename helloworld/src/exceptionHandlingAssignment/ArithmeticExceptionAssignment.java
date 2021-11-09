package exceptionHandlingAssignment;
import java.util.*;
public class ArithmeticExceptionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try
		{
			int d=n1/n2;
			System.out.println("The quotient is :"+d);
			
		}
		
		catch(ArithmeticException e)
		{
			UnsupportedOperationException p;
			p=new UnsupportedOperationException();
			System.out.println(p);
		}
		
		

	}

}
