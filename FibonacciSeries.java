package javabasics.com;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a value");
		int Number=scanner.nextInt();
		int a=0,b = 1,c;
		for(int i=1;i<=Number;i++)
		{
			c=a+b;
			System.out.println("Fibonacci series:"+c);	
			a=b;
			b=c;
			
		}

	}

}
