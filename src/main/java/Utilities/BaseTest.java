package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	public void openApplication() {
		
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("./Config/Application.properties");
			prop.load(fis); //to load the properties file
			String browserName = prop.getProperty("browsername"); //to capture the browsername from properties files
			//chrome browser
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
			driver.manage().deleteAllCookies(); //delete all cookies
			driver.manage().window().maximize(); //maximise the browser
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//synchronization time
			driver.get(prop.getProperty("url"));//opening application
		}
			catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	

}
}
