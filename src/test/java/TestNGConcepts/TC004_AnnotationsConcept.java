package TestNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC004_AnnotationsConcept {
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After class");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before method");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After method");
		
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test");
		
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After test");
	}
	
	@Test
	public void bookTickets() {
		
		System.out.println("Booking tickets");
		
	}
	
	@Test
	public void cancelTickets() {
		
		System.out.println("Cancelling Tickets");
		
	}

}
