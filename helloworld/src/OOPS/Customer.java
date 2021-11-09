package OOPS;

import java.util.Scanner;

public class Customer {

	private int candies;
	private int cookies;
	private int icecreams;
	private int totalCost;

	public void orderItems() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items you want to order");
		System.out.println("Enter number of candies:");
		this.candies=sc.nextInt();		
		System.out.println("Enter number of cookies:");
		this.cookies=sc.nextInt();
		System.out.println("Enter number of Ice creams:");
		this.icecreams=sc.nextInt();
		//Cookie co2 = new Cookie();
		Cookie co1=Cookie.getInstance();
		co1.updateCookies(cookies);
		Candy ca1=Candy.getInstance();
		ca1.updateCandies(candies);
		IceCream ice1=IceCream.getInstance();
		ice1.updateIceCreams(icecreams);
		this.totalCost=co1.getCost()+ca1.getCost()+ice1.getCost();
		System.out.println("The total cost is:"+this.totalCost);
	
	}
	

}
