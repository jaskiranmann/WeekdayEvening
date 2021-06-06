package TestNGConcepts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.BaseUtil;

public class TC003_LoginIntoSurveyMonkeyApplication extends BaseUtil{
	
	BaseUtil b = new BaseUtil();
	
	By username = By.id("username");
	By password = By.id("password");
	By loginBtn = By.xpath("//*[@id=\"sign_in_form\"]/fieldset/div/div[5]/button");
	By dashBoard = By.linkText("Dashboard");
	
	@Test(priority = 1)
	public void invokeApllication() {
		
		b.launchBrowser("Chrome");
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		
	}
	@Test(priority = 2)
	public void loginIntoApplication() throws InterruptedException {
		
		driver.findElement(username).sendKeys("Jaskiranmann");
		driver.findElement(password).sendKeys("Jaskiran@92");
		driver.findElement(loginBtn).click();
		
		//verify login
		String actVal = driver.findElement(dashBoard).getText();
		String expVal = "Dashboard";
		Thread.sleep(5000);
		
		Assert.assertEquals(actVal, expVal);
		
//		if (actVal.equalsIgnoreCase(expVal)) {
//			System.out.println("login Successful");
//		} else {
//			System.out.println("login failed");
//		}
	}
	@Test(priority = 3)
	public void logoutApplication() {
		driver.quit();
	}

}
