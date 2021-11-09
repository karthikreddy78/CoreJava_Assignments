package OOPS;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	
	public void Area()
	{
		System.out.println("The Area of Rectangle is "+ this.length*this.breadth);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}
