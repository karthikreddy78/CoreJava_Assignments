package OOPS;
import java.util.*;
class App
{
	private static App singleton_obj=null;
	private App()
	{
		System.out.println("First instance");
	}
	public static App getInstance()
	{
		if(singleton_obj==null)
		{
			singleton_obj=new App();
		}
		return singleton_obj;
	}
}
public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App a= App.getInstance();
		App b=App.getInstance();
		if(a==b)
		{
			System.out.print("Same object created");
		}
		else
		{
			
				System.out.print("Different object created");
		}
				
	}

}
