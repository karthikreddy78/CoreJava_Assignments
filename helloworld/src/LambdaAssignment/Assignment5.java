package LambdaAssignment;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Assignment5 {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("Knife");
		words.add("axe");
		words.add("rhino");
		words.add("table");
		words.add("horse");
		words.add("ink");
		words.add("kite");
		System.out.println(words);
		StringBuilder s= new StringBuilder();
		Consumer<String> c = p->s.append(p.charAt(0));
		for(String l:words)
		{
			c.accept(l);
		}
		
		List<String> list2 = Arrays.asList("justin", "nancy", "cooc", "amy", "david");
		list2.replaceAll(s1 -> s1.toUpperCase());
		System.out.println(list2);
		//list2.forEach(c); 
		/*
		UnaryOperator<String>t=p->p.replaceAll(, p);
		words.replaceAll();
		System.out.println(s);

	*/
	}

}
