package helloworld;
import java.util.*;
public class Armstrong {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		System.out.println(sum+" "+p);
		if(sum==p)
		{
		System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}

}
