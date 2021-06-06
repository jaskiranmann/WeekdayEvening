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

public class LoginTest {
	
	WebDriver driver;
	
	By username = By.id("username");
	By password = By.id("password");
	By loginBtn = By.xpath("//*[@id=\"sign_in_form\"]/fieldset/div/div[5]/button");
	By SignupLnk = By.linkText("Sign Up");
	
	By dashBoard = By.linkText("Dashboard");
	
	String expTitle = "Log in to your account";
	
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
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test
	public void signupLinkTest() {
		
		Assert.assertTrue(driver.findElement(SignupLnk).isDisplayed());
				
	}
	
	@Test
	public void pageTitleTest() {
		
		String appTitle = driver.getTitle();
		System.out.println(appTitle);
		Assert.assertEquals(appTitle, expTitle);
		
	}
	
	@Test
	public void loginTest() {
		
		driver.findElement(username).sendKeys("Jaskiranmann");
		driver.findElement(password).sendKeys("Jaskiran@92");
		driver.findElement(loginBtn).click();
		String actVal = driver.findElement(dashBoard).getText();
		String expVal = "Dashboard";
		Assert.assertEquals(actVal, expVal);
		
	}

}
