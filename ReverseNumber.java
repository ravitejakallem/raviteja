package javabasics.com;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev=0,r;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number for sum operation");
		int reverse=scanner.nextInt();
		
	while(reverse>0)
	{
		r=reverse%10;
		rev=rev*10+r;
		reverse=reverse/10;
	}
System.out.println("reverse of a number:"+rev);
	}

}
