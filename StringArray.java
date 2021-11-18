package javabasics.com;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		//PrimeNumber
		/*		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a value");
		int Number=scanner.nextInt();
		int counter=2;
		boolean B1=false;
		while (counter<Number)
		{
			if(Number%counter==0)
			{
				System.out.println(counter+" "+ Number/counter);
				B1=true;
				break;
			}
			counter++;
		}
if(B1)
{
	System.out.println("given number is not prime"+Number);
}
else {
	System.out.println("given number is prime");
}
*/	
//Arrays
		/*int[] i=new int[10];
		for(int index=0;index<i.length-1;index++)
		{
			System.out.println(i[index]);
		}*/
//Storing value in to array		
/*int[] i=new int[10];		
int start=5;
for(int index=0;index<i.length-1;index++)
{
	i[index]=start;
	start+=5;
}
for(int index=0;index<i.length-1;index++)
{
	System.out.println(i[index]);
}*/
/*		//to find search operation in an array
		int[] b= {10,22,130};
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter value");
		int input=scanner.nextInt();
		boolean b2=false;
		for(int index=0;index<b.length-1;index++)
		{
			if(b[index]==input)
			{
				System.out.println(input +"b2 in"+index);
				b2=true;
			}
		}
		if(!b2)
		{
			System.out.println(input +"b2 is not found");
		}*/
		
		String[] str= {"hello","world","genious","ravi"};
		
		for(int index=0;index<str.length;index++)
		{
			System.out.println(str[index]);
			//System.out.println(str[index]);
		}
		
		
		
	}

}
