package Basics;

class Address
{
	String city, state, country;
	
	Address(String city, String state, String Country)
	{
		this.city=city;
		this.state=state;
		this.country=Country;
	}
}
class Emp
{
	String name;
	Address add;
	int empid;
	Emp(String name, Address add, int empid)
	{
		this.name=name;
		this.add=add;
		this.empid=empid;
	}
	void display()
	{
		System.out.println("Empid: "+empid+" Employee Name: "+name);
		System.out.println("City: "+add.city+" State: "+add.state+" Country: "+add.country);
	}
}

public class Aggregation {

	public static void main(String[] args) {
		Address a = new Address("Pune","Maharashtra","India");
		Emp e = new Emp("Alen",a,101);
		
		e.display();

	}

}
