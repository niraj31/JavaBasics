package Basics;

public class NumberOfOcc {
	public static void main(String args[])
	{
		int number=4414;
		int no=4;
		int count=0;
		while(number!=0)
		{
			int temp=number%10;
			if(temp==no)
			{
				count++;
			}
			number=number/10;
		}
		System.out.println(count);
	}

}
