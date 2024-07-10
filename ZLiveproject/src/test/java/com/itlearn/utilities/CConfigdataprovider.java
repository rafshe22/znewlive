package com.itlearn.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class CConfigdataprovider {
	
	
	
	Properties pro;
	
	public CConfigdataprovider(){
		
		File dd=new File("./Confrigation/CConfig.properties");
		
		try {
			FileInputStream zz = new FileInputStream(dd);
			pro=new Properties();
			pro.load(zz);
			
			
			
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("file is not found");
		}	
		
	}

	public String getbrowser() {
		
		return pro.getProperty("browser");
	}
	
	
	public String geturl() {
		
		return pro.getProperty("url");
		
	}
	
	
	
}

