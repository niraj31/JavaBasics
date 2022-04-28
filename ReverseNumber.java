package Basics;

public class ReverseNumber {
	int store=0;
	void numberReverse(int num)
	{
		while(num!=0) {
			
		int temp=num%10;
		store=store*10+temp;
		num=num/10;
		}
		System.out.println(store);
	}
	public static void main(String args[])
	{
		ReverseNumber rv = new ReverseNumber();
		rv.numberReverse(153);
	}
}
