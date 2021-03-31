package OOPsConcept;

public interface InterfaceCheck {
	
	void run();
}

abstract class okay implements InterfaceCheck{
	
	public void run() {
		System.out.println("run method");
	}
	
	abstract void walk();
	
	void sleep() {
		System.out.println("sleep method");
	}
}

class notokay extends okay{
	void walk() {
		System.out.println("walk method");
	}
	
	public void run() {
		System.out.println("overrided method");
	}
	
	public void notokaymethod() {
		System.out.println("notokaymethod");
	}
}


