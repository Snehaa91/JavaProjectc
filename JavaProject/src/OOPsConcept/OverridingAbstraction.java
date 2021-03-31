package OOPsConcept;

abstract class OverridingAbstraction { //abstract class ka object nhi bna skte

	OverridingAbstraction(){
		System.out.println("Constructor method");
	}
	
	static void showme3() {
		System.out.println("Static method");
	}
	abstract void display();
	
	private void showme() {
	System.out.println("private method");
	}
	
	final void showme2() {
		System.out.println("final method");
	}
	
	void show() {
		System.out.println("show 1 method");
	}
}
	
class ChildCheck extends OverridingAbstraction {
	
	void display(){
		System.out.println("overriding method for abstract method");
	}
	
	void show() {
		System.out.println("show 2 method");
	}

	 }

