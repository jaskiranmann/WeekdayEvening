package TestNGConcepts;
// No main method in testng
//every line should be written inside methods
//@Test is specifically to execute any test

import org.testng.annotations.Test;

public class TC001_DisplayMessages {
	
	@Test
	public void displayMessage() {
		System.out.println("We are learning Testng");
	}
	
	@Test
	public void displayName() {
		System.out.println("Jaskiran Kaur Mann");
	}
}
