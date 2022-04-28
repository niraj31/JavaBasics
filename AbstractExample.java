package Basics;

abstract class BankROI
{
	void display()
	{
		System.out.println("Hello From Abstract Class");
	}
	abstract float roi();
}
class Sbi extends BankROI
{

	@Override
	float roi() {
		return 9.2f;
	}
	
}
class Icici extends BankROI
{
	float roi()
	{
		return 10.3f;
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		Sbi s1 = new Sbi();
		s1.display();
		System.out.println(s1.roi());
		
		Icici i1 = new Icici();
		i1.display();
		System.out.println(i1.roi());

	}

}
