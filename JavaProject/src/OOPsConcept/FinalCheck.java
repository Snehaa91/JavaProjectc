package OOPsConcept;

public class FinalCheck {
	
	final int x = 20;
	final String name;
	
	FinalCheck(String name){
		this.name= name;
		System.out.println(x);
	}
	
	void run() {
		int x= 10;
		x = x+20;
		System.out.println(x);
		System.out.println(name);
	}
	
	

}
