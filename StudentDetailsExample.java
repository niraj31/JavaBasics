package Basics;
import java.util.*;
public class StudentDetailsExample {
	int rollNo;
	String name;
	float m1,m2,m3,total=0,avg=0;
	Scanner sc=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter Roll Number: ");
		rollNo=sc.nextInt();
		
		System.out.println("Enter Name: ");
		name=sc.next();
		
		System.out.println("Enter Marks: ");
		m1=sc.nextFloat();
		m2=sc.nextFloat();
		m3=sc.nextFloat();
	}
	void calculate()
	{
		total=m1+m2+m3;
		avg=total/3;
	}
	void getResult()
	{
		System.out.println("Roll Number: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Marks 1 : "+m1);
		System.out.println("Marks 2 : "+m2);
		System.out.println("Marks 3 : "+m3);
		System.out.println("Total : "+total);
		System.out.println("Average : "+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetailsExample sde=new StudentDetailsExample();
		sde.getData();
		sde.calculate();
		sde.getResult();

	}

}
