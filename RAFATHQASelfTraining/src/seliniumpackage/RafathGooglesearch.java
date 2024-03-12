package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RafathGooglesearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
	    // 2. Initialize Webdriver object through ChromeDriver class.
	  ChromeDriver  browserObject = new ChromeDriver();
	    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
	    browserObject.get("https://www.google.com/");
	    browserObject.findElement(By.name("q")).sendKeys("spring pictures");
		browserObject.findElement(By.name("btnK")).submit();
		browserObject.close();
	}

}
