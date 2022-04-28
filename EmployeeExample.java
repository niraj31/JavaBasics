package Basics;

public class EmployeeExample {
	public static void main(String[] args) {
		String empname="Niraj";
		float basicsal=25000,hra;
		if(basicsal>=25000)
		{
			hra=basicsal*20/100;
			System.out.println(hra);
		}
		else if(basicsal>=35000)
		{
			hra=basicsal*30/100;
			System.out.println(hra);
		}
		else
		{
			System.out.println("Salary Less than 2000");
		}
	}

}
