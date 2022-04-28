package Basics;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many rows and columns you want..: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int result[][]=new int[r][c];
		
		System.out.println("Enter the values for Matrix 1: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the values for Matrix 2: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of Two Matrix: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(result[i][j]=a[i][j]+b[i][j]);
				System.out.print("\t");
	
			}
			System.out.println();
		}

	}

}
