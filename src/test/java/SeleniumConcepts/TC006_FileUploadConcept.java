package SeleniumConcepts;

import org.openqa.selenium.By;

import Utilities.BaseUtil;

public class TC006_FileUploadConcept extends BaseUtil{

	public static void main(String[] args) throws InterruptedException {
		
		BaseUtil b = new BaseUtil();
		b.launchBrowser("Chrome");
		
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(4000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Training\\Selenium\\FileUpload.txt");
		//driver.findElement(By.xpath("//*[@id='file-upload']")).click();
		driver.findElement(By.id("file-submit")).click();
		String message = driver.findElement(By.xpath("//*[@id=\'content\']/div/h3")).getText();
		System.out.println(message);
		
		if (message.equalsIgnoreCase("File Uploaded!")) {
			System.out.println("Successful");
			driver.close();
		} else {
			System.out.println("unsuccessful");
		}
		
	}

}
