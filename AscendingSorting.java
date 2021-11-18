package javabasics.com;

public class AscendingSorting {

	public static void main(String[] args) {
		
		int arr[]=new int[] {50,70,1,9,98,5,-2};
	    int temp=0;
	    
	System.out.println("elements of original array");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+"");
	}
//Sorting in ascending order
	
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	System.out.println("elements after sorting");
		for(int i1=0;i1<arr.length;i1++)
		{
			System.out.println(arr[i1]+"");
		}
	}
	}

}
