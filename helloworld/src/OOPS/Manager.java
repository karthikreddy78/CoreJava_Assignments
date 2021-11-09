package OOPS;

public class Manager extends Employee {
	
	int hra, ta;
	int incentives;
    Manager()
    {
         super();
         hra = ta = 0;
         incentives=0;
    }
    Manager(String n, int sal,int id, int h, int t)
    {
         super(n, sal, id);
         hra = h;
         ta = t;
         incentives=0;
    }
    public Manager(String n, int sal,int id,int hra, int ta, int incentives) {
		super(n,sal,id);
		this.hra = hra;
		this.ta = ta;
		this.incentives = incentives;
	}
    
    public int getIncentives() {
		return incentives;
	}
	
	public void setIncentives(int incentives) {
		this.incentives = incentives;
	}
	int getSalary()
    {
         return (super.getSalary()+hra+ta+this.incentives);
    }
	

}
