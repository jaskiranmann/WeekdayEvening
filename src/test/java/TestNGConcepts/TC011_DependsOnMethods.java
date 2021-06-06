package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC011_DependsOnMethods {
	
	@Test(priority = 1)
	public void loginTest() {
		System.out.println("Login Test");
		Assert.assertEquals("book", "book tickets");
		
	}
	@Test(priority = 2, dependsOnMethods="loginTest")
	public void BookTickets() {
		System.out.println("Book tickets");
		Assert.assertTrue(false);
		
		
	}
	@Test(priority = 3, dependsOnMethods= {"loginTest","BookTickets"})
	public void logout() {
		
		System.out.println("logout");
	}

}
