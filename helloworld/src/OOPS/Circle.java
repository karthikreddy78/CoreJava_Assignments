package OOPS;

public class Circle extends Shape{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void Area()
	{
		System.out.println("The area of circle is :"+ 3.14*radius*radius);
	}

}
