package com.itlearn.pages;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.itlearn.utilities.BBrowserfactory;
import com.itlearn.utilities.CConfigdataprovider;

public class BBaseclass {

	
	
	 WebDriver driver;
	CConfigdataprovider zz= new CConfigdataprovider();
	
	@BeforeClass
	public void setup(){
	driver=BBrowserfactory.startApplication(driver ,zz.getbrowser(), zz.geturl());
		}

	
	
	//@AfterClass
//public void teardown(){  }
}

