package javabasics.com;

public class ReverseArray {

	public static void main(String[] args) {
		int[] i=new int[10];		
		int start=0;
		for(int index=0;index<i.length-1;index++)
		{
			i[index]=start;
			start+=5;
		}
		for(int index=0;index<i.length-1;index++)
		{
			System.out.println(i[index]);
		}
		System.out.println("array reverse elements:");
		for(int index=i.length-1;index>=0;index--)
		{
			System.out.println(i[index]);
		}
		
		}

	}


