package streamApiAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class StreamApiTraderAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Transaction> list= new ArrayList<>();
		
		list.add(new Transaction(new Trader("warner", "Pune"), 2011, 5000));
		list.add(new Transaction(new Trader("maxwell", "Bangalore"), 2012, 4000));
		list.add(new Transaction(new Trader("kane", "Pune"), 2011, 3000));
		list.add(new Transaction(new Trader("wade", "Delhi"), 2012, 2000));
		list.add(new Transaction(new Trader("virat", "indore"), 2018, 2000));
		//System.out.println(list);
		
		List<Transaction>l=(List<Transaction>)list.stream().filter(x-> x.year==2011).collect(Collectors.toList());
		
        l.forEach(System.out::println);
			
        System.out.println();
        
        //Question 10
        List<String>l1=(List<String>)list.stream().filter(x->x.t.getCity().equals("Pune")).map(x->x.t.getName())
        		.collect(Collectors.toList());
        System.out.println(l1);
        //Question 11
        List<String>l2=list.stream().map(x->x.t.getName()).sorted()
        		.collect((Collectors.toList()));
        	System.out.println(l2);
        	
        	//Question 12
        	List<String>l3=list.stream().filter(x->x.t.getCity().equalsIgnoreCase("indore")).map(x->x.t.getName())
        			.collect(Collectors.toList());
        	System.out.println(l3);
        	//Question 13
        	List<Integer>l4=list.stream().filter(x->x.t.getCity().equalsIgnoreCase("delhi")).map(x->x.getValue())
        			.collect(Collectors.toList());
        	System.out.println(l4);
        	
        	//Question 14 &15
        	 Comparator<Transaction> comparator = Comparator.comparing(Transaction::getValue);

        	Transaction maxVal=list.stream().max(comparator).get();
        	System.out.println(maxVal);
        	
        	Transaction minVal=list.stream().min(comparator).get();
        	System.out.println(minVal);
	
	}

}
