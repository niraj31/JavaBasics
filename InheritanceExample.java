package Basics;

class Example1
{
	void parentMethod()
	{
	System.out.println("Hello from Parent");
	}
}
class Example2 extends Example1
{
	void childMethod() {
	System.out.println("Hello from Child");
	}
}

public class InheritanceExample {
	public static void main(String args[])
	{
		Example2 ex2=new Example2();
		ex2.parentMethod();
		ex2.childMethod();
	}

}
