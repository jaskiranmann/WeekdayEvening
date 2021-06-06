package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import Utilities.BaseUtil;

public class TC005_WorkingWithAlertsOrPopups extends BaseUtil {

	public static void main(String[] args) throws InterruptedException {
		
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertmessage = alert.getText();
		System.out.println(alertmessage);
		Thread.sleep(4000);
		//click on ok button in alert
		
		//alert.accept(); //to click on ok button
		alert.dismiss(); //to click on cancel button in alert
	}

}
