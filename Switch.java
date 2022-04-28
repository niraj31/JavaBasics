package Basics;

public class Switch {

	public static void main(String[] args) {
		int average=75;
		
		switch(average)
		{
		case 85: System.out.println("First Class");
					break;
		
		case 75: System.out.println("Second Class");
		break;
		
		case 65: System.out.println("Third Class");
		break;
		
		default: System.out.println("Not Eligible");
		break;
		}
		

	}

}
