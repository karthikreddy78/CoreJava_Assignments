package OOPS;

public class Candy extends DessertItem {
	private int candycost;
	private int candies;
	private int candyOrdered;
	
	
	
	private static Candy singleton_obj=null;
	private Candy()
	{
		//System.out.println("First instance");
	}
	public static Candy getInstance()
	{
		if(singleton_obj==null)
		{
			singleton_obj=new Candy();
		}
		return singleton_obj;
	}
	
	
	
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		System.out.println("Candycost:"+ this.candycost +" Candies:"+this.candies+" candies ordered:"+this.candyOrdered);
		return this.candycost*60*this.candyOrdered;
		
	}
	/**
	 * @return the candycost
	 */
	
	/**
	 * @param candycost the candycost to set
	 */
	public void setCandycost(int candycost) {
		this.candycost = candycost;
	}

	public void addCandy(int candies) {
		// TODO Auto-generated method stub
		this.candies=candies;
		System.out.println("Candycost:"+ this.candycost +" Candies:"+this.candies+" candies ordered:"+this.candyOrdered);
		
	}

	public void updateCandies(int candies2) {
		// TODO Auto-generated method stub
		this.candies-=candies2;
		this.candyOrdered=candies2;
		
	}
	

}
