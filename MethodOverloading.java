package Basics;

class Sample1
{
	int add(int x, int y)
	{
		return x+y;
	}
	int add(int x, int y, int z)
	{
		return x+y+z;
	}
	float add(float x, float y)
	{
		return x+y;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Sample1 s = new Sample1();
		System.out.println(s.add(10, 20));	
		System.out.println(s.add(10, 20, 30));
		System.out.println(s.add(2.3f, 4.1f));
	}

}
