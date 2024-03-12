package seliniumpackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rafathlinktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");

ChromeDriver obj= new ChromeDriver();

obj.get("https://www.google.com");

WebElement gmailtxt= obj.findElement(By.linkText("Gmail"));


if(gmailtxt.isDisplayed())
{
System.out.println("the element is link");	
}

else
{
System.out.println("the element is not link");
}

	}

}



