package Basics;
import java.util.*;
public class StudentArrayExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Emter Number of Students");
		int n= sc.nextInt();
		
		int rollNo[]=new int[n];
		String name[]=new String[n];
		float marks[]=new float[n];
		
		System.out.println("Enter Roll Number:");
		for(int i=0;i<rollNo.length;i++)
		{
			rollNo[i]=sc.nextInt();
		}
		System.out.println("Enter Name:");
		for(int i=0;i<name.length;i++)
		{
			name[i]=sc.next();
		}

		System.out.println("Enter Marks:");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextFloat();
		}
		
		for(int i=0;i<rollNo.length;i++)
		{
			System.out.println("Roll Number:"+rollNo[i]);
		}
		for(int i=0;i<name.length;i++)
		{
			System.out.println("Name:"+name[i]);
		}
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks"+marks[i]);
		}

	}

}
