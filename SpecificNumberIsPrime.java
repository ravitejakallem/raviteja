package javabasics.com;

import java.util.Scanner;

public class SpecificNumberIsPrime {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a value");
		int Number=scanner.nextInt();
        int c=2;
        boolean b=false;
        while(Number>c)
        {
        	if(Number%c==0)
        	{
        		System.out.println(c+" "+ Number/c);
				b=true;
				break;
			}
			c++;
        	}
        
	if(b)
	{
		System.out.println("given number is not prime"+Number);
	}
	else {
		System.out.println("given number is prime"+Number);
	}
	}

}
