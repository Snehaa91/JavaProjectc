package OOPsConcept;

public class FinallyBlock {

public void run() {
	try {
		int a = 200;
		int b = 20;
		int c =a/b; //here exception is going to occur
		System.out.println(c);
	}
	
	finally {
		System.out.println("Inside Finally block");
	}
	
	System.out.println("Outside try & Finally block");
}

}
