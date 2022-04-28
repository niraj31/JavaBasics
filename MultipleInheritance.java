package Basics;

interface A
{
	void show();
}
interface B
{
	void show();
}
class Child1 implements A, B
{
	public void show()
	{
		System.out.println("Hello");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Child1 c = new Child1();
		c.show();
	}

}
