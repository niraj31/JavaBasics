package Basics;
import java.util.*;
public class ScannerTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of consumer");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter Meter Number");
		int meterNumber = sc.nextInt();
		
		System.out.println("Enter Consumer Name");
		String consumerName= sc.next();
		
		System.out.println("Enter Per Unit Price");
		float perUnitPrice= sc.nextFloat();
		
		System.out.println("Enter Total Units");
		float totalUnits = sc.nextFloat();
		
		float totalAmount=totalUnits*perUnitPrice;
		
		System.out.println("Meter Number="+meterNumber);
		System.out.println("ConsumerName="+consumerName);
		System.out.println("Per Unit Price="+perUnitPrice);
		System.out.println("Total Units="+totalUnits);
		System.out.println("Total Amount="+totalAmount);
		}
	}

}
