package SeleniumConcepts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.BaseUtil;

public class TC002_WorkingWithLinks extends BaseUtil {

	public static void main(String[] args) {
		
		BaseUtil b = new BaseUtil();
		b.launchBrowser("chrome");
		
		driver.get("https://www.facebook.com/");
		
		//clicking on link
		//driver.findElement(By.linkText("Forgot Password?")).click();
		//String abc = driver.findElement(By.linkText("Forgot Password?")).getText();
		//System.out.println(abc.isEmpty());
		//System.out.println(!abc.isEmpty());
		
		//count the number of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksize= links.size();
		System.out.println(links.size());
		
		//print all the link names
		for (int i = 0; i <linksize ; i++) {
			String linkName = links.get(i).getText();
			//System.out.println(linkName);
		
		
		//print all the link names that are not empty
		if (!(linkName.isEmpty())) {
			String linkWithName = links.get(i).getText();
			System.out.println(linkWithName);
		}
		}
	}
}
