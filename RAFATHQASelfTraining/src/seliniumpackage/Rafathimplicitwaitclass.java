package seliniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v119.domsnapshot.model.StringIndex;

public class Rafathimplicitwaitclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		ChromeDriver browserObject=new ChromeDriver();
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		String eTitle="Google";
		browserObject.get("https://www.google.com/");
		browserObject.manage().window().maximize();
		String atitle= browserObject.getTitle();
		if(atitle.equals(eTitle))
		{System.out.println(" test passed");}
		else
		{System.out.println("test failed");}
	browserObject.close();
		
		
		
		
	
	}
}
		
		
		
		
		
		
		