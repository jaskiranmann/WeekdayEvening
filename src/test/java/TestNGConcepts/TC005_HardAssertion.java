package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC005_HardAssertion {
	
	String course1 = "Selenium", course2 = "Selenium";
	int no1 = 5, no2 = 5;
	boolean status1 = true, status2= true;
	
	@Test(priority = 1)
	public void verifyValUsingAssetion() {
		
		Assert.assertEquals(course1, course2);
		Assert.assertEquals(no1, no2);
		Assert.assertEquals(status1, status2);
		//Assert.assertTrue(false, "*****************Button is missing*******************");
		Assert.assertTrue(true, "*****************Button is present*******************");
	}
	@Test(priority = 2)
	public void displayMessage() {
		
		System.out.println("Jaskiran");
	}

}
