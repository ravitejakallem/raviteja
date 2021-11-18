package javabasics.com;

import java.util.Scanner;

public class OccurenceOfString {

	public static void main(String[] args) {
	       Scanner sc= new Scanner(System.in);
	        System.out.print("Please give a String : ");  
		      String str= sc.nextLine();  
		      Scanner sc1= new Scanner(System.in);
		        System.out.print("Please give a char to count occurence: ");  
		        char ch= sc1.next().charAt(0);
		        System.out.print("Total Number of occurence of '"+ch+"' is: "); 
		        System.out.println(countOccurence(str, ch));
		    }  
		    public static int countOccurence(String str, char ch){
		        char arr[] = new char[str.length()]; 
		        int c=0;
		        for(int i=0; i<str.length();i++ ){
		            arr[i] = str.charAt(i);
		            if(arr[i]==ch){
		                c++;
		            }
		        }
		        return c;
		     }
		}   
		
