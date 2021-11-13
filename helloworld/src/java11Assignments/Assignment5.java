package java11Assignments;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var path="C:\\Users\\KREDDYMU\\OneDrive - Capgemini\\Documents\\PriceValues.txt";
		Scanner sc=new Scanner(System.in);
		int choice=0;
		int count=0;
		do
		{
			System.out.println("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit)");
			choice =sc.nextInt();
			if(choice==1)
			{
				String s;
				do
				{
					count++;
					System.out.println("Insert "+count+ " price:");
					int price = sc.nextInt();
					
					try
					{
						Files.writeString(Path.of(path),Integer.toString(price)+" ", StandardOpenOption.APPEND);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					
					
					
					System.out.println("Price has been saved to the file");
					System.out.println("Do you want to enter price for more items? (Yes/No)");
					s=sc.next();
				}while(!s.equalsIgnoreCase("no"));
			}
			else if(choice == 2)
			{
				int sum=0;
				String data;
				try {
					data = Files.readString(Path.of(path));
				
					//using lambda features
					List<String>str=data.lines()
							.map(s->s.trim())
							.filter(s -> !s.isEmpty())
				             .collect(Collectors.toList());
					for (String string : str) {
						System.out.println(string);
						int x=Integer.parseInt(string);
						sum=sum+x;
					}
					System.out.println("Total Price of all items is: "+sum);
					
					
					
					
					//Normal way 
					/*
					String []s2=data.split(" ");
					for(String s1:s2)
					{
						s1=s1.replace("\n", "").replace("\r", "");
						if(!s1.equals(""))			
						{
							int x=Integer.parseInt(s1);
							sum=sum+x;
							System.out.println(s1);
						}

					}
					System.out.println("Total Price of all items is: "+sum);
					*/
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				PrintWriter writer;
				try {
					writer = new PrintWriter(path);
					writer.print("");
					writer.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				System.out.println("exit program");
			}
		}while(choice!=3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
