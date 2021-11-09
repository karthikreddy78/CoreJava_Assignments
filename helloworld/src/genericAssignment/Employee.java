package genericAssignment;

public class Employee{
	
	private int id;
	private String name;
	private String dept;
	private long sal;
	/*
	public Employee(int id, String name, String dept, long sal) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Details: [ Id: "+id+" Name: "+name+" Department: "+dept+" Salary: "+sal+"]";
	}
	
	public void displayDetails()
	{
		
	}
	
	public boolean equals(Object o){
		System.out.println("In equals " +"value is :" +this.name);
		Employee employee = (Employee)o;
		if(employee.getName().equals(this.name)){
		return true;
		}
		return false;
		}
		 
		@Override
		public int hashCode() {
		System.out.println("In hashcode "+"value is :"+this.name);
		int hash = 3;
		hash = 7 * hash + this.name.hashCode();
		return hash;
		}
	
}
