package Basics;

import java.util.Scanner;

class Customer
{
	String name;
	int id;
	Scanner sc = new Scanner(System.in);
	void setCustDetails()
	{
		System.out.println("Enter Customer Name");
		name=sc.next();
		System.out.println("Enter Customer ID");
		id=sc.nextInt();
	}
	void getCustDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
	}
	
}
class Product extends Customer
{
	String name;
	int id;
	float price;
	Scanner sc = new Scanner(System.in);
	void setProDetails()
	{
		System.out.println("Enter Product Name");
		name=sc.next();
		System.out.println("Enter Product ID");
		id=sc.nextInt();
		System.out.println("Enter Product Price");
		price=sc.nextFloat();
	}
	void getProDetails()
	{
		System.out.println("Product Name: "+name);
		System.out.println("Product ID: "+id);
		System.out.println("Enter Product Price"+price);
	}
	
}
class Account extends Product
{
	String name;
	int id;
	float price;
	Scanner sc = new Scanner(System.in);
	void setProDetails()
	{
		System.out.println("Enter Product Name");
		name=sc.next();
		System.out.println("Enter Product ID");
		id=sc.nextInt();
		System.out.println("Enter Product Price");
		price=sc.nextFloat();
	}
	void getProDetails()
	{
		System.out.println("Product Name: "+name);
		System.out.println("Product ID: "+id);
		System.out.println("Enter Product Price"+price);
	}
	
}

public class HierarchicalExample {

	public static void main(String[] args) {
		

	}

}
