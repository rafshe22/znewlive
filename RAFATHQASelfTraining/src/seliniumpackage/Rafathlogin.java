package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rafathlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	        browserObject.findElement(By.name("Email")).clear();
		    browserObject.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		    browserObject.findElement(By.name("password")).clear();
		    browserObject.findElement(By.name("password")).sendKeys("admin");
		  browserObject.findElement(By.className("button-1")).click();
		}

}
