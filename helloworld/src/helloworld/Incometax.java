package helloworld;
import java.util.*;
public class Incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double sal =sc.nextDouble();
		double tax;
		if(sal>500000)
		{
			tax=0.3*sal;
		}
		else if(sal>300000)
		{
			tax=0.2*sal;
		}
		else if(sal>180000)
		{
			tax=0.1*sal;
		}
		else
		{
			tax=0;
		}
		System.out.println("Tax is:"+tax);
	}

}
