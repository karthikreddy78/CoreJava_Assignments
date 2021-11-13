package LambdaAssignment;

public class Order {
	int orderPrice;
	String order_name;
	
	int order_Id;
	String order_Status;
	public Order(int orderPrice, int order_Id, String order_Status) {
		super();
		this.orderPrice = orderPrice;
		this.order_Id = order_Id;
		this.order_Status = order_Status;
		this.order_name="";
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public Order(int orderPrice, String order_name, int order_Id, String order_Status) {
		super();
		this.orderPrice = orderPrice;
		this.order_name = order_name;
		this.order_Id = order_Id;
		this.order_Status = order_Status;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public int getOrder_Id() {
		return order_Id;
	}
	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}
	public String getOrder_Status() {
		return order_Status;
	}
	public void setOrder_Status(String order_Status) {
		this.order_Status = order_Status;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order:[Order name:"+ order_name+" Order id:"+order_Id+" ,Order_Price:"+orderPrice+" ,Order status:"+order_Status+"]";
	}
	
	
}
