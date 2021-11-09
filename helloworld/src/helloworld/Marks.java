package helloworld;
import java.util.*;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int count=0;
		if(m1>60)
		{
			count++;
		}
		if(m2>60)
		{
			count++;
		}
		if(m3>60)
		{
			count++;
		}
		if(count==3)
		{
			System.out.println("Passed");
		}
		else if(count==2)
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Failed");
		}
		sc.close();
	}

}
