package LambdaAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
interface Condition
{
	boolean test(Order o);
}
public class OrderAssignment {

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
		System.out.println();
		printConditionally(ord,(p->p.getOrder_Status().equals("ACCEPTED")),(p->p.getOrder_Status().equals("COMPLETED")));
		
		
		printConditionally1(ord,(p1->p1.getOrderPrice()>10000));

	}
	
	private static void printConditionally1(List<Order> ord, Condition c) {
		// TODO Auto-generated method stub
		for(Order p1:ord)
		{
			if(c.test(p1))
			{
				System.out.println(p1.order_Id+": "+p1.orderPrice +",product status:"+p1.order_Status);

			}
		}
	}

	private static void printConditionally(List<Order> ord, Condition c,Condition c1) {
		// TODO Auto-generated method stub
		for(Order p:ord)
		{
			if(c.test(p)||c1.test(p))
			{
				System.out.println(p.order_Id+": "+p.orderPrice +",product status:"+p.order_Status);

			}
		}
	}
	

}
