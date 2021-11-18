package javabasics.com;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=scanner.next();
		String Original=str;
		String rev="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);	
		}
		if(Original.equals(rev))
		{
			System.out.println("Palindrome:"+Original);
		}
		else {
			System.out.println("Not Palindrome:"+Original);
		}
	}
}




