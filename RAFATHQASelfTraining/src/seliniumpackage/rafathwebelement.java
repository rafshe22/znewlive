package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rafathwebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject= new ChromeDriver();
		// 3. Open login page of https://admin-demo.nopcommerce.com/login
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	       WebElement email = browserObject.findElement(By.name("Email"));
		   email .clear();
		   email.sendKeys("admin@yourstore.com");
		WebElement password=browserObject.findElement(By.name("Password"));
		password.clear();
		password.sendKeys("admin");
		WebElement login=browserObject.findElement(By.className("button-1"));
		login.click();
	}

}
