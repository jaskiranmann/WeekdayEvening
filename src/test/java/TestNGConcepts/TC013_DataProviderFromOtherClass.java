package TestNGConcepts;

import org.testng.annotations.Test;

import DataProviderUtil.DataProviderTest;

public class TC013_DataProviderFromOtherClass {
	
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "getdata")//step 3
	public void customerDetailsTest(String firstName, String LastName, String EmailAddress, String PhnNo,
			String Course) {

		System.out.println("First Name Is ****+*****" + firstName);
		System.out.println("Last Name Is *****+****" + LastName);
		System.out.println("Email Id Is *****+****" + EmailAddress);
		System.out.println("Phone Number Is *****+****" + PhnNo);
		System.out.println("Course Name Is *****+****" + Course);

}
}