package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC006_SoftAssertionConcept {
	
	String course1 = "Selenium", course2 = "Selenium";
	//int no1 = 5, no2 = 10;
	int no1 = 5, no2 = 5;
	boolean status1 = true, status2= true;
	
	@Test(priority = 1)
	public void verifyValUsingAssetion() {
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(course1, course2);
		sa.assertEquals(no1, no2);
		System.out.println("*******************continued*************************");
		sa.assertEquals(status1, status2);
		sa.assertAll();
	}

}
