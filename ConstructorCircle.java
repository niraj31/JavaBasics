package Basics;

public class ConstructorCircle {
	float area,circum;
	float r,pi=3.14f;
	public ConstructorCircle(float r) {
		// TODO Auto-generated constructor stub
		this.r=r;
	}
	float areaOfCircle()
	{
		return area=pi*r*r;
	}
	float areaOfCircum()
	{
		return circum=2*pi*r;
	}
	public static void main(String[] args) {
		ConstructorCircle cc =  new ConstructorCircle(13.52f);
		System.out.println(cc.areaOfCircle());
		System.out.println(cc.areaOfCircum());
	}

}
