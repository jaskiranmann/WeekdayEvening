package parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {
	
WebDriver driver;
	
	By SignupBtn = By.linkText("Sign Up");
	By loginSSOLink = By.linkText("Log in with SSO");
	
	@BeforeMethod
	@Parameters({"url"})
	public void setup(String url) {
		WebDriverManager.chromedriver().setup(); //setup
		driver = new ChromeDriver(); //launch browser
		driver.manage().deleteAllCookies(); //delete all cookies
		driver.manage().window().maximize(); //maximise the browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Test
	public void verifySignUpBtn() {
		Assert.assertTrue(driver.findElement(SignupBtn).isDisplayed());
	}
	
	@Test
	public void verifySSOLink() {
		Assert.assertTrue(driver.findElement(loginSSOLink).isDisplayed());
	}
	
	@AfterMethod
	public void closeApplication() {
		driver.quit();
	}
}
