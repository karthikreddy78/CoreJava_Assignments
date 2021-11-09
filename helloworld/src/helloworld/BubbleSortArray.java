
package helloworld;
import java.util.*;
public class BubbleSortArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[15];
		for(int i=0;i<15;i++)
		{
			a[i]=sc.nextInt();
		}
		 int n = a.length;  
	     int temp = 0;  
	     for(int i=0; i < n; i++)
	     {
	    	 for(int j=1; j < (n-i); j++)
	    	 {
	    		 if(a[j-1] > a[j])
	    		 {
	    			 temp = a[j-1];
	    			 a[j-1] = a[j];
	    			 a[j] = temp;  
	              }  
	                          
	         	}  
	      }
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.print(a[i]+" ");
	     }
	}
}
