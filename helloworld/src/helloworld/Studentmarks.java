package helloworld;
import java.util.*;
public class Studentmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[3];
		int s[]=new int[3];
		int sumA = 0,sumB =0,sumC=0;
		System.out.println("Enter marks of A");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
			sumA+=a[i];
		}
		System.out.println("Enter marks of B");
		for(int i=0;i<3;i++)
		{
			b[i]=sc.nextInt();
			sumB+=b[i];
		}
		System.out.println("Enter marks of C");
		for(int i=0;i<3;i++)
		{
			c[i]=sc.nextInt();
			sumC+=c[i];
		}
		System.out.println(sumA+ " "+sumB+" "+sumC);
		System.out.println(sumA/3+ " "+sumB/3+" "+sumC/3);
		for(int i=0;i<3;i++)
		{
			s[i]=a[i]+b[i]+c[i];
			System.out.println("Total of subject "+i +" is "+s[i]+ " and the average is "+((s[i])/3));
		}
		
	}

}
