package Basics;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Integer Value");
		int i= sc.nextInt();
		
		System.out.println("Enter String Value");
		String s= sc.next();
		
		System.out.println("Enter Float Value");
		float f= sc.nextFloat();
		
		System.out.println("Integer Value"+i);
		System.out.println("String Value"+s);
		System.out.println("Float Integer Value"+f);

	}

}
