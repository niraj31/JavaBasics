package Basics;
import java.util.Scanner;
public class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many rows and columns you want..: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		
		System.out.println("Enter the values: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original Array: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("Copied Array: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(b[i][j]=a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
