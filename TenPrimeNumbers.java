package javabasics.com;


public class TenPrimeNumbers {

	public static void main(String[] args) {
int i,number,count;

System.out.println("first 10 prime numbers are:");

for(number=1;number<=30;number++)
{
	count=0;
	for(i=2;i<=number/2;i++)
	{
		if(number%i==0)
		{
			count++;
			break;
		}
	}
	if((count==0)&&(number!=1))
	{
		System.out.println("Prime Number"+number);
	}
	
}

}

}		
