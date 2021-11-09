package helloworld;
import java.util.*;
public class searchArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[15];
		for(int i=0;i<15;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the value to be searched :");
		int s=sc.nextInt();
		for(int i=0;i<15;i++)
		{
			if(s==a[i])
			{
				System.out.println("The element is found");
				return ;
			}
		}
		System.out.println("The element is not found");
		
	}
}
