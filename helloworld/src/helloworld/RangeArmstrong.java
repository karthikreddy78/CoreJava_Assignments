package helloworld;
import java.util.*;
public class RangeArmstrong {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		for(int n=100;n<1000;n++)
		{
			int p=n;
			int sum=0;
			while(p>0)
			{
				int r=p%10;
				p=p/10;
				sum=sum+r*r*r;
			}
			//System.out.println(sum+" "+n);
			if(sum==n)
			{
			System.out.println(sum +" is an Armstrong Number");
			}
			/*else
			{
				System.out.println(sum +"is Not an Armstrong Number");
			}*/
		}
	}

}
