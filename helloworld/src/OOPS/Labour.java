package OOPS;

public class Labour extends Employee{
	int ot;
	int wh;
	int pay_per_hour;
	private int extra;
	
	public Labour() {
		super();
		// TODO Auto-generated constructor stub
		wh=0;
		pay_per_hour=0;
	}

	public Labour(String name, int salary, int id,int wh,int pay_per_hour, int ot) {
		super(name, salary, id);
		// TODO Auto-generated constructor stub
		this.wh=wh;
		this.pay_per_hour=pay_per_hour;
		this.ot=ot;
		
	}
	int getSalary()
    {
         return (super.getSalary()+wh*pay_per_hour+ ot*pay_per_hour);
    }
	
}
