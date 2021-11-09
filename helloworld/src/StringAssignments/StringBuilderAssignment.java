package StringAssignments;

public class StringBuilderAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s=new StringBuilder("");
		s.append("String Builder");
		System.out.println(s);
		s.append(" is a peer class of String");
		s.append(" that provides much of ");
		s.append("the functionality of strings");
		System.out.println(s);
		StringBuilder s1=new StringBuilder("It is used to _ at the end of string");
		s1.insert(15, " insert text");
		System.out.println(s1);
		s1.replace(14,15,"insert text");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("This method returns the reversed object");
		s2.reverse();
		System.out.println(s2);
		

	}

}
