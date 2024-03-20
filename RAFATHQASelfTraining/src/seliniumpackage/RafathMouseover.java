package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RafathMouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		ChromeDriver browserObject = new ChromeDriver();
	browserObject .get("https://www.amazon.com/");
		Thread.sleep(6000);
		WebElement element= browserObject.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
Actions action= new Actions(browserObject);
System.out.println("mouse is over the -Hello SIGN IN");
		action.moveToElement(element).build().perform();
Thread.sleep(6000);
browserObject.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[1]/span")).click();

	}

}
