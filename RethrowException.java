package javabasics.com;

public class RethrowException {


		public static void main(String[] args) {
			String name = null;

			 

	        try {
	            name.equals("Ravi"); // causes NullPointerException
	        } 
	        catch (NullPointerException e) {
	           throw e;
	        }


		}

	

	}


