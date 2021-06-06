package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import Utilities.BaseUtil;

public class TC007_WorlingWithAlertsOrPopups extends BaseUtil {

	public static void main(String[] args) throws InterruptedException {
		
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		
		driver.get("http://www.popuptest.com/");
		
		Set<String> winIds = driver.getWindowHandles();
		System.out.println(winIds.size());
		
		Iterator<String> itr = winIds.iterator();
		System.out.println(itr.next());//to print the unique ids for windows
		
		//clicking on multi link
		driver.findElement(By.linkText("Multi-Popup Test #2")).click();
		Thread.sleep(4000);
		
		winIds = driver.getWindowHandles();
		System.out.println(winIds.size());
		
		if (winIds.size()>1) {
			itr = winIds.iterator();
			String mainwindow = itr.next();
			String secondwindow = itr.next();
			String thirdwindow = itr.next();
			
			driver.switchTo().window("thirdwindow");
			driver.close(); //will close only the browser where latest selenium instance is existing
			
			driver.quit(); //will close all the windows
		}

	}

}
