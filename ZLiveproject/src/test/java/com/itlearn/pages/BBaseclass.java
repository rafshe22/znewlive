package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.itlearn.utilities.BBrowserfactory;
import com.itlearn.utilities.CConfigdataprovider;
import com.itlearn.utilities.RReadexcelfile;

public class BBaseclass {
	
	public WebDriver driver;
	CConfigdataprovider zz=new CConfigdataprovider();
	RReadexcelfile kk= new RReadexcelfile();
	
	@BeforeClass
	public void setup() {
	driver=BBrowserfactory.startApplication(driver, zz.getbrowser(), zz.geturl());
		
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.close();
//	}
}
