package java11Assignments;

import java.util.Arrays;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A quick brown fox jumps over the lazy dog";
		List<String> items = Arrays.asList(s.split(" "));
		
		for(String l:items)
		{
		System.out.println(l);
		}
		Object[] s1 = items.toArray();
		System.out.println(Arrays.toString(s1));
	}

}
