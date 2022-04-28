package Basics;

class A4
{
	A4()
	{
		System.out.println("From A4 constructor");
	}
}
class B4 extends A4
{
	B4()
	{
		super();
		System.out.println("From B4 constructor");
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B4 b = new B4();
	}
}
