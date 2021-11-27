package javabasics.com;

import java.util.HashSet;
import java.util.Set;

public class CopyElementsHashToObj {

	public static void main(String[] args) {
		 Set<Integer> hs = new HashSet<Integer>();
	      hs.add(1);
	      hs.add(2);
	      hs.add(3);
	      hs.add(4);
	      hs.add(5);
	    
	      System.out.println("elements in the hash set is"+hs);
	      System.out.println("Copying all elements...");
	      Object[] obArr = hs.toArray();
	      for (Object ob : obArr)
	      System.out.println(ob);
	   }
	}
