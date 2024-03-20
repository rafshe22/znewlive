package seliniumpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rafathexplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		ChromeDriver browserObject=new ChromeDriver();
		WebDriverWait Wait= new WebDriverWait(browserObject,Duration.ofSeconds(10));
		browserObject.get("http://google.com");
		WebElement gmailLink;
	gmailLink = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")));
    gmailLink.click();
browserObject.quit();
	
    	
		
		
		
		
		
		
		
	}

}
