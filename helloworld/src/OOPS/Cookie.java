package OOPS;

public class Cookie extends DessertItem{
	private int cookieCost;
	private int cookies;
	private int cookiesOrdered;
	
	
	private static Cookie singleton_obj=null;
	private Cookie()
	{
		//System.out.println("First instance");
	}
	public static Cookie getInstance()
	{
		if(singleton_obj==null)
		{
			singleton_obj=new Cookie();
		}
		return singleton_obj;
	}
	
	
	
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		System.out.println("Cookie cost:"+ this.cookieCost +" Cookies:"+this.cookies+" cookies ordered:"+this.cookiesOrdered);

		return this.cookieCost*70*this.cookiesOrdered;
	}
	/**
	 * @param cookieCost the cookieCost to set
	 */
	public void setCookieCost(int cookieCost) {
		this.cookieCost = cookieCost;
	}
	public void addCookie(int cookies) {
		// TODO Auto-generated method stub
		this.cookies=cookies;
		System.out.println("Cookie cost:"+ this.cookieCost +" Cookies:"+this.cookies+" cookies ordered:"+this.cookiesOrdered);

		
	}
	public void updateCookies(int cookies2) {
		// TODO Auto-generated method stub
		this.cookies-=cookies2;
		this.cookiesOrdered=cookies2;
	}
	

}
