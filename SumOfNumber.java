package javabasics.com;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		int sum=0,r;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number for sum operation");
		int add=scanner.nextInt();
while(add>0)
{
	r=add%10;
	sum=sum+r;
	add=add/10;
}
System.out.println("sumofnumbers are:"+sum);
	}

}
