package javabasics.com;

import java.util.Scanner;

public class AverageArray {

	public static void main(String[] args) {
		float[] b= {10.8f,22.9f,130.7f};
		float sum=0;
        float Average;
        for(int index=0;index<b.length;index++)
		{
        	   sum+=b[index];
		}
        Average=sum/b.length;
			
				System.out.println("Average of numbers:"+Average);
				
     
        
	}

}
