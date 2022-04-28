package Basics;

class A2
{
	A2()
	{
		System.out.println("Hello from constructor without parameter");
	}
	A2(int x)
	{
		this();
		System.out.println("X="+x);
	}
}

public class ThisConstructorCall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a = new A2(10);
	}

}
