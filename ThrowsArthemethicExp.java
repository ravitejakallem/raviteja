package javabasics.com;


public class ThrowsArthemethicExp {

	public static void main(String[] args) {
		
		int x=0,y=1,div;
		try
		{
			div=y/x;
			System.out.println(div);
		}
		catch(exp ae)
		{
			System.err.println("you are dividing number with Zero");
		}
		

	}

}
