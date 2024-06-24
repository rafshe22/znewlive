
package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver2.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.name("name")).sendKeys("Rafath");
	        browserObject.findElement(By.name("email")).sendKeys("rafshe22@yahoo.com");
	        
	        browserObject.findElement(By.name("website")).sendKeys("www.itlearn360.com");
	        browserObject.findElement(By.name("comment")).sendKeys("learning wesite five star");
	        browserObject.findElement(By.name("submit")).click();
	}
	}