package Basics;

final class Final
{
	final int i=10;
	final void getFinal()
	{
		System.out.println("Final Value = "+i);
	}
}
class SemiFinal extends Final
{
	void getSemiFinal()
	{
		System.out.println("From SemiFinal");
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		SemiFinal sf = new SemiFinal();
		sf.getSemiFinal();

	}

}
