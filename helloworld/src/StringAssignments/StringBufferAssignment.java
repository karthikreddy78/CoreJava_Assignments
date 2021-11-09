package StringAssignments;

public class StringBufferAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("");
		s.append("String Buffer");
		System.out.println(s);
		s.append(" is a peer class of String");
		s.append(" that provides much of ");
		s.append("the functionality of strings");
		System.out.println(s);
		StringBuffer s1=new StringBuffer("It is used to _ at the end of string");
		s1.insert(15, " insert text");
		System.out.println(s1);
		s1.replace(14,15,"insert text");
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("This method returns the reversed object");
		s2.reverse();
		System.out.println(s2);
		

	}

}
