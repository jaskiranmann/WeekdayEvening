package TestNGConcepts;

import org.testng.annotations.Test;

public class TC010_InvocationCountConcept {
	
	
	@Test(invocationCount =10)
	public void loginTest() {
		
		System.out.println("Login Test");
	}

}
