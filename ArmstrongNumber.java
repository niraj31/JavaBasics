package Basics;

public class ArmstrongNumber {

	void armStrongNumber(int num)
	{
		int total=0;
		int number=num;
		while (num!=0)
		{
			int temp=num%10;
			total=total+temp*temp*temp;
			num=num/10;
		}
		if(total==number)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}
	public static void main(String[] args) {
		ArmstrongNumber a1=new ArmstrongNumber();
		a1.armStrongNumber(153);

	}

}
