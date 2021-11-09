package genericAssignment;
import java.util.*;
public class PairTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pair<String,String>p=new Pair<String,String>();
		System.out.println(p.getKey()+" "+p.getValue());
		p.setKey("Joker");
		p.setValue("Batman");
		System.out.println(p.getKey()+" "+p.getValue());
		Pair<String,java.util.Date> p1= new Pair<String,java.util.Date>();
		p1.setKey("Karthik");
		p1.setValue(new java.util.Date());
		System.out.println(p1.getKey()+" "+p1.getValue());

	}

}
