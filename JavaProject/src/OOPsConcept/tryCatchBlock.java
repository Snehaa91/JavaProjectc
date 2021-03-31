package OOPsConcept;

public class tryCatchBlock {

	public void run() {

		try {
			int a = 200;
			int b = 0;
			//System.out.println("New line");
			int c = a / b;
			//System.out.println(c);
		}
		
		catch (ArithmeticException e) {
			//System.out.println(e);
			System.out.println(e.toString());
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			
		}

		
		catch(Exception e1) {
			  System.out.println("Exception Class"); 
	     }

		
		  
		 

	}
}
