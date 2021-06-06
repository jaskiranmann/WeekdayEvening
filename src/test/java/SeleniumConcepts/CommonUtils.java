package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtils {

	//1. Define web driver here
	WebDriver driver;
	
	//2. creating constructor
	public CommonUtils(WebDriver driver) {
		//3. here passing local variable to constructor class
		this.driver = driver;
	}
	
	//4. create generic method for all WebElements
	//wrapper
	public WebElement getElement(By locator) {
		//5. 
		WebElement element = driver.findElement(locator);
		//6. returning element from the method to use it in someother place
		return element;
	}
	
	//11. method to click on button
	/***
	 * this method can be used when we want to click on any button
	 * @param locator
	 */
	public void performClick(By locator) {
		try {
			getElement(locator).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Some expection occured while clicking on an element");
		}
	}
	//12. enter values in input field
	/***
	 * this method is used when we want to enter values in input field
	 * @param locator
	 * @param value
	 */
	public void enterValuesInInputFields(By locator, String value) {
		try {
			getElement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("some exception while entering value in input field");
		}
	}
}
