package CollectionsAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class LinkedListAssignment {
	
	public static void main(String args[])
    {
        // Creating object of the
        // class linked list
		
		String stringDate4="24-03-1999";
		String stringDate1="25-08-2000";
		String stringDate2="27-01-2012";
		String stringDate3="24-01-1998";
		Date date1=null;
		try {
			date1 = new SimpleDateFormat("dd-MM-yyyy").parse(stringDate1);
			System.out.println(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Date date2=null;
		try {
			date2 = new SimpleDateFormat("dd-MM-yyyy").parse(stringDate2);
			System.out.println(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date3=null;
		
		//converting string to date
		try {
			date3 = new SimpleDateFormat("dd-MM-yyyy").parse(stringDate3);
			System.out.println(date3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date4=null;
		try {
			date4 = new SimpleDateFormat("dd-MM-yyyy").parse(stringDate4);
			System.out.println(date4);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

        LinkedList<Date> ll
            = new LinkedList<Date>();
  
        // Adding elements to the linked list
        ll.add(date1);
        ll.add(date2);
        ll.add(date3);
        ll.add(date4);
        int i=ll.size()-1;
        while(i>=0){
        	//converting date to string
        	 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
        	    String strDate= formatter.format(ll.get(i)); 
        	    
            System.out.print("Your date of Birth is "+strDate + " ");
           int year=1900+ll.get(i).getYear();  
            //System.out.println(year);
            if(year%4==0)
            {
            	System.out.println("it was a leap year");
            }
            else
            {
            	System.out.println("It was not a leap year");
            }
            i--;
            
        }
      
    }
	
}
