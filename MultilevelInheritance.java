package Basics;

class GrandParent
{
	void fromGrandParent()
	{
		System.out.println("From GrandParent Class");
	}
}

class Parent extends GrandParent
{
	void fromParent()
	{
		System.out.println("From Parent Class");
	}
}

class Child extends Parent
{
	void fromChild()
	{
		System.out.println("From Child Class");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Child cd = new Child();
		cd.fromGrandParent();
		cd.fromParent();
		cd.fromChild();

	}

}
