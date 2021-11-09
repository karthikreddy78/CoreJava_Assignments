package OOPS;

import java.util.Scanner;

public class Owner {
	private int cookies;
	private int candies;
	private int icecreams;
	private int candiecost;
	private int cookiecost;
	private int icecreamcost;
	public void addItems() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Cookie co=Cookie.getInstance();
		Candy ca=Candy.getInstance();
		IceCream ice=IceCream.getInstance();
		System.out.println("Enter cost of candy in $:");
		candiecost = sc.nextInt();
		System.out.println("Enter cost of cookie in euros:");
		cookiecost=sc.nextInt();
		System.out.println("Enter cost of icecream in rs:");
		icecreamcost=sc.nextInt();
		co.setCookieCost(cookiecost);
		ca.setCandycost(candiecost);
		ice.setIcecreamCost(icecreamcost);
		
		System.out.println("Enter the number of items to be added in storage");
		System.out.println("Enter number of candies:");
		this.candies=sc.nextInt();		
		System.out.println("Enter number of cookies:");
		this.cookies=sc.nextInt();
		System.out.println("Enter number of Ice creams:");
		this.icecreams=sc.nextInt();	
		
		co.addCookie(cookies);
		
		ca.addCandy(candies);
		
		ice.addiceCream(icecreams);
	}

}
