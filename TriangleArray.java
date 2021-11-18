package javabasics.com;

import java.util.Scanner;

public class TriangleArray {

	public static void main(String[] args) {
		int[][] k=new int[10][10];
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a value");
		int rownumber=scanner.nextInt();
		System.out.println("enter the rownumber:"+rownumber);
		for(int i=1;i<=rownumber;i++)
		{
			for(int j=1;j<=((rownumber/2)-i);j++)
			{
				System.out.println(" ");
			}
				for(int s=1;s<=((2*i)-i);s++)
				{
					System.out.println("0");
				}
			
			}
		}

	}


