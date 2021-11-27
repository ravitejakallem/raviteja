package javabasics.com;

import java.util.Hashtable;

public class ParticularKeyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable ht = new Hashtable();
		   
		    //add key value pairs to Hashtable
		    ht.put("1","One");
		    ht.put("2","Two");
		    ht.put("3","Three");
		   
		    /*
		      To check whether a particular key exists in Hashtable use
		      boolean containsKey(Object key) method of Hashtable class.
		      It returns true if the Hashtable contains mapping for specified key
		      otherwise false.
		    */
		   
		    boolean b1 = ht.containsKey("2");
		    System.out.println("2 exists in Hashtable ? : " + b1);
		  }
		
	}


