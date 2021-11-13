package LambdaAssignment;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> ord= Arrays.asList(
				new Order(20000, 40, "ACCEPTED"),
				new Order(15000, 30, "CANCELLED"),
				new Order(1000, 60, "COMPLETED"),
				new Order(5000, 90, "ACCEPTED"),
				new Order(80000, 10, "CANCELLED")
				);
	/*	Stream<Order> filtered_data = ord.stream().filter(p -> p.orderPrice > 10000);
		filtered_data.forEach(  
                product -> System.out.println(product.order_Id+": "+product.orderPrice +",product status:"+product.order_Status)
                
        );
        */
		Supplier<Integer> f=()->20;
		System.out.println(f.get());
		
		System.out.println();
		printConditionally(ord,(p->p.getOrder_Status().equals("ACCEPTED")),(p->p.getOrder_Status().equals("COMPLETED")),p1->System.out.println(p1.order_Id+": "+p1.orderPrice +",product status:"+p1.order_Status)
);
		
		System.out.println();
		printConditionally1(ord,(p1->p1.getOrderPrice()>10000),p1->System.out.println(p1.order_Id+": "+p1.orderPrice +",product status:"+p1.order_Status)
);

	}
	
	private static void printConditionally1(List<Order> ord, Predicate<Order> c,Consumer<Order>consumer) {
		// TODO Auto-generated method stub
		for(Order p1:ord)
		{
			if(c.test(p1))
			{
				//System.out.println(p1.order_Id+": "+p1.orderPrice +",product status:"+p1.order_Status);
				consumer.accept(p1);
			}
		}
	}

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
	

}
