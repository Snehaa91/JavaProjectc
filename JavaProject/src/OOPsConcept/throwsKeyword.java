package OOPsConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class throwsKeyword{
	
	public void ReadFile() throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream(":d//abc.txt");
	}
}

class checkthrowsKeyword{
	
	public void Read() {
	throwsKeyword obj = new throwsKeyword();
	try {
		obj.ReadFile();
	} 
	catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	System.out.println("Code ran");
	}

}



