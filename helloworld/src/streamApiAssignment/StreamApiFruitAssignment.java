package streamApiAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class StreamApiFruitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> f = new ArrayList<>();
		f.add(new Fruit( "Mango", 90, 50, "yellow"));
		f.add(new Fruit( "Apple", 120, 60, "red"));
		f.add(new Fruit( "Banana", 250, 20, "yellow"));
		f.add(new Fruit( "Cherry", 70, 70, "pink"));
		f.add(new Fruit( "Grape", 60, 40, "green"));
		f.add(new Fruit( "PineApple", 90, 120, "yellow"));
		f.add(new Fruit( "Orange", 79, 60, "orange"));
		f.add(new Fruit( "Strawberry", 99, 80, "red"));
		
		f.stream()
		.filter(p->p.getCalories()<100)
		.sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
		.forEach(p->System.out.println(p));
		
		System.out.println();
		f.stream()
		.sorted(Comparator.comparing(Fruit::getColor))
		.forEach(p->System.out.println(p));
		
		System.out.println();
		
		f.stream()
		.filter(p->p.getColor().equalsIgnoreCase("red"))
		.sorted(Comparator.comparingInt(Fruit::getPrice))
		.forEach(p->System.out.println(p));
	}

}
