package javabasics.com;

public class StringToCharacterToString {

	public static void main(String[] args) {
		String str = "RaviKallem";
		  
        
       char[] ch = new char[str.length()];
 
      for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            System.out.println(ch[i]);
        }
 
        
        char[] ch1 = {'R', 'A', 'V', 'I', 'T', 'E', 'J','A'};  
      
      String s = new String(ch1);  
    
      System.out.println(s);  
             

}
}
