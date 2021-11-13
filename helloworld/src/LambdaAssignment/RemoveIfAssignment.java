

package LambdaAssignment;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class RemoveIfAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> ord= Arrays.asList(
				new Order(20000,"Bike", 40, "ACCEPTED"),
				new Order(15000, "Car",30, "CANCELLED"),
				new Order(1000,"Knife",60, "COMPLETED"),
				new Order(5000,"Pen", 90, "ACCEPTED"),
				new Order(80000,"Laptop", 10, "CANCELLED")
				);
	/*	Stream<Order> filtered_data = ord.stream().filter(p -> p.orderPrice > 10000);
		filtered_data.forEach(  
                product -> System.out.println(product.order_Id+": "+product.orderPrice +",product status:"+product.order_Status)
                
        );
        */
		
		System.out.println();
		//printConditionally(ord,(p->p.getOrder_Status().equals("ACCEPTED")),(p->p.getOrder_Status().equals("COMPLETED")),p1->System.out.println(p1.order_Id+": "+p1.orderPrice +",product status:"+p1.order_Status));
		
		System.out.println(ord);
		Predicate<Order> c=p->(((p.getOrder_name().length())%2)!=0);
		ord.removeIf((Order p)->(((p.getOrder_name().length())%2)!=0));
		

	}
	
	
/*
	private static void printConditionally1(List<Order> ord, Predicate<Order> c) {
		// TODO Auto-generated method stub
		for(Order p1:ord)
		{
			if(c.test(p1))
			{
				ord.removeIf(c);
			}
		}
	}
	*/
/*
	private static void printConditionally(List<Order> ord, Predicate<Order> c,Predicate<Order> c1,Consumer<Order>consumer) {
		// TODO Auto-generated method stub
		for(Order p:ord)
		{
			if(c.test(p)||c1.test(p))
			{
				consumer.accept(p);
			}
		}
	}
	*/
	

}

