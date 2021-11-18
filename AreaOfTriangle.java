package javabasics.com;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a value for height");
		double h=scanner.nextDouble();
		Scanner scanner1=new Scanner(System.in);
		System.out.println("enter a value for base");
		double base=scanner1.nextDouble();
		double Area= (0.5*base*h);
		System.out.println("area of triangle is:"+Area);

	}

}
