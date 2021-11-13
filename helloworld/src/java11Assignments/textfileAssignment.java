package java11Assignments;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class textfileAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var path="C:\\Users\\KREDDYMU\\OneDrive - Capgemini\\Documents\\StudentList.txt";
		try
		{
			//Files.writeString(Path.of(path),"\nHarsha", StandardOpenOption.APPEND);
			String data=Files.readString(Path.of(path));
			
			List<String>str=data.lines()
					.map(s->s.trim())
					.filter(s -> !s.isEmpty())
		             .collect(Collectors.toList());
			
			for (String string : str) {
				System.out.println(string);
			}
			System.out.println("The total students are :"+str.size());
		//Normal way to solve	
			
//			String []s=data.split("\n");
//			int count=0;
//			for(String s1:s)
//			{
//				s1=s1.replace("\n", "").replace("\r", "");
//				if(!s1.equals(""))			
//				{
//					count++;
//					System.out.println(s1);
//				}
//				
//			}
//			System.out.println("The total students are :"+count);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
