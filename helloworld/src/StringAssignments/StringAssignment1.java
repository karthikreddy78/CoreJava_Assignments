package StringAssignments;

public class StringAssignment1 {
	public static void main(String args[])
	{
		String s=new String("Hello World");
		String s2 =new String(" How are you?");
		System.out.println(s.length());
		s=s.concat(s2);
		System.out.println(s);
		String s3= new String("string pool in java is a collection of Strings stored in heap memory");
		String s4=s3.toLowerCase();
		System.out.println(s4);
		System.out.println(s3.toUpperCase());
		String s5 =s3.replace('a', '$');
		System.out.println(s5);
		String s6="string pool in java is a collection of strings stored in heap memory";
		if(s6.equals(s3))
			{
					System.out.println("Same");
			}
		else
			{
					System.out.println("Different");
			}
		System.out.println(s6.equalsIgnoreCase(s3));
		
		
		
	}
}
