package Basics;
import java.util.*;

public class ArrayEmployee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of Employees");
		int num=sc.nextInt();
		
		int empNo[]=new int[num];
		String empName[]=new String[num];
		float empSal[]=new float[num];

		System.out.println("Enter Employee Number");
		for(int i=0;i<num;i++)
		{
			empNo[i]=sc.nextInt();
		}
		System.out.println("Enter Employee Name");
		for(int i=0;i<num;i++)
		{
			empName[i]=sc.next();
		}
		System.out.println("Enter Employee Salary");
		for(int i=0;i<num;i++)
		{
			empSal[i]=sc.nextFloat();
		}
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Employee Number: "+empNo[i]);
		}
		for(int i=0;i<num;i++)
		{
			System.out.println("Employee Name: "+empName[i]);
		}
		for(int i=0;i<num;i++)
		{
			System.out.println("Employee Salary: "+empSal[i]);
		}
	}

}
