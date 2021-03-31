package OOPsConcept;

public class StaticCheck3 {
	
	int i = 10;
	void display() {
		System.out.println("instance method");
	}
	
	static void display1() {
		System.out.println("static method");
	}
	
}

class xyz extends StaticCheck3{
	
	  void show() { //static method can not have super keyword
		System.out.println(super.i);
	}
	
}
