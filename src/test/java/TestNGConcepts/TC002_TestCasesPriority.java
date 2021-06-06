package TestNGConcepts;

import org.testng.annotations.Test;

public class TC002_TestCasesPriority {

	//login
	@Test(priority = 1)
	public void login() {
		System.out.println("Login into application");
	}
	
	//book tickets
	@Test(priority = 2)
	public void bookTickets() {
		System.out.println("Book Tickets");
	}
	
	//logout
	@Test(priority = 3)
	public void logout() {
		System.out.println("logout");
	}
}
