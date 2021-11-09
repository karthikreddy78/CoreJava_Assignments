package exceptionHandlingAssignment;

import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException() {
		// TODO Auto-generated constructor stub
		System.out.println("InsufficientBalance in the savings account");
	}
}
class  IllegalBankTransactionException extends Exception
{
	public IllegalBankTransactionException() {
		// TODO Auto-generated constructor stub
		System.out.println("Illegal Bank Transaction in the savings account");
	}
}


public class SavingsAccountAssignment {
	private long id;
	private double balance;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double withdraw(double amount)
	{
		try
		{
			if(amount<0)
			{
				throw new IllegalBankTransactionException();
			}
			else
			{
			if(this.balance<amount)
			{
				throw new InsufficientBalanceException();
			}
			else
			{
				balance-=amount;
				display();
			}
			}
		}
		catch(Exception e)
		{
			System.out.println("Bank Transaction Failure");
		}
		return amount;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The remaining balance is :"+balance);
		
	}
	public double deposit(double amount)
	{
		try
		{
			if(amount<0)
			{
				throw new IllegalBankTransactionException();
			}
			else
			{
				balance+=amount;
				display();
			}
		}
		catch(Exception e)
		{
			System.out.println("Bank Transaction Failure");
		}
		return amount;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter balance:");
		double b=sc.nextDouble();
		SavingsAccountAssignment sa=new SavingsAccountAssignment();
		sa.setBalance(b);
		int c;
		do
		{
			System.out.println("Enter 1 for withdrawal\n 2 for deposit \n 3 for exit");
			c=sc.nextInt();
			if(c==1)
			{
				System.out.println("Enter withdrawal amount:");
				double w=sc.nextDouble();
				sa.withdraw(w);
			}
			else if(c==2)
			{
				System.out.println("Enter deposit amount:");
				double d=sc.nextDouble();
				sa.deposit(d);
			}
			else if(c==3)
			{
				System.out.println("Exit");
			}
			else
			{
				System.out.println("Try again");
			}
		}while(c!=3);
	
		
	}
}
