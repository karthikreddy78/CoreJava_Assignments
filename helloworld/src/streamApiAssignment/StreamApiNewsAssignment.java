package streamApiAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiNewsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<News> n = new ArrayList<>();
		n.add(new News(25, "karthik78", "deepak219", "good budget"));
		n.add(new News(25, "karthik78", "devon1", "avg"));
		n.add(new News(25, "karthik78", "avesh12", "bad"));
		n.add(new News(20, "deepak219", "karthik78", "good"));
		n.add(new News(20, "deepak219", "deepak90", "bad budget"));
		n.add(new News(12, "rithvik12", "deepak219", "good"));
		n.add(new News(12, "rithvik12", "karthik78", "good"));
		n.add(new News(12, "rithvik12", "h9", "bad"));
		n.add(new News(12, "rithvik12", "u19", "good"));
		n.add(new News(2, "k78", "k219", "good"));
		n.add(new News(6, "kar78", "ak219", "avg"));
		System.out.println(n.stream().map(x->x.getNewsId()));
		
		int count=(int) n.stream()
				.filter(x-> x.comment.contains("budget"))
				.count();
		System.out.println(count);
		
		 Stream<String> max = (n.stream().map(x->x.commentByUser));
		 System.out.println(max.collect(Collectors.toList()));
		
		 n.stream().map(x->x.commentByUser)
			.sorted()
			.forEach(System.out::println);
	}

	private static String count(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

}
