package TestNGConcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//to run the same test with multiple sets of data
public class TC012_DataProviderConcept {
	
	
	//step2
	@Test(dataProvider = "getdata")//step 3
	public void customerDetailsTest(String firstName, String LastName, String EmailAddress, String PhnNo,
			String Course) {

		System.out.println("First Name Is *********" + firstName);
		System.out.println("Last Name Is *********" + LastName);
		System.out.println("Email Id Is *********" + EmailAddress);
		System.out.println("Phone Number Is *********" + PhnNo);
		System.out.println("Course Name Is *********" + Course);
	}
//Step1
	@DataProvider
	public Object[][] getdata() {

		Object details[][] = new Object[2][5];
		// Customer1
		details[0][0] = "Jaskiran";
		details[0][1] = "Mann";
		details[0][2] = "jaskiran.mann1@gmail.com";
		details[0][3] = "6477166792";
		details[0][4] = "selenium";

		// Customer 2
		details[1][0] = "Lovepreet";
		details[1][1] = "Singh";
		details[1][2] = "singhlovey91@gmail.com";
		details[1][3] = "6472829307";
		details[1][4] = "testing";

		return details;
	}

}
