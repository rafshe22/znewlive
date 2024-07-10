package com.itlearn.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.BBaseclass;

import com.itlearn.pages.LLoginpage;

import com.itlearn.utilities.RReadexcelfile;

public class LLogindataprovider extends BBaseclass {
	
	
	String filename=System.getProperty("user.dir")+"\\TestData\\loginData.xlsx";
	@Test(dataProvider="LLoginDataprovider")
	public void loginverify(String username ,String password) {
		
		
		LLoginpage ww=new LLoginpage(driver);
		
		ww.login(username,password);
		
		ww.Logout();
		
		}
		
	
	
	
	
	
	
	
	@DataProvider
	public String [][] LLoginDataprovider() {
		
		
	
	int zzrows=RReadexcelfile.getrowcount(filename, "login");
	System.out.println(zzrows);
	int zzcolumns=RReadexcelfile.getcolcount(filename,"login");
	System.out.println(zzcolumns);
			
		
			
			String Data [][]=new String[zzrows-1][zzcolumns];
			
			for(int i=1;i<zzrows;i++) {
				
				for(int j=0;j<zzcolumns;j++) 
					
				{
					
				Data[i-1][j]=RReadexcelfile.getcellvalue(filename, "loginData", i, j);
					
					
				}
			}
				return Data;
			}
			
			
			
}
				
				
	
	
	
		

		
		
			
	

			
			
	
	


