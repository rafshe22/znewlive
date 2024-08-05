package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LLoginpage {
	
	
	WebDriver Driver;
	
	public LLoginpage(WebDriver driver) {

		Driver=driver;
PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//*[@id=\"loginlabel\"]") WebElement loginclick;
	@FindBy(id="user_login")WebElement user;
	@FindBy(id="user_pass")WebElement pass;
	@FindBy(id="wp-submit")WebElement submitclick;
	
@FindBy(xpath="//*[@id=\"gk-login-toggle\"]/i") WebElement logoutimage;
	
	@FindBy(xpath="//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a") WebElement logoutclick;
	
	public void login(String username, String password) {
		
		loginclick.click();
		user.sendKeys(username);
		pass.sendKeys(password);
		submitclick.click();
	}



public void logout()
{
	logoutimage.click();
	logoutclick.click();
}





}




