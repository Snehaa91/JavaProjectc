package OOPsConcept;

public class Inheritance {
	
	public Inheritance(){
		System.out.println("Constructor");
	}
	
	private void method1() {
		System.out.println("PrivateMethod");
	}
	
	public void Parentmethod() {
		System.out.println("ParentMethod");
	}
	
}
	
class NewClass extends Inheritance{
	 
	public void Childmethod() {
		System.out.println("ChildMethod");
	}
	
    }
