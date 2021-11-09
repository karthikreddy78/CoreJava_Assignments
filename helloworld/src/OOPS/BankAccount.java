package OOPS;


public class BankAccount

{

    private int balance; 

 
    public BankAccount( int initialBalance )

    {

      this.deposit( initialBalance );

    }

     public void withdraw( int amount )

    {

      balance = balance - amount;

    }

     public void deposit( int amount )

    {

      balance = balance + amount;

    }

  

    public int getBalance()

    {

      return balance;

    }

}