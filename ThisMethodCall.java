package Basics;

class A1
{
	void M()
	{
		System.out.println("Hello from M");
	}
	void N()
	{
		System.out.println("Hello from N");
		this.M();
	}
}

public class ThisMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		a.N();
	}

}
