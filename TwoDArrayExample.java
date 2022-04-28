package Basics;
import java.util.*;
public class TwoDArrayExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many rows and cols you want?");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int d[][]=new int[r][c];
		
		System.out.println("Enter the values for 2D Array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				d[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
