package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rafathradiobutton10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 // 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver  browserObject = new ChromeDriver();
	    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		    browserObject.findElement(By.name("name")).sendKeys("Rafath Sheriff");
		browserObject.findElement(By.name("email")).sendKeys("rafshe22@yahoo.com");
		browserObject.findElement(By.name("website")).sendKeys("www.itlearn360.com");
		browserObject.findElement(By.name("comment")).sendKeys("this web site is five star");
		browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
		browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
		browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
		browserObject.findElement(By.xpath("/html/body/form/input[10]")).click();
		browserObject.findElement(By.name("submit")).click();
		
	
		
	}

}
