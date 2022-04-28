package Basics;

abstract class Shape
{
	abstract void draw();
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle is drawing");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Square is drawing");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle is drawing");
	}
}

public class AbstractTask {

	public static void main(String[] args) {
		Circle c = new Circle();
		Square s = new Square();
		Rectangle r = new Rectangle();
		
		c.draw();
		s.draw();
		r.draw();

	}

}
