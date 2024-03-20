package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rafathdraganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		ChromeDriver browserobject= new ChromeDriver();
		browserobject.get("http://jqueryui.com/droppable/");
		browserobject.switchTo().frame(0);
		WebElement source=browserobject.findElement(By.xpath("//*[@id='draggable']"));
			WebElement target=browserobject.findElement(By.xpath("//*[@id='droppable']"));
					Thread.sleep(6000);
					Actions act=new Actions (browserobject); 
					 act.dragAndDrop(source, target).build().perform();
		
		browserobject.close();
		
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
