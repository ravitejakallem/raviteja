package javabasics.com;

import java.util.Scanner;

public class FactorialNumber {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a value");
		int Number=scanner.nextInt();
		int i=1;
		int factorial=1;
		
		while(i<=Number)
		{
		factorial=factorial*i;//fact=1*1;fact=1*2;fact=2*3;fact=6*4;fact=24*5;
			i++;
			
		}
System.out.println("factorial of given number is:"+factorial);

	}

}
