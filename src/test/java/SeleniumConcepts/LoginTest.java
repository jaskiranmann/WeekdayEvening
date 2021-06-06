package SeleniumConcepts;

import org.openqa.selenium.By;

import Utilities.BaseUtil;

public class LoginTest extends BaseUtil{

	public static void main(String[] args) {
		//7. launch browser
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu");
		
		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.xpath("//button[@type='submit']");
		
		//8. creating reference for CommonUtils.java
		
		CommonUtils cu = new CommonUtils(driver);
		
		//9. enter login credentials
		//cu.getElement(username).sendKeys("jaskiranmann");
		//cu.getElement(password).sendKeys("Jaskiran@92");
		//cu.getElement(loginBtn).click();
		
		//13.
		
		cu.enterValuesInInputFields(username, "jaskiranmann");
		cu.enterValuesInInputFields(password, "Jaskiran@92");
		cu.performClick(loginBtn);
	}

}
