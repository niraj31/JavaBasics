package Basics;

class Alpha
{
	void show()
	{
		System.out.println("Inside Alpha");
	}
}
class Beta extends Alpha
{
	void show()
	{
		System.out.println("Inside Beta");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beta b = new Beta();
		b.show();

	}

}
