package javabasics.com;

public class Arithemethic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("hello world");

		int i= 48;
		int j= 256;
		//int k=j+3100;
		j+=3100;
		

		System.out.println("assignmentoperator="+j);
		
		int K=300;
		K++;
		
		System.out.println("postincrement="+K);
		
		int Ro=500;
		++Ro;
		System.out.println("preincrement="+Ro);
		
		System.out.println(K==Ro);//comparision operator if values are equal o/p true else false
		System.out.println(K<=Ro);
		System.out.println(K>=Ro);
		System.out.println(K>Ro);
		System.out.println(K<Ro);
		
		
		System.out.println("add=" +(i+j));
		System.out.println("multiply=" +(i*j));
		System.out.println("division="+(i/j));
		System.out.println("Subtraction="+(i-j));
		System.out.println("reminder="+(i%j));

float f1=488.96f;
float f2=987.98f;
float f4=1068.98f;
System.out.println("f3="+(f1+f2));
System.out.println("f3="+(f1*f2));
System.out.println(f2);

byte b=80;
int a=b;

System.out.println("b="+b);
System.out.println("a="+a);

byte b6=(byte)a;

System.out.println("casting="+b6);



 }
 
}