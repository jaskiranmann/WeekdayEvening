package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtil {
	
	public static WebDriver driver = null;
	
	/***
	 * This method is used to open the browsers based on auguments passed while calling method
	 * @param browserName
	 * @return
	 * @Usage - launchBrowser("Chrome")
	 * @param - Chrome/IE/Firefox
	 */
	
	public WebDriver launchBrowser(String browserName) {
		//opens the browser based on arguments
		if (browserName.equalsIgnoreCase("Chrome")) { //open chrome
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if(browserName.equalsIgnoreCase("IE")) { //open IE
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("ignoreZoomSetting", true);
			
			WebDriverManager.iedriver().setup();
			//driver = new InternetExplorerDriver();
			driver = new InternetExplorerDriver(caps);

		} else if(browserName.equalsIgnoreCase("Firefox")){ //open firefox
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		} else {
			System.out.println("Browser name is not matching");
		}
		//Implicitwait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize(); //maximize the browser
		return driver;
	}
	
	//method overloading concept -- polymorphisam (compile time)
	
	//passing string --> SelectByVisibleText or SelectByValue
	
	/***
	 * To select the value from drop down based on element details passed and string value passed
	 * @param elementDetails
	 * @param value
	 */
	
	public void SelectValueFromDropDown(WebElement elementDetails,String value) {
		Select s = new Select(elementDetails);
		s.selectByVisibleText(value);
	}
	//passing integer
	

	/***
	 * To select the value from drop down based on element details passed and integer value passed
	 * @param elementDetails
	 * @param value
	 */
	public void SelectValueFromDropDown(WebElement elementDetails,int value) {
		Select s = new Select(elementDetails);
		s.selectByIndex(value);
	}

}
