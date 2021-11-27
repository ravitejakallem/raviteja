package javabasics.com;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class SetViewKeyHashTable {

	public static void main(String[] args) {
	
	    //create Hashtable object
	    Hashtable ht = new Hashtable();
	   
	    //add key value pairs to Hashtable
	    ht.put("1","One");
	    ht.put("2","Two");
	    ht.put("3","Three");
	    
	    Set st = ht.keySet();
	    
	    System.out.println("Set created from Hashtable Keys contains :");
	    //iterate through the Set of keys
	    Iterator itr = st.iterator();
	    while(itr.hasNext())
	      System.out.println(itr.next());

}

}
