package Basics;

class Students
{
	int rollNo;
	String name;
	float fee;
	Students(int rollNo, String name, float fee)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.fee=fee;
	}
	void getData()
	{
		System.out.println("Roll Number: "+rollNo+" Name: "+name+" Fees: "+fee);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		Students s1 = new Students(32,"Niraj",17832.90f);
		s1.getData();

	}

}
