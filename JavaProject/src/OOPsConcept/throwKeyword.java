package OOPsConcept;

public class throwKeyword {
	
	int age = 17;
			
	public void agemethod() {
	
	try {
	if (age<18) {
		throw new AgeException("You are not eligible"); //we are deliberately throwing a user defined exception
	}
	
	else {
		System.out.println("Thankyou for Voting");
	}
	}
	catch (AgeException e) {
		e.printStackTrace();
		System.out.println("Voting not done");
	}
	
	
	

}
}
