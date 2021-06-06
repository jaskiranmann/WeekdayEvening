package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.BaseUtil;

public class TC001_WorkingWithInputFields extends BaseUtil{

	public static void main(String[] args) {
	
		BaseUtil bu = new BaseUtil();
		bu.launchBrowser("Chrome");
		
		//lauch application
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu/");
		
		//Identifying elements
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Jaskiranmann");
		driver.findElement(By.id("password")).sendKeys("Jaskiran@92");
		
		//capture the value in input field
		String uservalue = userName.getAttribute("value"); //is to capture the value during runtime
		System.out.println(uservalue);
		
	}

}
