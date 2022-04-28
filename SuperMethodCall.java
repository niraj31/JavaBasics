package Basics;

class A3
{
	void getFromA3()
	{
		System.out.println("From A3");
	}
}
class B3 extends A3
{
	void getFromB3()
	{
		super.getFromA3();
		System.out.println("From B3");
	}
}
public class SuperMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B3 b = new B3();
		b.getFromB3();
	}

}
