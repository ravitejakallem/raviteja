package javabasics.com;
public class DuplicateInArray {

	public static void main(String[] args) {
			
		int[] b= {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};	
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					System.out.println("Found Duplicate Element:"+b[i]);
					
				}		
			}
	}

}
}
