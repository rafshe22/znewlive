package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver1.exe");
		ChromeDriver obj= new ChromeDriver();
		
		obj.get("https://www.google.com");
		
		WebElement gmailtxt= obj.findElement(By.linkText("Gmail"));
		
		
		if(gmailtxt.isDisplayed())
		{
			System.out.println("The element is link");
		}
		else
		{
			System.out.println("The element is not link");
		}
	}

}
