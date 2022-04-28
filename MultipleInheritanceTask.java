package Basics;

interface Circle1
{
	void draw();
}
interface Square1
{
	void draw();
}
class Shape1 implements Circle1, Square1
{
	public void draw()
	{
		System.out.println("Circle and Square are drawn");
	}
}

public class MultipleInheritanceTask {

	public static void main(String[] args) {
		Shape1 s = new Shape1();
		s.draw();
	}

}
