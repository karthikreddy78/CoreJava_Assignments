package helloworld;
import java.util.*;
import java.lang.Math;
public class SimpleInterestCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Principal:");
		double p=sc.nextDouble();
		System.out.print("Enter Rate:");
		double r=sc.nextDouble();
		System.out.print("Enter Time:");
		double t=sc.nextDouble();
		double si=(p*r*t)/100;
		double ci=p*(Math.pow((1+(r/100)),t)-1);
		System.out.println("Simple Interest is:"+si);
		System.out.println("Compound Interest is:"+ci);
	}

}
