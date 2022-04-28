package Basics;

class Wolf
{
	String color="Black";
}
class Dog extends Wolf
{
	String color="White";
	void getColor()
	{
		System.out.println("Color="+color);
		System.out.println("Color="+super.color);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.getColor();

	}

}
