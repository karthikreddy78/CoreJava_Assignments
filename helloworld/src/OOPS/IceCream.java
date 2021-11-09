package OOPS;

public class IceCream extends DessertItem{
	private int icecreamCost;
	private int icecreams;
	private int icecreamOrdered;
	
	
	private static IceCream singleton_obj=null;
	private IceCream()
	{
		//System.out.println("First instance");
	}
	public static IceCream getInstance()
	{
		if(singleton_obj==null)
		{
			singleton_obj=new IceCream();
		}
		return singleton_obj;
	}
	
	
	
	
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		System.out.println("Icecream cost:"+ this.icecreamCost +" Icecreams:"+this.icecreams+" icecreams ordered:"+this.icecreamOrdered);

		return this.icecreamCost*this.icecreamOrdered;
	}
	/**
	 * @param icecreamCost the icecreamCost to set
	 */
	public void setIcecreamCost(int icecreamCost) {
		this.icecreamCost = icecreamCost;
	}
	public void addiceCream(int icecreams) {
		// TODO Auto-generated method stub
		this.icecreams=icecreams;
		System.out.println("Icecream cost:"+ this.icecreamCost +" Icecreams:"+this.icecreams+" icecreams ordered:"+this.icecreamOrdered);

	}
	public void updateIceCreams(int icecreams2) {
		// TODO Auto-generated method stub
		this.icecreams-=icecreams2;
		this.icecreamOrdered=icecreams2;
		
	}
	

}
